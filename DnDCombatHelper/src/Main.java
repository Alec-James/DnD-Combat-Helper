
public class Main {

	public static void main(String args[]) {
		Dice d6 = new Dice(6);
		Dice d20 = new Dice(20);
		int value;
		value = d6.roll(); 
		System.out.println("D6: " + value);
		value = d20.roll(); 
		System.out.println("D20: " + value);
	}
}
