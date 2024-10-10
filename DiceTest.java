

public class DiceTest {
    public static void main(String[] args) {

    
        int numRolls = 1000; // Antal kast

        var counts = new int[numRolls];

        var DiceFaceTimes = new int [6];

        // throws the dice 1000 times
        for (int i = 0; i < numRolls; i++) {
            int roll = Dice.RollDice();
            counts[i] = roll;
        }


        // adding times of throws to the counter. (organization of the data)
        for (int i = 0; i < counts.length; i++) {
            
        switch(counts[i]){
            
            case 1: 
                DiceFaceTimes[0]++;
            break;
            case 2:
                DiceFaceTimes[1]++;
            break;
            case 3: 
                DiceFaceTimes[2]++;
            break;
            case 4: 
                DiceFaceTimes[3]++;
            break;
            case 5: 
                DiceFaceTimes[4]++;
            break;
            case 6: 
                DiceFaceTimes[5]++;
            break;
        }

        }

        // printing results for each side of the dice
        for ( var i = 0; i <DiceFaceTimes.length ; i++){
        System.out.println("Dice face " + (i + 1) + "" + " hit " + DiceFaceTimes[i] + " times");
        
        }
    }
}