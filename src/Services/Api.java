package Services;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Api {

    static HttpRequest request;

    public String data() throws IOException, InterruptedException{

        request = HttpRequest.newBuilder()
                .uri(URI.create("https://servicodados.ibge.gov.br/api/v1/localidades/estados/33%7C35/distritos"))
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();

        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());

        Object obj = response.body();

        return obj.toString();
    }
}
