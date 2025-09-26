package Gamified;
import java.util.*;

public class RandomGame {
    public static void main(String[] args) {
        System.out.println("Prediction Number Game");
        System.out.println("I have chosen my number from 1 to 100");
        System.out.println("Try guess it!");
        Scanner scanner = new Scanner(System.in);
        int numberToGuess = randomGen();
        int chancesTaken = 0;
        while(true){
            System.out.println("Enter your guess: ");
            int guess = scanner.nextInt();
            chancesTaken++;
            if(guess == numberToGuess){
                System.out.println("You are correct! and you guessed it in "+ chancesTaken +" tries");
                break;
            } else if (guess < numberToGuess) {
                System.out.println("Too low!");
            }
            else{
                System.out.println("Too High!");
            }
        }
        scanner.close();
    }
    //----------------------------------------
    //Random Number Generator
    public static int randomGen(){
        Random rand = new Random();
        return rand.nextInt(100)+1;
    }
}
