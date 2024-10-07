import java.util.Scanner;

class DiceGame{
    public static void main(String[] args){
        var s = new Scanner(System.in);

        //game variables
        int PlayerTurn = 1; // 1 for player 1 - 2 for player 2
        int p1Points = 0;
        int p2Points = 0;

        boolean gameFinished = false;

        System.out.println("\nWelcome to DiceGame\n\n-- Rules: --\n1. The first player to hit 40 points, wins");

        while(!gameFinished){
            System.out.println("Player: " + PlayerTurn + "'s turn. Press T to roll dice.");
            
            
            while(s.hasNextLine()){
                var userInput = s.nextLine();
                if(userInput.equals("T")){
                    System.out.println("\nDice rolled!\n");
                    
                    if(PlayerTurn==1){
                        p1Points+=5; // Add points to player 1

                        PlayerTurn=2; //Switch player turn for next round
                    }else{
                        p2Points+=5; // Add points to player 2

                        PlayerTurn=1; //Switch player turn for next round
                    }

                    //Print current points
                    System.out.println("P1 points: " + p1Points + " - " + "P2 Points: " + p2Points);
                    
                    break;
                }else{
                    //Wrong button, roll again
                    System.out.println("Press T to roll dice");
                    continue;
                }   
            }

            if(p1Points == 40 || p2Points == 40){
                gameFinished=true;
            }

        }
     
        System.out.println("Game finished.");

    }
}