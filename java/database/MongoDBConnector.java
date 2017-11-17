/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;

import java.net.URL;
import java.net.UnknownHostException;
import java.util.Properties;

import statics.AppData;
import org.bson.types.ObjectId;

/**
 *
 * @author Do Hung Cuong
 */
public class MongoDBConnector {
    
    public static String DATABASE;;
    public static String DATABASE_HOST;
	
	private Properties cfgProperties;
	private URL url;

	public MongoDBConnector() {
		loadConfig();
	}

	private void loadConfig() {
		try {
			// load config from database.properties
			cfgProperties = new Properties();
			url = AppData.class.getClassLoader().getResource("database.properties");
			cfgProperties.load(url.openStream());

			DATABASE_HOST = cfgProperties.getProperty("host");
			DATABASE = cfgProperties.getProperty("database");
		} catch (Exception e) {

		}
	}

    public static final DBCollection createConnection(String collectionName) throws UnknownHostException {
    	MongoClient mongoClient = new MongoClient(new MongoClientURI(DATABASE_HOST));
        DB db = mongoClient.getDB(DATABASE);
        return db.getCollection(collectionName);
    }

    public static final void updateOne(String collectionName, String originalfield, String value, String updatefield, String updatevalue) throws UnknownHostException {
        if (originalfield.equals("id")) {
            createConnection(collectionName).update(
                    new BasicDBObject("_id", new ObjectId(value)),
                    new BasicDBObject("$set", new BasicDBObject(updatefield, updatevalue))
            );
        } else {
            createConnection(collectionName).update(
                    new BasicDBObject(originalfield, value),
                    new BasicDBObject("$set", new BasicDBObject(updatefield, updatevalue))
            );
        }
    }

}
