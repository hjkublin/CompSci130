import java.util.Random;

public class Exam {

	public static void main(String[] args) {
		System.out.println("*************************");
		System.out.println("* Henno Kublin");
		System.out.println("* Part 1");
		System.out.println("*************************");
		
		double rangeMin = 1.0;
		double rangeMax = 25.0;
		Random rand = new Random();
		double myNum = rangeMin + (rangeMax - rangeMin) * rand.nextDouble();
		System.out.println(myNum);
		myNum = myNum + 65;
		int v = (int) myNum;
		System.out.println("ASCII value is " + v);
		char c = (char) v;
		System.out.println("Awhich is the same as " + c);
		
		System.out.println("*************************");
		System.out.println("* Part 2");
		System.out.println("*************************");
		
		int temp = rand.nextInt(99) - 100;
		System.out.println("Current temperature is " + temp + " F");
		if (temp >= 80) {
			System.out.println("Turn the air conditioning on!");
		} else if (temp > 65 && temp < 79) {
			System.out.println("What a nice day!");
		} else if (temp > -49 && temp < 64) {
			System.out.println("Turn the heat on!");
		} else if (temp <= -50) {
			System.out.println("Your spit will freeze before it hits the ground!");
		}
		
		System.out.println("*************************");
		System.out.println("* Part 2");
		System.out.println("*************************");
		
		int initialHeading = rand.nextInt(90) + 1;
		Compass myCompass = new Compass();
		myCompass.Constructor(initialHeading);
		System.out.println("Initial heading is " + myCompass.getHeading() + " degrees.");
		myCompass.rotate(10);
		System.out.println("After rotating 10 degrees, heading is " + myCompass.getHeading() + " degrees.");
		myCompass.rotate(1060);
		System.out.println("After rotating 1060 degrees, heading is " + myCompass.getHeading() + " degrees.");
		myCompass.rotate(-90);
		System.out.println("After rotating -90 degrees, heading is " + myCompass.getHeading() + " degrees.");
		
		/* extra credit */
		myCompass.getCardinalDirection();
	}
}
