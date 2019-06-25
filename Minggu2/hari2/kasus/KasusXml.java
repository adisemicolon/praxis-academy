import java.io.File;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

public class KasusXml {

   public static void main(String[] args) {

      try {
         File inputFile = new File("mahasiswa.xml");
         DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
         DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
         Document doc = dBuilder.parse(inputFile);
         NodeList nList = doc.getElementsByTagName("mahasiswa");
         System.out.println("----------------------------");
         
       for (int temp = 0; temp < nList.getLength(); temp++) {
            Node nNode = nList.item(temp);
            Element eElement = (Element) nNode;
            System.out.println("Nama : " + eElement.getElementsByTagName("nama").item(0).getTextContent());
            System.out.println("Nim  : " + eElement.getElementsByTagName("nim").item(0).getTextContent());

         }
      } catch (Exception e) {
         e.printStackTrace();
      }
   }
}