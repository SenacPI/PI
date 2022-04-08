package Game;

import Services.Api;

import java.io.IOException;
import java.util.Random;

public class Game {

    static Integer money = 0;
    static Random picker;
    static Api api = new Api();

    public static void start() throws IOException, InterruptedException {

      System.out.println(api.data());

        System.out.println();
        picker.nextInt(1);

        while(money < 100000)
        {

        }
    }
}
