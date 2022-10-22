package app;

import java.util.Arrays;

import com.mongodb.MongoBulkWriteException;
import com.mongodb.client.MongoClient;

import dao.ProductDao;
import db.DBConnection;
import entity.Product;

public class App {
	private static final String DB_NAME = "BikeStores";

	public static void main(String[] args) {
		MongoClient mongoClient = DBConnection.getInstance().getMongoClient();
		ProductDao productDao = new ProductDao(mongoClient, DB_NAME);
		
//		Product product = productDao.getProductById(21110l);
//		System.out.println(product);
		
		
		
		productDao.getProductsBad().forEach(p -> System.out.println(p));
//		productDao.getProductsMax().forEach(p -> System.out.println(p));
		
//		try {
//			int n = productDao.addProdcuts(Arrays.asList(
//
//					new Product(11110l, "product name 1","Song Hong", "Gao", Arrays.asList("White"), 20000, 2022),
//					new Product(21110l, "product name 2","Song Hong", "Gao nep", Arrays.asList("White"), 25000, 2022)
//					));
//
//			System.out.println(n);
//		}catch (MongoBulkWriteException e) {
//			System.out.println("Trung khoa");
//		}
	}
}
