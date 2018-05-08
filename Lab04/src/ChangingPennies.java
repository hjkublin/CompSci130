/* Lab 4, Henno Kublin, 2/28/18 */
import java.util.Scanner;

public class ChangingPennies {
	public static void main(String[] args) {
	// Part 1
	Scanner scnr = new Scanner(System.in);
	System.out.println ("Pennies:");	
	double userPennies = scnr.nextInt();
	double userDollars = (userPennies / 100);
	System.out.println("Dollars: $" + userDollars);
	// Part 2
	int userNewPennies = (int) userPennies;
	int userQuarters = (userNewPennies / 25);
	int userDimes = ((userNewPennies % 25) / 10);
	int userNickels = (((userNewPennies % 25) % 10) / 5);
	int userPennies2 = (((userNewPennies % 25) % 10) % 5);
	System.out.println("Quarters: " + userQuarters);
	System.out.println("Dimes: " + userDimes);
	System.out.println("Nickels: " + userNickels);
	System.out.println("Pennies: " + userPennies2);
	// Part 3
	int newPennies = ((userQuarters * 25) + (userDimes * 10));
	double newDollars = (double) (newPennies);
	newDollars = newPennies / 100;
	System.out.println("Counting only quarters and dimes, you have $" + newDollars);
	//Why will this not convert to anything but $1????
	
	
	}
}
