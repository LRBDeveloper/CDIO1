class ens{
    static boolean getEns(int dice1, int dice2){
        return(dice1 == dice2);
    }
    
    static boolean checkForOne(int dice1, int dice2){
        if (dice1 == 1 && dice2 == 1){
            return true;
        }else{
            return false;
        }
    }

    static boolean checkForSix(int dice1, int dice2){
        return (dice1==6 && dice2==6);
    }
}
