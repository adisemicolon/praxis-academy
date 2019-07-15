package tes.db;

import static com.mongodb.client.model.Filters.*;
import static com.mongodb.client.model.Updates.*;


public class Test{
	// @BsonProperty("id") 
	public String id;
	// @BsonProperty("name") 
	public String name;
    // @BsonProperty("nim") 
    public String nim;

    public Test() {
    }

    public Test(String id, String name) {
        this.id = id;
        this.name = name;
        //this.nim = nim;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    @Override
    public String toString() {
        return "Test{" + "id= "+ id +
                "name='" + name + '\'' +
                ", nim=" + nim +
                '}';
    }
}