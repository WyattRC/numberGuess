package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int correctGuess;
        Scanner scanner = new Scanner(System.in);
        int guess;
        boolean play;
        int count = 0;
        do {

            play = false;
            correctGuess  = (int) (Math.random() * (100 - 1) + 1);
            guess = 0;


            while (guess != correctGuess) {
                System.out.print(" Please guess a number between 1 and 100:");
                guess = scanner.nextInt();
                count++;
                if (guess > correctGuess) {
                    System.out.print("Too High! ");
                    System.out.print("You're on guess # " + count + ".");
                } else if (guess < correctGuess) {
                    System.out.print("Too Low! ");
                    System.out.print("You're on guess # " + count + ".");
                }



            }
            System.out.print("Congrats you won! Type yes to play again.");
            switch(scanner.next()) {
                case "yes":
                play = true;
                break;
                default:
                    break;
            }
        }while(play);
        System.out.println("2cool4school, this doesn't appear ever");
    }
}
