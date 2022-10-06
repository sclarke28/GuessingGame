package classlab;
//Java Program to guess a Random Number 

import java.util.Scanner;
  public class whoGFG2 {
	//Function that implements the 
			// number guessing game 
			public static void 
			guessingNumberGame()
			{	
				
				// Scanner Class
				Scanner sc = new Scanner(System.in);
				
				// Generate the numbers
				int number = 1 + (int)(100
										* Math.random());
				
				// Given S trials 
				int S = 4;
				
				int i, guess;
				
				System.out.println(
						"A number is chosen"
						+ " between 1 to 100."
						+ " Guess the number"
						+ " within 4 trials.");
				
				//Iterate over S trials 
				for (i = 0; i < S; i++) {
					
					System.out.println(
							"Guess the number :");
					// Take input for guessing
					guess = sc.nextInt();
					
					//If the number is guessed
					if (number == guess) {
						System.out.println(
								"Congratulations!"
								+" You guessed the number.");
						break;
					}
						else if ( number > guess
								&& i !=S - 1) {
							System.out.println(
									"The number is"
									+ " greater than " + guess);
						}
						else if (number < guess
								&& i !=S -1) {
							System.out.println(
									" The number is"
									+" less than " + guess);
						}
					}	
					 if(i==S) {
						 System.out.println(
								 "You have exhausted"
								 + " S trials.");
						 System.out.println(
								 "The number was" + number);
					 }
 					 }
					// Drive Code
					public static 
					void main(String arg[])
					{	
						// Function Call
						guessingNumberGame();
						
					}
				
		}




