

import java.util.Scanner;

public class Ali_Kayra_Ilhan_Task1 {

    public static void main(String[] args) {

        boolean play = true;
        while (play) {   
            System.out.println("Enter Player 1 choice ('R','P','S'): ");
            Scanner in = new Scanner(System.in);
            String player1choice = in.next();   
            
            boolean checker1 = true;
            while (checker1) {   
                if ((player1choice.charAt(0) == 'R') || (player1choice.charAt(0) == 'P') || ((player1choice.charAt(0) == 'S'))) {
                    checker1 = false;   
                } else {
                    System.out.println("Not a valid input!");
                    System.out.println("Enter Player 2 choice ('R','P','S'): ");
                    player1choice = in.next();

                }
            }
            boolean areChoicesDifferent = false;
            boolean firstPlayerWon = true;
            System.out.println("Enter Player2's choice: ");
            String player2choice;
            while (!areChoicesDifferent) {
                player2choice = in.next();

                boolean checker2 = true;
                while (checker2) {   
                    if ((player2choice.charAt(0) == 'R') || (player2choice.charAt(0) == 'P') || ((player2choice.charAt(0) == 'S'))) {
                        checker2 = false;   
                    } else {
                        System.out.println("Not a valid input!");
                        System.out.println("Enter Player2's choice: ");
                        player2choice = in.next();

                    }
                }
                if (!(player1choice.charAt(0) == (player2choice.charAt(0)))) {
                    areChoicesDifferent = true;

                    if (player1choice.charAt(0) == 'R') {    
                        if (player2choice.charAt(0) == 'P') {
                            firstPlayerWon = false;
                        }
                        if (player2choice.charAt(0) == 'S') {
                            firstPlayerWon = true;
                        }
                    }
                    if (player1choice.charAt(0) == 'P') {
                        if (player2choice.charAt(0) == 'R') {
                            firstPlayerWon = true;
                        }
                        if (player2choice.charAt(0) == 'S') {
                            firstPlayerWon = false;
                        }
                    }
                    if (player1choice.charAt(0) == 'S') {
                        if (player2choice.charAt(0) == 'R') {
                            firstPlayerWon = false;
                        }
                        if (player2choice.charAt(0) == 'P') {
                            firstPlayerWon = true;
                        }
                    }

                }
                if (!areChoicesDifferent) {
                    System.out.println("Your input is the same as Player 1. Please select another choice");
                    System.out.println("Enter Player2's choice: ");
                }
            }

            if (firstPlayerWon) {
                System.out.println("Player 1 wins!!");
            }
            if (!firstPlayerWon) {
                System.out.println("Player 2 wins!!");
            }

            System.out.println();
            System.out.println("Do you want to play again?(Enter 'Y' or 'y' for YES)");
            String answer = in.next();

            if (!(answer.charAt(0) == 'Y') && !(answer.charAt(0) == 'y')) { 
                play = false;
            }
        }
    }

}
