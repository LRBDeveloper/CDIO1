package Spil;

import java.util.Scanner;
class DiceGame{
    public static void main(String[] args){
        var s = new Scanner(System.in);

        //game variables
        int PlayerTurn = 1; // 1 for player 1 - 2 for player 2
        int p1Points = 0;
        boolean p1HitSixOnce = false;
        int p2Points = 0;
        boolean p2HitSixOnce = false;

        boolean gameFinished = false;

        System.out.println("\nWelcome to DiceGame\n\n-- Rules: --\n1. The first player to hit 40 points, wins");

        while(!gameFinished){
            System.out.println("");
            System.out.println("Player: " + PlayerTurn + "'s turn. Press T to roll dice.");
            
            
            while(s.hasNextLine()){
                var userInput = s.nextLine();
                if(userInput.equalsIgnoreCase("T")){
                    System.out.println("\nDice rolled!\n");
                    var diceroll1 = Dice.RollDice();
                    var diceroll2 = Dice.RollDice();
                    System.out.println("Roll 1: " + diceroll1 + "\nRoll 2: " + diceroll2);
                

                    if(PlayerTurn==1){ //player 1's turn
                        if(ens.getEns(diceroll1, diceroll2)){
                            if (ens.checkForOne(diceroll1, diceroll2)){
                                System.out.println("Player one hit a double 1, this resets his score");
                                p1Points = 0;
                            }else{

                                //Hvis spiller rammer 6
                                if(ens.checkForSix(diceroll1, diceroll2) ){
                                    if(p1HitSixOnce==true){
                                        //Anden gang
                                        System.out.println("Player one hit double 6 twice! Player one wins.");
                                        gameFinished=true;
                                    }else{
                                        //Første gang
                                        System.out.println("First double 6 for player one!");
                                        p1HitSixOnce=true;
                                    }
                                    
                                }

                                if((p1Points + Sum.GetSum(diceroll1, diceroll2) <= 40) && (p1Points + Sum.GetSum(diceroll1, diceroll2) != 38) && (p1Points + Sum.GetSum(diceroll1, diceroll2) != 39)){ //
                                    p1Points+= Sum.GetSum(diceroll1, diceroll2);                                
                                }
                                else if (p1Points == 40){
                                    gameFinished =true;
                                    System.out.println("Player 1 has won!");
                                }
                            }
                        }else{
                            if((p1Points + Sum.GetSum(diceroll1, diceroll2) <= 40) && (p1Points + Sum.GetSum(diceroll1, diceroll2) != 38) && (p1Points + Sum.GetSum(diceroll1, diceroll2) != 39)){ 
                                    p1Points += Sum.GetSum(diceroll1, diceroll2);                           
                            }
                        PlayerTurn=2;//Switch player turn for next round
                        }
                    }else{ //player 2's turn
                        if(ens.getEns(diceroll1, diceroll2)){
                            if (ens.checkForOne(diceroll1, diceroll2)){
                                System.out.println("Player two hit a double 1, this resets his score");
                                p2Points = 0;
                            }else{

                                //Hvis spiller rammer 6
                                if(ens.checkForSix(diceroll1, diceroll2)){
                                    if(p2HitSixOnce==true){
                                        //Anden gang
                                        gameFinished=true;
                                        System.out.println("Player two hit double 6 twice! Player two wins.");
                                    }else{
                                        //Første gang
                                        p2HitSixOnce=true;
                                        System.out.println("First double 6 for player two!");
                                    }
                                }

                                if((p2Points + Sum.GetSum(diceroll1, diceroll2) <= 40 ) && (p2Points + Sum.GetSum(diceroll1, diceroll2) != 38) && (p2Points + Sum.GetSum(diceroll1, diceroll2) != 39)){ //
                                    p2Points += Sum.GetSum(diceroll1, diceroll2);
                                }else if (p2Points == 40){
                                    System.out.println("Player 2 has won!");
                                    gameFinished =true;
                                }
                            }
                        }else{
                            if((p2Points + Sum.GetSum(diceroll1, diceroll2) <= 40) && (p2Points + Sum.GetSum(diceroll1, diceroll2) != 38) && (p2Points + Sum.GetSum(diceroll1, diceroll2) != 39)){ //
                                p2Points += Sum.GetSum(diceroll1, diceroll2);
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
        }          
        System.out.println("Game finished.");
    }
}