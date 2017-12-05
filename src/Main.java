import jp.ac.uryukyu.ie.pair02.*;

public class Main{
    public static void main(String[] args){
        Dice dice = new Dice();
        ExDice exdice = new ExDice(5,7);
        dice.play();
        System.out.println(dice.getValue());

        for(int i = 0; i<10; i++){
            exdice.play();
            System.out.println("exdice"+i+"回目:"+ exdice.getValue());

        }
    }
}
