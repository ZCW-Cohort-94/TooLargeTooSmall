/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.Random;
import java.util.Scanner;


public class Main {
    public Integer secretNumber, guess, previousGuess, totalGuesses, max;
    public boolean correctGuess;
    public Scanner scan = new Scanner(System.in);

    public static void main(String[] args){
        Main main = new Main();
        main.totalGuesses = 1;
        main.randomNumberGenerator();
        System.out.println ("Try to guess the random number between 1-50!");
        main.getGuess();

        while (main.correctGuess != true)
        {
            if(main.guess != main.previousGuess)
            {
                if (main.secretNumber == main.guess) {
                    main.correctGuess = true;
                    System.out.println("You did it! Well done!");
                    System.out.println("Total guesses: " + main.totalGuesses);
                    main.scan.close();
                } else if (main.secretNumber < main.guess) {
                    System.out.println("Too large");
                    main.previousGuess = main.guess;
                    main.totalGuesses++;
                    main.getGuess();
                } else {
                    System.out.println("Too small");
                    main.previousGuess = main.guess;
                    main.totalGuesses++;
                    main.getGuess();
                }
            } else {
                System.out.println("Guess a different number!");
                main.getGuess();
            }
        }
    }
    //Generate a random number
    public Integer randomNumberGenerator()
    {
        Random rand = new Random();
        secretNumber = rand.nextInt(49) + 1;
        System.out.println(secretNumber);
        return secretNumber;
    }
    //Get guess from the user
    public void getGuess()
    {
        guess = scan.nextInt();
    }



}
