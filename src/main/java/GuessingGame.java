import java.util.Scanner;
import java.lang.Math;
public class GuessingGame{
    public static void main(String[] args) {

        System.out.println("Guess a number!");

        int answer = (int) (Math.random() * 100) + 1;

        int lives = 10;

        Scanner input = new Scanner(System.in);
        System.out.println("Let's play a game...\nI'm thinking of a number between 1 and 100\n" +
                "You have 10 tries before you lives run out!");
    System.out.print("What is your guess?");
        while (lives > 0) {
            int guess = input.nextInt();
            if (guess == answer) {
                System.out.println("You win this time...");
                break;
            }
            else if (guess > answer) {
                System.out.println("Seems a bit high! \n Try again you have " + (lives - 1) + " tries remaining!");
            }
            else {
                System.out.println("Kind of a low ball! \n Try again you have " + (lives - 1) + " tries remaining!");
            }
            lives--;
                if (lives==0) {
                System.out.println("It seems you're out of lives... BOOM!");
            }


        }
    }
}