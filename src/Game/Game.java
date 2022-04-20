package Game;

import Services.Api;

import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Game {

    static double money = 0;
    static double counter = 0.1;
    static Integer trys = 0;

    static Random picker = new Random();
    static Api api = new Api();
    static Scanner sc = new Scanner(System.in);

    public static void start() {

        int rodada = 0;

        final int size = api.country().length;

        do {
            String[] countryInfo = api.data(picker.nextInt(size));

            System.out.println("Rodada: " + rodada);

            System.out.println("Qual a capital d(o)/(a): " + countryInfo[0] + "?");

            System.out.println("Resposta: ");
            String userAnswer = sc.nextLine();

            if (Objects.equals(userAnswer.toLowerCase(), countryInfo[1].toLowerCase())) {

                if(rodada == 3) {
                    // rodada 3 = adiciona 10 mil de dinheiro
                    money += 10000;
                }

                if(rodada == 5) {
                    // rodada 5 = adiciona 100 mil de dinheiro
                    money += 100000;
                }

                if(rodada == 9) {
                    // rodada 9 = adiciona 1 mi de dinheiro
                    money += 1000000;
                }

                counter += 0.1;
                money += 1141 + money * counter;

                System.out.printf("Resposta correta! Você ganhou R$ %.2f ", money);
            } else {
                trys += 1;
                System.out.printf("Resposta errada! Você tem apenas  tentativas %d \n", (3 - trys));

                if (trys > 2) {

                    System.out.println("Você perdeu!");
                    break;
                }
            }
        } while (money < 10000);
    }
}
