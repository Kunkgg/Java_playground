import java.nio.file.Files;
import java.nio.file.Path;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.jsoup.Jsoup;

public class Myjsoup {

    public static String readFile(String fileName) {
        String content = "";
        try {
            content = Files.readString(Path.of(fileName));
            // System.out.println(actual);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return content;
    }

    public static void main(String[] args) {
        // String fileName = "water.html";
        // String html = readFile(fileName);

        try {
            Document doc = Jsoup.connect("https://en.wikipedia.org/").get();
            System.out.println(doc.title());
            Elements newsHeadlines = doc.select("#mp-itn b a");
            for (Element headline : newsHeadlines) {
                System.out.printf("%s\n\t%s", headline.attr("title"),
                        headline.absUrl("href"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
