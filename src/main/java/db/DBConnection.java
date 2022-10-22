package db;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;

public class DBConnection {
	
	private static DBConnection instance;
	private MongoClient mongoClient;
	
	private DBConnection() {
		mongoClient = MongoClients.create(); //localhost 27017
	}
	
	public synchronized static DBConnection getInstance() {
		if(instance == null)
			instance = new DBConnection();
		
		return instance;
	}
	
	public MongoClient getMongoClient() {
		return mongoClient;
	}
}
