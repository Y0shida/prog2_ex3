package jp.ac.uryukyu.ie.pair02;

public class ExDice extends Dice{
    private int minValue;
    private int maxValue;

    public ExDice(int minValue, int maxValue){
        this.minValue = minValue;
        this.maxValue = maxValue;
        play();
    }
    
    public void play(){
        setValue((int)(Math.random() * (this.maxValue-this.minValue+1)) + this.minValue);
    }
}