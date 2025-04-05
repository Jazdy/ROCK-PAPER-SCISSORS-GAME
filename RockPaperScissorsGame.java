import java.util.Scanner;

public class RockPaperScissorsGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int player;
        int computer = 1;
        int counter = 9;
        int playerScore = 0;
        int computerScore = 0;
        int round = 1;
        char playAgain = 'y';

        do {
            System.out.println("\n================================================");
            System.out.println("\n    WELCOME TO ROCK, PAPER, SCISSORS BATTLE!  ");
            System.out.println("\n================================================");
            System.out.println("\n            Here's the game RULES:                    ");
            System.out.println("\n         WIN                      LOSE         ");
            System.out.println("\n        ROCK           >          SCISSORS     ");
            System.out.println("    SCISSORS           >          PAPER        ");
            System.out.println("       PAPER           >          ROCK          ");
            System.out.println("\n        Note: The game is only 5 rounds");
            System.out.println("\n================================================");
            System.out.println("\n             LET THE BATTLES BEGIN! ");

            while (round <= 5) {
                System.out.println("\n                  Round " + round + " / 5");
                System.out.println("\n================================================");
                System.out.println("                      SCORE:");
                System.out.println("\n        Player  = " + playerScore + "     |   Computer = " + computerScore);
                System.out.println("\n------------------------------------------------");
                System.out.println("                     CHOICES:");
                System.out.println("\n         (1) Rock (2) Paper (3) Scissors");
                System.out.print("\nEnter your choice: ");
                player = sc.nextInt();

                if (player < 1 || player > 3) {
                    System.out.println("\n------------------------------------------------");
                    System.out.println("\nInvalid input.");
                    System.out.println("\n================================================");
                    continue;
                }
    
            if (player == 1){
                int loopCount = ((counter % 4) + player);

                for(int i = 0; i < loopCount; i++){
                    computer = ((computer + player)% 3 ) + 1;
                }
                counter += (computer + 2) + (player % 3) +1 ;
                
            }
            else if (player == 2){
                int loopCount = ((counter % 3) + player);

                for(int i = 0; i < loopCount; i++){
                    computer = ((computer + player )% 4 ) + 1;
                }
                counter += (computer + 2) + (player % 3) +1 ;
            }
            else{
                int loopCount = ((counter % 4) + player);

                for(int i = 0; i < loopCount; i++){
                    computer = ((computer + player)% 3 ) + 1;
                }
                counter += (computer + 2) + (player % 3) +1 ;
            }
            
                System.out.println("\n----------------------------------------");
                switch (player) {
                    case 1:
                        System.out.println("\nYou choose: (1) Rock");
                        System.out.println("      _____");
                        System.out.println("  ---'   __)");
                        System.out.println("        (___)");
                        System.out.println("        (___)");
                        System.out.println("        (__)");
                        System.out.println("  ---.__(__)");
                        break;
                    case 2:
                        System.out.println("\nYou choose: (2) Paper");
                        System.out.println("      _____");
                        System.out.println("  ---'   __)____");
                        System.out.println("            ____)");
                        System.out.println("           _____)");
                        System.out.println("          ______)");
                        System.out.println("  ---.__________)");
                        break;
                    case 3:
                        System.out.println("\nYou choose: (3) Scissor");
                        System.out.println("      _____");
                        System.out.println("  ---'   __)____");
                        System.out.println("            ____)");
                        System.out.println("        ________)");
                        System.out.println("       (___)");
                        System.out.println("  ---.__(_)");
                        break;
                }

                switch (computer) {
                    case 1:
                        System.out.println("\nComputer choose: (1) Rock");
                        System.out.println("      _____");
                        System.out.println("  ---'   __)");
                        System.out.println("        (___)");
                        System.out.println("        (___)");
                        System.out.println("        (__)");
                        System.out.println("  ---.__(__)");
                        break;
                    case 2:
                        System.out.println("\nComputer choose: (2) Paper");
                        System.out.println("      _____");
                        System.out.println("  ---'   __)____");
                        System.out.println("            ____)");
                        System.out.println("           _____)");
                        System.out.println("          ______)");
                        System.out.println("  ---.__________)");
                        break;
                    case 3:
                        System.out.println("\nComputer choose: (3) Scissor");
                        System.out.println("      _____");
                        System.out.println("  ---'   __)____");
                        System.out.println("            ____)");
                        System.out.println("        ________)");
                        System.out.println("       (___)");
                        System.out.println("  ---.__(_)");
                        break;
                }
                System.out.println("\n----------------------------------------");

                if (player == computer) {
                    System.out.println("\n It's a DRAW!");
                    System.out.println("\n================================================");
                    continue;
                } else if ((player == 1 && computer == 3) || (player == 2 && computer == 1) || (player == 3 && computer == 2)) {
                    System.out.println("\n You WIN!");
                    System.out.println("\n================================================");
                    playerScore++;
                } else {
                    System.out.println("\n Computer WINS!");
                    System.out.println("\n================================================");
                    computerScore++;
                }
                round++;
                if (playerScore == 3){
                    break;
                }
                if (computerScore == 3){
                    break;
                }
            }


            System.out.println("\nFinal Score: ");
            System.out.println("\nPlayer: " + playerScore);
            System.out.println("Computer: " + computerScore);
            System.out.println("\n------------------------------------------------");

            if (playerScore > computerScore) {
                System.out.println("\nCongratulations! You won the match!");
            } else if (playerScore < computerScore) {
                System.out.println("\nComputer wins the match! Better luck next time!");
            } else {
                System.out.println("\nIt's a Draw! Well played!");
            }

            System.out.println("\n================================================");
            System.out.println("\n Thank you for playing! See you next time! ");
            System.out.println("Do you want to play? (y/n)");

            System.out.print("Your response: ");
            playAgain = sc.next().charAt(0);
        } while (playAgain == 'y' || playAgain == 'Y');
        System.out.println("\n Thank you for playing! See you next time! ");
    }
}