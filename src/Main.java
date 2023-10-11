import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String playerA;
        String playerB;
        String doneYN;
        boolean inputCheck = false;
        boolean done = false;
        System.out.println("Let's play rock paper scissors!");

        do {
            do {
                System.out.print("Player A: please enter R, P, or S: ");
                playerA = scan.nextLine();
                if(playerA.equalsIgnoreCase("R") || playerA.equalsIgnoreCase("P")||playerA.equalsIgnoreCase("S")) {
                    inputCheck = true;
                } else {
                    System.out.println("Error: you must enter R, P, or S");
                }
            } while (!inputCheck);

            inputCheck = false;

            do {
                System.out.print("Player B: please enter R, P, or S: ");
                playerB = scan.nextLine();
                if(playerB.equalsIgnoreCase("R") || playerB.equalsIgnoreCase("P")||playerB.equalsIgnoreCase("S")) {
                    inputCheck = true;
                } else {
                    System.out.println("Error: you must enter R, P, or S");
                }
            } while (!inputCheck);

            if (playerA.equalsIgnoreCase("P") && playerB.equalsIgnoreCase("R")) {
                System.out.println("Paper beats rock. Player A wins.");
            } else if (playerA.equalsIgnoreCase("R") && playerB.equalsIgnoreCase("S")) {
                System.out.println("Rock beats scissors.  Player A wins.");
            } else if (playerA.equalsIgnoreCase("S") && playerB.equalsIgnoreCase("P")) {
                System.out.println("Scissors beats paper.  Player A wins.");
            } else if (playerA.equalsIgnoreCase("R") && playerB.equalsIgnoreCase("P")) {
                System.out.println("Paper beats rock. Player B wins.");
            } else if (playerA.equalsIgnoreCase("S") && playerB.equalsIgnoreCase("R")) {
                System.out.println("Rock beats scissors.  Player B wins.");
            } else if (playerA.equalsIgnoreCase("P") && playerB.equalsIgnoreCase("S")) {
                System.out.println("Scissors beats paper.  Player B wins.");
            } else {
                System.out.println("Draw.");
            }

            System.out.print("Would you like to play again? Enter Y or N: ");
            doneYN = scan.nextLine();
            if (doneYN.equalsIgnoreCase("N")) {
                done = true;
            }
        } while (!done);
    }
}