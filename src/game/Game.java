package game;

import user.Character;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Game {

    public static void start() throws IOException, InterruptedException {
        System.out.println("O jogo começou!");

        Character character = new Character();

        character.getLife();

        character.setLife(100);


        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://servicodados.ibge.gov.br/api/v1/localidades/estados/33%7C35/distritos"))

                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();
        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());

        Object obj = response.body();

        System.out.println(obj);





    }
}
