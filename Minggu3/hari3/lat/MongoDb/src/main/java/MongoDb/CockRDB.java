package MongoDb;
import org.postgresql.ds.PGSimpleDataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class CockRDB{
	public static Connection getCockroachClient(){
		if (cockroachClient == null){
			try{
				PGSimpleDataSource ds = new PGSimpleDataSource();
				ds.setServerName("localhost");
				ds.setPortNumber(26257);
				ds.setDatabaseName("test");
				ds.setUser("adi");
				ds.setPassword(null);
				cockroachClient = ds.getConnection();
			}catch(SQLException e){}
		}
		return cockroachClient;
	}
}