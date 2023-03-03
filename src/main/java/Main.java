/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.*;
public class Main {


    public static void main(String[] args){

        Random random = new Random();
        int randNum = random.nextInt(50);
        System.out.println(randNum);
        int numCount = 0;
        int userNums = -1;


        System.out.print("Guess the number: ");
        Scanner input = new Scanner(System.in);
        int guess = input.nextInt();


        do {
            if (guess < randNum) {
                System.out.println("Too low try again");
                userNums = guess;
                guess = input.nextInt();
                numCount++;
                if (guess == userNums) {
                    System.out.println("You already guessed that number");
                    numCount--;
                }
            } else if (guess > randNum) {
                System.out.println("Too high try again");
                userNums = guess;
                guess = input.nextInt();
                numCount++;
                if (guess == userNums) {
                    System.out.println("You already guessed that number");
                    numCount--;
                }
            }
        } while(guess != randNum);
        System.out.println("Correct!");
        numCount++;
        System.out.println("Guess Count: " + numCount);
            }
    }
