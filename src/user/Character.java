package user;

import java.io.*;
import java.util.Arrays;

public class Character {

    private int life;
    private int score;
    private int level;
    private int exp;
    private int level_up;
    private int attack;

    public void newSave(int life, int score, int level, int exp, int level_up, int attack) {

        Integer[] arr = {life, score, level, exp, level_up, attack};

        try {
            File myObj = new File("data.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }



    }

    // Getters
    public int getLife() throws IOException {

        try {
            FileReader dataRead = new FileReader("data.txt");
            dataRead.read();
            System.out.println(dataRead);
            dataRead.close();
        }
        catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        return life;
    }

    // Setters
    public void setLife(int life) {

        try {

            FileWriter myWriter = new FileWriter("data.txt");
            myWriter.write(life);
            myWriter.close();
            System.out.println("Successfully wrote to the file: " + life);

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

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
