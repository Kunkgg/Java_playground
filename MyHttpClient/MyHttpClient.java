import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpHeaders;
import java.nio.file.Paths;

public class MyHttpClient {
    public static void sectionTitle(String title) {
        for (int i = 0; i < title.length(); i++) {
            System.out.print("=");
        }
        System.out.println();
        System.out.println(title);
        for (int i = 0; i < title.length(); i++) {
            System.out.print("=");
        }
        System.out.println();
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        String url = "http://webcode.me";

        sectionTitle("StatusCode");
        HttpClient clientStatusCode = HttpClient.newHttpClient();
        HttpRequest requestStatusCode = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .GET() // GET is default
                .build();

        HttpResponse<Void> responseStatusCode = clientStatusCode.send(
                requestStatusCode,
                HttpResponse.BodyHandlers.discarding());

        System.out.println(responseStatusCode.statusCode());


        sectionTitle("HEAD");

        HttpClient clientHead = HttpClient.newHttpClient();
        var requestHead = HttpRequest.newBuilder(URI.create(url))
                .method("HEAD", HttpRequest.BodyPublishers.noBody())
                .build();

        HttpResponse<Void> responseHead = clientHead.send(
                requestHead,
                HttpResponse.BodyHandlers.discarding());

        HttpHeaders headers = responseHead.headers();

        headers.map().forEach((key, values) -> {
            System.out.printf("%s: %s%n", key, values);
        });

        sectionTitle("GET");
        HttpClient clientGet = HttpClient.newHttpClient();
        HttpRequest requestGet = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();

        HttpResponse<String> responseGet = clientGet.send(
                requestGet,
                HttpResponse.BodyHandlers.ofString());

        System.out.println(responseGet.body());

        sectionTitle("File BodyHandler");
        HttpClient clientFile = HttpClient.newHttpClient();
        HttpRequest requestFile = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .GET() // GET is default
                .build();

        var fileName = "index.html";

        HttpResponse responseFile = clientFile.send(requestFile,
                HttpResponse.BodyHandlers.ofFile(Paths.get(fileName)));

        System.out.println(responseFile.statusCode());
    }
}
