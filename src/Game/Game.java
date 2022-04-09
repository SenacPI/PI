package Game;

import Services.Api;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Game {

    static Integer money = 0;
    static Random picker = new Random();
    static Api api = new Api();

    public static void start() throws IOException, InterruptedException {

        String[] countryInfo = api.data(picker.nextInt(9));

        System.out.println("Qual a capital d(o)/(a): " + countryInfo[0] + "?");


        System.out.println("Resposta: ");
        Scanner sc = new Scanner(System.in);
        String userResposta = sc.nextLine();
        System.out.print(userResposta);

        if(Objects.equals(userResposta, countryInfo[1])) {
            System.out.println("Resposta correta!");
        }
        else {
            System.out.println("Resposta errada!");
        }



    }
}
