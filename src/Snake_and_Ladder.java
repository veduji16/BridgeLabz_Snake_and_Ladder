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

        int positionPlayer1 = 0;
        int positionPlayer2 = 0;
        int goal = 100;
        int diceCount = 0;
        int currentPlayer = 1;

        while (positionPlayer1 < goal && positionPlayer2 < goal) {
            int diceValue = randomNum();
            diceCount++;

            System.out.println("Dice rolled to: " + diceValue);
            System.out.println("Current Player: Player " + currentPlayer);

            int option = checkOption();
            switch (option) {
                case 1:
                    System.out.println("No Play");
                    break;

                case 2:
                    System.out.println("Ladder");
                    if (currentPlayer == 1) {
                        positionPlayer1 += diceValue;
                    } else {
                        positionPlayer2 += diceValue;
                    }
                    continue;

                case 3:
                    System.out.println("Snake");
                    if (currentPlayer == 1) {
                        positionPlayer1 -= diceValue;
                    } else {
                        positionPlayer2 -= diceValue;
                    }
                    break;
            }

            if (positionPlayer1 < 0) {
                System.out.println("Player 1: ...Game is restarted...");
                positionPlayer1 = 0;
            } else if (positionPlayer1 > goal) {
                positionPlayer1 -= diceValue;
            }

            if (positionPlayer2 < 0) {
                System.out.println("Player 2: ...Game is restarted...");
                positionPlayer2 = 0;
            } else if (positionPlayer2 > goal) {
                positionPlayer2 -= diceValue;
            }

            System.out.println("Player 1 Position: " + positionPlayer1);
            System.out.println("Player 2 Position: " + positionPlayer2);
            System.out.println();

            currentPlayer = (currentPlayer == 1) ? 2 : 1;
        }

        if (positionPlayer1 >= goal) {
            System.out.println("Player 1 Wins!");
        } else {
            System.out.println("Player 2 Wins!");
        }
        System.out.println("Total Dice rolls: " + diceCount);
    }
}
