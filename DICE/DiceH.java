package DICE;
public class DiceH {
    public static void main(String[]args){
        int rollN=0;
        Dice di = new Dice();
        int sl = 0;
        int ttt = 0;
        while(rollN<=100){
            rollN = rollN+1;
            di.roll();
            int num = di.getTotal();
            if(num == 7 || num == 11){
                sl = sl+1;
            }
            if(num == 2 || num == 3 || num == 12){
                ttt = ttt +1;
            }
        }
        System.out.println("You rolled a 7 or 11 \t"+sl+"% of the time.");
        System.out.println("You rolled a 2, 3, or 12 \t"+ttt+"% of the time.");

    }
}
