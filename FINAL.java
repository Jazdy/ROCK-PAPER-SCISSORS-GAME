import java.util.Scanner;

public class FINAL {
    public static void main(String [] ags){
        Scanner sc = new Scanner (System.in);

        int player;
        int computer = 1;
        int counter = 9;
        char playAgain = 'y';
        
        do{
            System.out.println("\n================================================");
            System.out.println("\n    WELCOME TO ROCK, PAPER, SCISSORS BATTLE!  ");
            System.out.println("\n================================================");
            System.out.println("\n    Here's the game RULES:                    ");
            System.out.println("\n       WIN                      LOSE         ");
            System.out.println("\n      ROCK           >          SCISSORS     ");
            System.out.println("  SCISSORS           >          PAPER        ");
            System.out.println("     PAPER           >          ROCK          ");
            System.out.println("\n================================================");
            System.out.println("\n           LET THE BATTLES BEGIN! ");
            System.out.println("\n (1) Rock (2) Paper (3) Scissors");
            System.out.print("\n Enter your choice: ");
            player = sc.nextInt();

        if (player < 1 || player > 3){
            System.out.println("\nInvalid input.");
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
        System.out.println("You choose: (1) Rock");
            System.out.println("      _____");
            System.out.println("  ---'   __)");
            System.out.println("        (___)");
            System.out.println("        (___)");
            System.out.println("        (__)");
            System.out.println("  ---.__(__)");
            break;
          case 2:
          System.out.println("You choose: (2) Paper");
            System.out.println("      _____");
            System.out.println("  ---'   __)____");
            System.out.println("            ____)");
            System.out.println("           _____)");
            System.out.println("          ______)");
            System.out.println("  ---.__________)");
            break;
        case 3:
        System.out.println("You choose: (3) Scissor");
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
    
        if (player == computer){
            System.out.println("\n It's a DRAW!");
        } else if ((player == 1 && computer == 3 ) || (player == 2 && computer == 1) || (player == 3 && computer == 2)){
        	System.out.println("\n You WIN!");
        } else {
        	System.out.println("\n Computer WINS!");
        }
        System.out.println("\n----------------------------------------");
        System.out.println("Do you want to play again?(y/n) ");
        System.out.print("Your response: ");
        playAgain = sc.next().charAt(0);

        } while (playAgain == 'y' || playAgain == 'Y');
        System.out.println("\n================================================");
        System.out.println("\n Thank you for playing! See you next time! ");
           }


}