import java.util.stream.*;

public class Exam {
	
	public static void main (String [] args) {
		
		System.out.println("*************************"); 
		System.out.println("* Henno Kublin");
		System.out.println("* Exam 2");
		System.out.println("*************************");
		
		//Part 1
		System.out.println();
		System.out.println("Testing part 1");
		System.out.println(getTweetTopic("Great to see that score from @ElonWBasketball.\n" + 
				"Congrats on a big win! #LTML @elonphoenix"));	
		
		// Part 2
		System.out.println();
		System.out.println("Testing part 2");
		System.out.println(isBalanced("(This should be true.)"));
		
		// Part 3
		System.out.println();
		System.out.println("Testing part 3");
		int[][] my2DArray = {
		{0, 1, 0},
		{3, 4, 3},
		{6, 7, 6}
		};
		System.out.println(isMirror(my2DArray)); // should be true
			
		}
	
		public static String getTweetTopic(String tweet) {
		int firstHashtag = tweet.indexOf("#"); //0
		int firstSpace = tweet.indexOf(" ", firstHashtag); 
		int lastLetter = tweet.length(); //6
		
		String newString = "";
		
		if (firstHashtag == -1) {
			System.out.println("Tweet N/A");
		} else if(firstSpace != -1) {
			newString = tweet.substring(firstHashtag, firstSpace);
			
		} else {
			newString = tweet.substring(firstHashtag, lastLetter);
			
			}
		return newString;
		}
		
		public static boolean isBalanced(String str) {

			int openParenthCount = str.length() - str.replace("(", "").length();
			int closedParenthCount = str.length() - str.replace(")", "").length();
			int finalBalance = openParenthCount - closedParenthCount;
			
			if (finalBalance == 0) {
				return true;
			} else {
				return false;
			}
		}
		
		public static boolean isMirror(int[][] myArray) {
			int numRows = myArray[0].length;  
			int numCols = myArray.length;     
			boolean mirrored = true;
			int halfRows = numRows / 2;
			return mirrored;
			
			//for(int i = 0; i < myArray.length; i++)
			   // for(int j = 0; j < (myArray[i].length/2)+1; j++)
			     // if(myArray[i][i] == 0) {
			    	  
			      }
			        
			     // else if(myArray[j][i] == 255) //This just slightly increases efficiency
			       // return new int[] {j,i};
			  //return null;
			
			
		}
		
	
