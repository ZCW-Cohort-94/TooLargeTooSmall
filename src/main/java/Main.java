/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.math.*;
import java.io.*;
import java.util.*;
import java.lang.*;
public class Main {

    private static int guessCount = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int goalnum = random.nextInt(1, 10);
        ArrayList<Integer> guesses = new ArrayList<>(100);
        System.out.println("Welcome to the guessing game.");
        for(int i = 0; i<100; i++){
            try{
                System.out.println("enter a number: ");
                int num = scanner.nextInt();
                if(guesses.contains(num)) {
                    System.out.println("this number has already been tried, try a new number");
                    guesses.remove(0);
                }else{
                    if (num > goalnum) {
                        System.out.println("hehe too high! try again");
                        guessCount += 1;
                        guesses.add(num);
                    } else if (num < goalnum) {
                        System.out.println("hehe too low! try again");
                        guessCount += 1;
                        guesses.add(num);
                    } else {
                        System.out.println("Congrats!!!! it took you " + guessCount + " tries to guess the right number.");
                        break;
                    }
                }
            }catch(InputMismatchException e){
                System.out.println("that is not a number! try again and enter a number this time");
                guessCount +=1;
                scanner.nextLine();


            }
        }
    }
}


