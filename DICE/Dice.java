package DICE;

public class Dice {
    private int die1, die2;

    public Dice(){
        die1 = 7;
        die2 = 3;
    }
    public void roll(){
        die1 = (int) (Math.random()*6)+1;
        die2 = (int) (Math.random()*6)+1;
    }
    public int getTotal(){
        int sum = die1+die2;
        return sum;
    }
    
}
