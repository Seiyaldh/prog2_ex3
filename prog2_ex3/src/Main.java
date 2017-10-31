import jp.ac.uryukyu.ie.ex3.pair10.*;

public class Main {
    public static void main (String[] args) {
	Dice dice = new Dice();
	dice.play();
	System.out.println(dice.getValue());
    }
}