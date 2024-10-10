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
                if(userInput.equalsIgnoreCase("T")){
                    System.out.println("\nDice rolled!\n");
                    var diceroll1 = Dice.RollDice();
                    var diceroll2 = Dice.RollDice();
                    System.out.println("Roll 1: " + diceroll1 + " roll 2: " + diceroll2);
                

                    if(PlayerTurn==1){
                        
                        if(ens.getEns(diceroll1, diceroll2)){
                            if (ens.checkForOne(diceroll1, diceroll2)){
                                p1Points = 0;
                            }else{
                                 if(P2Points+Sum.Getsum(diceroll1, diceroll2) <=40 ){ //
                                p1Points+= Sum.GetSum(diceroll1, diceroll2);
                            }
                            
                            
                        }else{
                             if(P2Points+Sum.Getsum(diceroll1, diceroll2) <=40 ){ 
                            p1Points += Sum.GetSum(diceroll1, diceroll2);
                            
                        }
                        PlayerTurn=2;//Switch player turn for next round
                        }


 
                    }else{
                        if(ens.getEns(diceroll1, diceroll2)){
                            if (ens.checkForOne(diceroll1, diceroll2)){
                                p2Points = 0;

                            
                            }else{
                                if(P2Points+Sum.Getsum(diceroll1, diceroll2) <=40 ){ //
                                p2Points += Sum.GetSum(diceroll1, diceroll2);
                            }
                            }

                        }else{
                             if(P2Points+Sum.Getsum(diceroll1, diceroll2) <=40 ){ //
                            p2Points+= Sum.GetSum(diceroll1, diceroll2); // Add points to player 1
                            
                        }
                        PlayerTurn=1; //Switch player turn for next round
                        }
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
