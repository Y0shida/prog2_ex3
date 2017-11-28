import jp.ac.uryukyu.ie.pair02.*;

public class Main{
    public static void main(String[] args){
        Dice dice = new Dice();
        dice.play();
        System.out.println(dice.getValue());
    }
}
