import java.util.*;

public class Snake_and_Ladder {
    public static int randomNum() {
        Random dice = new Random();
        return dice.nextInt(6) + 1;
    }

    public static void main(String[] args) {
        int start;
        int position = 0;
        start = position;

        System.out.println("\n...Welcome to the Snake & Ladders Game...\n");
        System.out.println("Your Start Postion: " + start);
        System.out.println("Dice rolled to:  " + randomNum());
    }
}
