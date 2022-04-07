package game;

import user.Character;

import java.io.IOException;

public class Game {

    public static void start() throws IOException {
        System.out.println("O jogo começou!");

        Character character = new Character();

        character.getLife();

        character.setLife(100);



    }
}
