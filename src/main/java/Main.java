import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int min = 0; //minimum number for range of generation
        int max = 50; //maximum number for range of generation
        int numGuesses = 0; //this will track the number of user's guesses
        int guess = 0; //this will track the value of the user's guesses
        int answer = (int) Math.floor(Math.random() * (max - min + 1) + min); //randomly generate number between min and max

        while (guess != answer) { //loop will continue until user guesses the correct value

            Scanner input = new Scanner(System.in); //initializes scanner
            System.out.println("Guess the number"); //prompts user to enter their guess
            guess = input.nextInt();                //stores user input into int guess
            numGuesses++;                           //increments the value of the numGuesses variable

            if (guess < min || guess > max) { //checks if guess is below/above the expected range
                System.out.println("You guess over or below the acceptable range of: " + min + " to " + max); //informs user they've guessed lower/higher than expected range
            }
            else if (guess > answer) {   //checks if guess is higher than the answer
                System.out.println("You guessed too high."); //informs user they've guessed too high
            }
            else if (guess < answer) {    //checks if guess is less than the answer
                System.out.println("You guessed too low."); //informs user they've guessed too low
            }
            else {
                System.out.println("Congrats. You guessed " + answer + " and it only took you " + numGuesses + " tries.");
            }
        }
    }
}