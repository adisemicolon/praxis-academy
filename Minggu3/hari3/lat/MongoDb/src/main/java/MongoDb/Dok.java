package MongoDb;

import com.mongodb.client.FindIterable; 
import com.mongodb.client.MongoCollection; 
import com.mongodb.client.MongoDatabase; 
import com.mongodb.DBCursor;  

import java.util.Iterator; 
import org.bson.Document; 
import com.mongodb.MongoClient; 
import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.DB;

public class Dok{
			MongoClient mongo = new MongoClient();
	  		MongoDatabase database = mongo.getDatabase("mydb");  
     		MongoCollection<Document> collection = database.getCollection("test"); 
      		FindIterable<Document> iterDoc = collection.find(); 
		public void start(){
      	for (Document doc: iterDoc) {
      		System.out.print(doc.get("_id"));
      		System.out.print(" -> ");
      		System.out.println(doc.get("nama"));
      		}
		} 
	 
}