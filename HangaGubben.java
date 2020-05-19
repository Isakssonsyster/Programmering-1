package Slutprojekt;

import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;



public class HangaGubben{

	static Scanner input = new Scanner(System.in);
	public static ArrayList<String> hardLevel;
	public static ArrayList<String> regularLevel;
	public static ArrayList<String> easyLevel;
	public static String CorrectAnswerForHard;
	public static String CorrectAnswerForRegular;
	public static String CorrectAnswerForEasy;
	public static int ammountOfGuessesWrong;
	public static char _answerByPlayer;
	public static int _levelAnswerByPlayer = input.nextInt();
	
	/*
	 * 
	 * Creates the different variables, that you can call uppon in the different methods
	 * 
	 */
	
	
	public static void main(String[] args) {
		
		welcomeToGame();
		
		
	}
	
	/**
	 * 
	 * This method is made for the game to be played in the console
	 * 
	 */
	
	public static void welcomeToGame(){
		
		System.out.println("Hello and welcome to Hangman!");
		
		System.out.println("\nHangman is a game about guessing what the" 
				+"\nright word is, you will be able to guess what the word"
				+"\nis until you either get the right word or your man is hanged");
		
		choosingLevelOfGame();
	}
	
	/**
	 * 
	 * This method is made to welcome the player to the game,
	 * it is also made to explain how to play the game.
	 * 
	 */
	
	public static void choosingLevelOfGame() {
		
		System.out.println("\nWhich difficulty level would you like to play?"
				+"\n1=Easy, which will have a sentence with less than 5 letters." 
				+"\n2=Regular, Which has a sentence with less than 10 words." 
				+"\n3=Hard, which has a word less than 20 words." );
		
				
		switch(_levelAnswerByPlayer) {
		
		case 1:
			
			easyLevelSetup();
			
		case 2:
			
			regularLevelSetup();			
		case 3:
			
			hardLevelSetup();
			
			
		}
		
	}
	
	/**
	 * 
	 * This method is made for the player to choose which difficulty level
	 * they want to play on.
	 * 
	 */
	
	
	public static void levelsArrayLists() {
		
		
		hardLevel = new ArrayList<String>();
		regularLevel = new ArrayList<String>();
		easyLevel = new ArrayList<String>();
		
		hardLevel.add("Aberration");
		hardLevel.add("Bombastic");
		hardLevel.add("Commensurate");
		hardLevel.add("Turpitude");
		hardLevel.add("Ubiquitous");
		
		regularLevel.add("Futuristic");
		regularLevel.add("Acknowledgement");
		regularLevel.add("Imagine");
		regularLevel.add("Religion");
		regularLevel.add("Diverse");
		
		easyLevel.add("Cat");
		easyLevel.add("Arm");
		easyLevel.add("Mom");
		easyLevel.add("Face");
		easyLevel.add("Knife");		
		
		Random arrayItem = new Random(); 
		
		CorrectAnswerForHard = hardLevel.get(arrayItem.nextInt());
		CorrectAnswerForRegular = regularLevel.get(arrayItem.nextInt());
		CorrectAnswerForEasy = easyLevel.get(arrayItem.nextInt());

	}
	
	/**
	 * 
	 * This method is made to create array lists to the different
	 * difficulty levels. It is also creating the correct answer depending
	 * on the difficulty level.
	 * 
	 */
		
			
	public static void theConstructOfGame() {
		
		if(_levelAnswerByPlayer == 1) {
			
			rightAnswer(CorrectAnswerForEasy);
			whileLoop(1, CorrectAnswerForEasy);
			endOfGame();

		}
		
		else if(_levelAnswerByPlayer == 2) {
			
			rightAnswer(CorrectAnswerForRegular);
			whileLoop(2, CorrectAnswerForRegular);
			endOfGame();

		}
		
		else if(_levelAnswerByPlayer == 3) {
			
			rightAnswer(CorrectAnswerForHard);
			whileLoop(3, CorrectAnswerForHard);
			endOfGame();

		}

		
	}
	
	/**
	 * 
	 * This method is created to start playing out the actual game in the console.
	 * 
	 */
	
	public static void rightAnswer(String index) {
		
		
		System.out.println("The word you have to guess to is " + index.length() + " letters long");
		
				
		_answerByPlayer = input.nextLine().charAt(0);
				
		
		
	}
	
	/**
	 * 
	 * This method is created to start the actual game, by telling the player how long the
	 * word that is the right answer is going to be.
	 * 
	 * @param _levelAnswerByPlayer
	 * @param index
	 */
	
