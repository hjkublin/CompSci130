import java.util.Scanner;

public class FirstSection {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      System.out.println("Enter weight 1:");
      double[] userInput = new double[5];
      userInput[0] = scnr.nextDouble();
      
      System.out.println("Enter weight 2:");
      userInput[1] = scnr.nextDouble();
      
      System.out.println("Enter weight 3:");
      userInput[2] = scnr.nextDouble();
      
      System.out.println("Enter weight 4:");
      userInput[3] = scnr.nextDouble();
      
      System.out.println("Enter weight 5:");
      userInput[4] = scnr.nextDouble();
      
      System.out.println("You entered: " + userInput[0] + " " + userInput[1] + " " + userInput[2] + " " + userInput[3] + " " + userInput[4]);
      System.out.println("");
      
      System.out.print("Total weight: ");
      System.out.println(userInput[0] + userInput[1] + userInput[2] + userInput[3] + userInput[4]);
      
      System.out.print("Average weight: ");
      System.out.println((userInput[0] + userInput[1] + userInput[2] + userInput[3] + userInput[4]) / 5);
      double maxInput = 0;
      for (int i = 0; i < userInput.length; ++i) {
         if (userInput[i] > maxInput) {
            maxInput = userInput[i];
         }
      }
      System.out.print("Max weight: " + maxInput);
   }
}