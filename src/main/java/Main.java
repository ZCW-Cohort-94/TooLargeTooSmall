import java.util.Scanner;
public class Main {

    public static void main(String[] args){
        Scanner inputNumber = new Scanner(System.in);

        //variables
        int userGuess = 0;
        int guesses = 3;
        int min = 1;
        int max = 12;
        int range = max - min +1;
        int randNum = (int)(Math.random() * range) + min;

        //message
        System.out.println("Guess the number and be a winner!");
        System.out.println("Type in a number between 1 and 12");
        System.out.println("Good Luck!");
//game
        while(true) {
            userGuess = inputNumber.nextInt();
            if (randNum < userGuess) {
                System.out.println("Apologies but that number is too big. " + (guesses - 1) + " tries remaining. Try again.");
                --guesses;
            }
            if (randNum > userGuess) {
                System.out.println("Sorry but that number is too small. " + (guesses - 1) + " tries remaining. Try again.");
                --guesses;
            }
            if (randNum == userGuess) {
                System.out.println("You got it! Congratulations!!");
                break;}
            if (guesses == 0){
                    System.out.println("You are out of lives. Goodbye.");
                break;}

            
        }


        

}
}