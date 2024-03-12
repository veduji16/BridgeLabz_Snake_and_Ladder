import java.util.*;

public class Snake_and_Ladder {
    public static int randomNum() {
        Random dice = new Random();
        return dice.nextInt(6) + 1;
    }

    public static int checkOption() {
        Random option = new Random();
        return option.nextInt(3) + 1;
    }

    public static void main(String[] args) {
        int start;
        int position = 0;
        start = position;

        System.out.println("\n...Welcome to the Snake & Ladders Game...\n");
        System.out.println("Your Start Postion: " + start);

        System.out.println("Dice rolled to:  " + randomNum());

        int option = checkOption();
        switch (option) {
            case 1:
                System.out.println("No Play");
                break;

            case 2:
                System.out.println("Ladder");
                position = position + randomNum();
                break;

            case 3:
                System.out.println("Snake");
                position = position - randomNum();
                break;
        }
    }
}
