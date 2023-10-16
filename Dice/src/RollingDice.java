import java.util.Random;

public class RollingDice {

	public static void main(String[] args) {
		
		Random rand = new Random();
		// use random number generator to get 1 of 6 integers you need to use + 1 when using it
		int x = rand.nextInt(6) + 1;
		System.out.println("You rolled a: " + x);

	}

}
