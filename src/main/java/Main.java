import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {
    // instance variables
    int MaxNumber = 100;
    Scanner scanner;
    int K = 8; // Number of trials

    class Result {
        boolean success = false;
        String message = "";

        Result(boolean s, String m) {
            success = s;
            message = m;
        }
        boolean getSuccess() {
            return success;
        }
        String getMessage() {
            return message;
        }
    }

    public static void main(String[] arg) {
//        Guesser game;
//        game = new Guesser();
//        game.run();
        new Main().run();
    }

    private int askForNext(Scanner sc) {
        System.out.println("Guess the number:");
        // input for guess
        return sc.nextInt();
    }

    private int getRandom(int bound) {
        return 1 + (int) (bound * Math.random());
    }

    // Function that implements the
    // number guessing game
    public void run() {
        scanner = new Scanner(System.in);

        int secretnumber = this.getRandom(MaxNumber);

        int i, guess;

        System.out.println("A number is chosen between 1 to "+ MaxNumber +".\n"
                + "Guess the number within " + K + " trials.");

        // Iterate over K Trials
        for (i = 0; i < K; i++) {
            // Get input of guess
            guess = this.askForNext(scanner);
            Result result = checkGuess(guess, secretnumber, i);
            System.out.println(result.getMessage());
            if (result.getSuccess() == true) {
                break;
            }
        }
    }

    private Result checkGuess(int guess, int secretnumber, int trial) {
        // If the number is guessed
        if (secretnumber == guess) {
            return new Result(true,"Congratulations!\nYou guessed the number.");
        } else if (secretnumber > guess
                && trial != K - 1) {
            return new Result(false,"The number is greater than " + guess);
        } else if (secretnumber < guess
                && trial != K - 1) {
            return new Result(false,"The number is less than " + guess);
        }
        return new Result(false, "You have exhausted" + K + " trials.\n"
                + "The number was " + secretnumber);
    }
}
