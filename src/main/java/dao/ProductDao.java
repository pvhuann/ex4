package dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.bson.Document;
import org.bson.codecs.configuration.CodecRegistries;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;

import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;
import com.mongodb.client.result.InsertManyResult;

import entity.Product;

public class ProductDao {
	
	private MongoCollection<Product> proCol;
	
	public ProductDao(MongoClient mongoClient, String dbName) {
		
		PojoCodecProvider pojoCodecProvider = PojoCodecProvider.builder().automatic(true).build();
		CodecRegistry codecRegistry = CodecRegistries.fromRegistries(MongoClientSettings.getDefaultCodecRegistry(), CodecRegistries.fromProviders(pojoCodecProvider));
		
		proCol = mongoClient.getDatabase(dbName).getCollection("products", Product.class).withCodecRegistry(codecRegistry);
		
	}
	
	public int addProdcuts(List<Product> products) {
		InsertManyResult result = proCol.insertMany(products);
		
		return result.getInsertedIds().size();
	}
	
//	 db.products.find({_id:11110})
	
	public Product getProductById(long productId) {
		return proCol.find(Filters.eq("_id", productId)).first();
	}
	
//	db.products.aggregate([{$group:{_id:null, products:{$push:"$$ROOT"},max:{$max:'$price'}}},
//	{$unwind:'$products'},
//	{$match:{$expr:{$eq:["$max","$products.price"]}}},
//	{$replaceWith:'$products'}]).pretty()
	
	public List<Product> getProductsMax() {
		return proCol.aggregate(Arrays.asList(
					Document.parse("{$group:{_id:null, products:{$push:\"$$ROOT\"},max:{$max:'$price'}}}"),
					Document.parse("{$unwind:'$products'}"),
					Document.parse("{$match:{$expr:{$eq:[\"$max\",\"$products.price\"]}}}"),
					Document.parse("{$replaceWith:'$products'}")
				)).into(new ArrayList<>()) ;
	}
	
	
//	db.products.aggregate([{$lookup:{from:'orders', localField:'_id', foreignField:'order_details.product_id', as:'rs'}},
//	{$match:{rs:{$size:0}}},
//	{$unset:'rs'}]).pretty()
	
	public List<Product> getProductsBad() {
		return proCol.aggregate(Arrays.asList(
					Document.parse("{$lookup:{from:'orders', localField:'_id', foreignField:'order_details.product_id', as:'rs'}}"),
					Document.parse("{$match:{rs:{$size:0}}}"),
					Document.parse("{$unset:'rs'}")
				)).into(new ArrayList<>()) ;
	}
	
}
