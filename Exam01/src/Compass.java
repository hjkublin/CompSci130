import java.util.Random;

public class Compass {
	
	private static int curHeading;
	
	public void Constructor(int desiredNum) {
		curHeading = desiredNum;
}
	public void getCardinalDirection() {
		String direction = new String();
		if (curHeading >= 0 && curHeading < 23) {
			System.out.println("You are facing east.");
		} else if (curHeading >= 23 && curHeading < 68) {
			System.out.println("You are facing northeast.");
		} else if (curHeading >= 68 && curHeading < 113) {
			System.out.println("You are facing north.");
		} else if (curHeading >= 113 && curHeading < 158) {
			System.out.println("You are facing northwest.");
		} else if (curHeading >= 158 && curHeading < 203) {
			System.out.println("You are facing west.");
		} else if (curHeading >= 203 && curHeading < 248) {
			System.out.println("You are facing southwest.");
		} else if (curHeading >= 248 && curHeading < 293) {
			System.out.println("You are facing south.");
		} else if (curHeading >= 293 && curHeading < 338) {
			System.out.println("You are facing southeast.");
		} else if (curHeading >= 338 && curHeading <= 360) {
			System.out.println("You are facing east.");
		}
		
}
	public int getHeading() {
		return curHeading;
}
	public void rotate(int angle) {
		curHeading = curHeading + angle;
		if (curHeading < 0) {
		curHeading = curHeading + 360;
		} else if (curHeading > 360 && curHeading < 720) {
		curHeading = curHeading - 360;
		} else if (curHeading > 720 && curHeading < 1080) {
		curHeading = curHeading - 720;
		} else if (curHeading > 1080) {
		curHeading = curHeading - 1080;
		}
}
	public static void main(String[] args) {
		Random rand = new Random();
		curHeading = rand.nextInt(359)+ 1;
		
		}

}
