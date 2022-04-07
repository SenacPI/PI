package Menu;

import game.Game;
import java.util.Scanner;

public class menuUI {

    Scanner sc;

    public static void menu() {

        Scanner sc = new Scanner(System.in);

        // print 'jogo aventura'
        System.out.println("Bem-vindo ao jogo aventura!");

        // print 'Digite o nome do jogador
        System.out.println("Digite o nome do jogador:");

        // read player name
        String playerName = sc.nextLine();

        // print 'Bem-vindo, ' + playerName
        System.out.println("Bem-vindo, " + playerName);

        // print 'Escolha uma das opções abaixo'
        System.out.println("Escolha uma das opções abaixo:");

        // print '1 - Jogar'
        System.out.println("1 - Jogar");

        // print '2 - Sair'
        System.out.println("2 - Sair");

        // read option
        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();

        // if option == 1

        if (option == 1) {

            //print 30 new lines
            for (int i = 0; i < 30; i++) {
                System.out.println('\n');
            }

            // call class Game
            Game.start();
        }

        // if option == 2
        if (option == 2) {

            // print exiting message
            System.out.println("Obrigado por jogar!");

            // exit
            System.exit(0);


        }
}
}
