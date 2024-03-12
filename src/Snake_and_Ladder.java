import java.util.*;

public class Snake_and_Ladder {
    private static int randomNum() {
        Random dice = new Random();
        return dice.nextInt(6) + 1;
    }
    private static int checkOption() {
        Random option = new Random();
        return option.nextInt(3) + 1;
    }

    public static void main(String[] args) {
        int start;
        int position = 0;
        int goal = 100;
        start = position;

        System.out.println("\n...Welcome to the Snake & Ladders Game...\n");
        System.out.println("Your Start Postion: " + start);

        while (position < goal) {
            int diceValue = randomNum();

            System.out.println("Dice rolled to: " + diceValue);

            int option = checkOption();
            switch (option) {
                case 1:
                    System.out.println("No Play");
                    break;

                case 2:
                    System.out.println("Ladder");
                    position += diceValue;
                    break;

                case 3:
                    System.out.println("Snake");
                    position -= diceValue;
                    break;
            }

            if (position < 0) {
                System.out.println("...Game is restarted...");
                position = 0;
            } else if (position > goal) {
                break;
            }
        }
        System.out.println("Congrats! You Won.");
    }
}
