import java.util.Scanner;

public class GuessingGame {
    int numGuesses = 0;
    int min = 1;
    int max = 20;
    int randomNumber = (int) Math.floor(Math.random() * (max - min + 1) + min);
    Scanner sc = new Scanner(System.in);

    public void promptUser() {
        System.out.println("Welcome! Please enter a number between 1 and 20! We will track your guesses...");
        int guess;
        int previousGuess = -1;
        do {
            System.out.print("Guess the number between 1 and 20!");
            guess = sc.nextInt();
            if(guess == previousGuess) {
                System.out.println("You already guessed that, try again!");
            }
            else if (guess < randomNumber) {
                    System.out.println("Number is too small! Try again...");
                    numGuesses++;
                    previousGuess = guess;
            } else if (guess > randomNumber) {
                System.out.println("That number is too big! Try again...");
                numGuesses++;
                previousGuess = guess;
            } else if (guess == randomNumber) {
                System.out.println("Winner!");
            }

        }while (guess != randomNumber) ;
        String numberGuesses = String.format("You took %d guesses!", numGuesses);
    }
}
