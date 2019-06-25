import org.json.JSONTokener;
import org.json.JSONObject;
import org.json.JSONArray;

class JsonDecodeDemo {

   public static void main(String[] args) {
      
	String s = "[0,{\"1\":{\"2\":{\"3\":{\"4\":[5,{\"6\":7}]}}}}]";

      	JSONTokener token = new JSONTokener(s);
	JSONArray anu = new JSONArray(token);

         System.out.println("The 2nd element of array");
         System.out.println(anu.get(1));
         System.out.println();

         JSONObject token2 = (JSONObject)anu.get(1);
         System.out.println("Field \"1\"");
         System.out.println(token2.get("1")); 


         s = "{}";
         JSONObject anu2 = new JSONObject(s);
         System.out.println(anu2);

         s = "[5,]";
         anu = new JSONArray(s);
         System.out.println(anu);

         s = "[5,2]";
         anu = new JSONArray(s);
         System.out.println(anu);

         
      }
}