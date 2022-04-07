package user;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;

public class Character {

    private int life;
    private int score;
    private int level;
    private int exp;
    private int level_up;
    private int attack;

    // Getters
    public int getLife() throws IOException {

        File file = new File("data.txt");

        try (FileReader fr = new FileReader(file))
        {
            char[] chars = new char[(int) file.length()];
            fr.read(chars);

            String fileContent = new String(chars);
            System.out.println(fileContent);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return life;
    }

    // Setters
    public void setLife(int life) {

        /*
        Path path = Paths.get("data.txt");
        String text = "…some text…";

        try {
            Files.write(path, text.getBytes(), StandardOpenOption.APPEND);
            System.out.println("Successfully written bytes {0} to the file");
        } catch (IOException e) {
            e.printStackTrace();
        }
         */

        this.life = life;
    }


    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public int getLevel_up() {
        return level_up;
    }

    public void setLevel_up(int level_up) {
        this.level_up = level_up;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }
}
