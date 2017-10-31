import jp.ac.uryukyu.ie.ex3.pair10.*;

public class Main {
    public static void main (String[] args) {
	Dice dice = new Dice();
	dice.play();
	System.out.println(dice.getValue());
	for (int i = 0;i < 10; i ++) {
	    ExDice exdice = new ExDice(5,7);
	    System.out.println("exdice"+i+"回目: "+exdice.getValue());
	}
    }
}