	public static void whileLoop(int _levelAnswerByPlayer, String index) {
		
		
		
		for(int i = 0; i < index.length(); i++) {
			
		
			
		if(_answerByPlayer != _levelAnswerByPlayer) {
			
			System.out.println("Sorry you guessed wrong\n");
			
			creatingHangman();
			
		}
			
		else if(_answerByPlayer == _levelAnswerByPlayer) {
			
			System.out.println("Good job!");
			
		}
		
			}
			

		}
	
	/**
	 * 
	 * This method was created so that the player can guess a letter in the word,
	 * if they guess wrong, they will be told that the guess was wrong and then it is going to
	 * be showing the man getting hung, depending on how many times the player has guessed wrong.
	 * 
	 */
		
	
	
	public static void creatingHangman() {
			
		if(ammountOfGuessesWrong == 1) {
			System.out.println(" _|___");
		}
		
		else if(ammountOfGuessesWrong == 2) {
			
			System.out.println(	"      _______\r\n" + 
					"     |       \r\n" + 
					"     |       \r\n" + 
					"     |       \r\n" + 
					"     |       \r\n" + 
					"     |       \r\n" + 
					"     |       \r\n" + 
					"    _|___    \r\n");
			}
		
		else if(ammountOfGuessesWrong == 3) {
			
			System.out.println("      _______\r\n" + 
					"     |/         \r\n" + 
					"     |          \r\n" + 
					"     |          \r\n" + 
					"     |          \r\n" + 
					"     |          \r\n" + 
					"     |          \r\n" + 
					"    _|___       \r\n" );
		}
		
		else if (ammountOfGuessesWrong == 4) {
			
			System.out.println("      _______\r\n" + 
					"     |/     | \r\n" + 
					"     |        \r\n" + 
					"     |        \r\n" + 
					"     |        \r\n" + 
					"     |        \r\n" + 
					"     |        \r\n" + 
					"    _|___     \r\n" );
		}
		else if (ammountOfGuessesWrong == 5) {
			
			System.out.println("      _______\r\n" + 
					"     |/     |  \r\n" + 
					"     |     (_) \r\n" + 
					"     |         \r\n" + 
					"     |         \r\n" + 
					"     |         \r\n" +
					"     |         \r\n" + 
					"    _|___      \r\n" );
		}
		else if (ammountOfGuessesWrong == 6) {
			
			System.out.println("      _______\r\n" + 
					"     |/     |  \r\n" + 
					"     |     (_) \r\n" + 
					"     |      |  \r\n" + 
					"     |      |  \r\n" + 
					"     |         \r\n" +
					"     |         \r\n" + 
					"    _|___      \r\n" );
		}
		
		else if (ammountOfGuessesWrong == 7) {
			
			System.out.println("      _______\r\n" + 
					"     |/     |  \r\n" + 
					"     |     (_) \r\n" + 
					"     |      |/  \r\n" + 
					"     |     /|  \r\n" + 
					"     |         \r\n" +
					"     |         \r\n" + 
					"    _|___      \r\n" );
		}
		
		else if (ammountOfGuessesWrong == 7) {
			
			System.out.println("      _______\r\n" + 
					"     |/     |  \r\n" + 
					"     |     (_) \r\n" + 
					"     |      |/  \r\n" + 
					"     |     /|   \r\n" + 
					"     |     / |  \r\n" +
					"     |          \r\n" + 
					"    _|___       \r\n" );
		}
	}
	
	
	/**
	 * 
	 * This method is created to type out the man being hung, depending 
	 * on how many guesses the person has guessed wrong.
	 * 		
	 */
	public static void endOfGame() {
		
		if(ammountOfGuessesWrong == 7) {
			
			System.out.println("Oh no, the man got hung, that is so sad"
					+ "\nOh well, would you lika to play again? ");
			
			String playAgainOrNot = input.nextLine();
			
			switch (playAgainOrNot) {
				
				case "Yes":
					
					System.out.println("Alright let's go then!");
					
					welcomeToGame();
				case "No":
					
					System.out.println("Okay, that is fine goodbye!");
					
					break;
		}
		}
		
		else{
			
			System.out.println("Yay! Congratulations, you won the game!"
					+ "\nWould you lika to play again? ");
			
			String playAgainOrNot = input.nextLine();
			
			switch (playAgainOrNot) {
				
				case "Yes":
					
					System.out.println("Alright let's go then!");
					
					welcomeToGame();
				case "No":
					
					System.out.println("Okay, that is fine goodbye!");
					
					break;
			}
			
		}
		
	}
	
	/**
	 * 
	 * This method is created to end the game when the man has been
	 * hung. It asks the player if they want to play again and then they
	 * can choose wether or not they want to play again.
	 * 
	 */
}