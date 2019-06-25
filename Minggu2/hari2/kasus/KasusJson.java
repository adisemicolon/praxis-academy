import java.io.FileReader;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class KasusJson{
	public static void main(String[] args) {
		JSONParser jp = new JSONParser();

		try{
			Object object = jp.parse(new FileReader("mahasiswa.json"));
			JSONObject jso = (JSONObject) object;

			JSONObject mahasiswa = (JSONObject) jso.get("mahasiswa");

			String nama = (String) mahasiswa.get("nama");
			String nim = (String) mahasiswa.get("nim");
			System.out.println("Nama: "+nama);
			System.out.println("Nim: "+nim);
		}catch (Exception e) {
            System.out.println(e.getMessage());
        }
	}
}