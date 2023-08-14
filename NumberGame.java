import java.util.*;
import java.lang.Math;

public class NumberGame{
    public static void main(String args[]){
        int answer = (int)(Math.random() * 100) + 1;
        

        Scanner sc = new Scanner(System.in);

        int trails = sc.nextInt();
        boolean correct = false;
        System.out.println("guess a number between 1 to 100.");
        System.out.println("You have " + trails +" trails to guess the  number.");
        while(trails > 0){
            System.out.println("Enter your guess :");
            int guess = sc.nextInt();

            if(guess == answer){
                System.out.println("Your guess is coreect.");
                System.out.println("You Won!");
                break;
            }else if(guess > answer){
                System.out.println("Your guess is to high . ");
                System.out.println("You have " + (trails - 1) + "tries left .");
                trails--; 
            }else{
                System.out.println("your guess is to low .");
                System.out.println(" You have " + (trails - 1) + "tries left .");
            }
            trails--;
        }
        if(correct == false){
            System.out.println("You ran out of tries.");
            System.out.println("You lose the game..");
        }

    }
}