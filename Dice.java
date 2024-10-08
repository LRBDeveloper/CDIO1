class Dice {
    static int RollDice() {
        var input = new java.util.Scanner(System.in);
        input.useLocale(java.util.Locale.ENGLISH);
        
        int terning = (int) (Math.random() * 6 + 1);

        System.out.println(terning);

        return terning;

    }
}