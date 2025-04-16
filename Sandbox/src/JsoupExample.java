
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import java.io.IOException;

public class JsoupExample {

    public static void main(String[] args) {
        try {
            // Use Jsoup to connect to the URL
            Document doc = Jsoup.connect("https://www.example.com").get();

            // Example: Select an element by its ID
            String elementText = doc.getElementById("myId").text();

            // Example: Select an element by its class
            String elementClassText = doc.getElementsByClass("myClass").first().text();

            // Example: Select an element by its tag
            String elementTagText = doc.select("p").text();

            System.out.println(elementText);
            System.out.println(elementClassText);
            System.out.println(elementTagText);

        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
