package com.company;
import game.Game;
import user.Character;

import java.io.Console;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

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
            Game game = new Game();

            Game.start(args);
        }

        // if option == 2
        if (option == 2) {

            // print 'fuck you'
            System.out.println("fuck you");

            // exit
            System.exit(0);




        }

        // print 'Obrigado por jogar!'
        System.out.println("Obrigado por jogar!");







    }
}
