
import java.util.Scanner;
import java.util.Random;

public class First_Demo {

	public static void main(String[] args) {
		//Declare local variables always!
		char playAgain = 'y';
		
		
		//Loop the game over and over until the user decides not to
		do {			
			
			//playGame() is a function we will create below
			playAgain = playGame();
			
		//changed below, added or 'Y' if user uses cap y	
		}while (playAgain == 'y' || playAgain == 'Y');
		
		System.out.println("Thanks for playing!");
		
	}
	

	
	//the entire game takes place in this function
	public static char playGame() {
		//Declare variables always!
		char answer;
		Scanner kb = new Scanner(System.in);
		int numberToGuess = 0;
		int guess = 0;
		int guesses = 0;
		boolean success = false;
		
		
		/*
		 * If we want the user to make the guess range, we can make the .nextInt(x)
		 * a scanner variable
		 * 
		 * We'd also need to make numberToGuess a scanner to get input, so all in all
		 * we will get input from the user for numberToGuess and the variable inside
		 * Randon().nextInt(x)
		 */
		
		
		//Random().nextInt(100) means from 0 - 99, this is why
		//we added the 2nd line here, it adds one so it'll be
		//1 - 100 instead of 0 - 99
		numberToGuess = new Random().nextInt(100);
		numberToGuess++;;
		do {
		//game asks question, user can guess, then guesses
		//are logged with guesses++;
		System.out.println("I'm thinking of a number between 1 and 100. Try to guess it!");
		guess = kb.nextInt();
		guesses++;
		
		//we need to figure out if the user guessed correctly here
		if (guess == numberToGuess) {
			System.out.println("You guessed right! it only took you " + guesses + " guesses!");
			success = true;
		}
		else if (guess < numberToGuess){
			System.out.println("Sorry, that guess was too low");
		}
		else {
			System.out.println("Sorry that guess was too high");
		}
		}while(success == false);
	
		//Ask the user if they want to continue
		System.out.println("Do you want to play again? (y/n)");
		//.charAt(0)gets just the first character of their response
		answer = kb.next().charAt(0);
		return answer;
		
		
		
	}
	
}
