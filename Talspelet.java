import java.util.Scanner;
import java.util.Random;

public class Talspelet {
	
	static Scanner input = new Scanner(System.in);
	
	protected static int _RightAnswer;				//Skapar variabeln för Det rätta svaret på frågorna
	protected static int _Guesses;					//Skapar variabeln för antalet gissningar spelaren har på sig

	public static void main(String[] args) {
		
		BegginingOfGame();
		
		}
	
	public static void BegginingOfGame() {
		
				
		System.out.println("Hello and welcome to Guess The Number!");
		
		System.out.println("\nThis is a game that involves that you are going to have a number to guess,"
				+ "\nyou do not know the number so you will have to guess, the game is "
				+ "\nalso going to give you clues.");
		
		/**
		 * 
		 * I början av programmet välkomnar den spelaren till spelet.
		 * Programmet förklarar även vad spelet går ut på för spelaren.
		 * Det visar även vad spelaren ska göra i spelet.
		 * Jag har använt System.out.println(); för detta då det var det 
		 * mest effektiva uttrycket att använda sig utav för detta.
		 * 
		 */
	
		System.out.println("\nWould you like to play the 1. hard, 2. regular or 3. easy version?"
				+ "\n\nIf you choose 1. hard, you will have to guess a random number between 0 and 500."
				+ "\nIf you choose 2. regular, you will guess a random number between 0 and 100."
				+ "\nIf you choose 3. easy, you will guess a random number between 0 and 50."
				+ "\n\nWrite one of the numbers, please");
		
		int LevelAnswer = input.nextInt();
		
			switch(LevelAnswer) {
			
			case 1:
				System.out.println("Oh so you want a challenge? Okay let's go!");
				
				HardVersion();
				
			case 2:
				System.out.println("Are you stuck in the middle? That's okay I am too");
				
				MediumVersion();

				break;

			case 3:
				System.out.println("So you want an easy challenge? Ok let's start");
				
				EasyVersion();
				
				break;
			
				}
			
			/**
			 * 
			 * I den här delev av programmet har jag använt mig utav en switch-case
			 * det fungerar genom om spelaren ska skriva in ett svar, som i detta fallet
			 * var ett heltal mellan 1-3.
			 * Kan man skriva in det som ska hända beroende på vilken case spelaren väljer
			 * i detta fallet skriver programmet en kommentar beroende på svårighetsgraden du valt
			 * och sedan startar programmet för den svårighetsgrad personen har valt.
			 * 
			 */
				
			
			}
	
		public static void HardVersion() {
			
			System.out.println("Are you ready to play?"
					+ " 1. Yes or 2. No");
			
			int ReadyAnswer = input.nextInt(); 
			
			switch(ReadyAnswer) {
			
			case 1:
				
				System.out.println("Okay let's start! ");
				
				TheGame(500, 0);
				
				break;
			
			case 2:
				
				while(ReadyAnswer == 2) {
					
					HardVersion();

				}
			}			
		}
		
		
		
		public static void MediumVersion() {
			
			System.out.println("Are you ready to play?"
					+ " 1. Yes or 2. No");
			
			int ReadyAnswer = input.nextInt(); 
			
			switch(ReadyAnswer) {
			
			case 1:
				
				System.out.println("Okay let's start! ");
				
				TheGame(100, 0);
				
				break;
			
			case 2:
				
				while(ReadyAnswer == 2) {
					
					MediumVersion();

				}
			}
		}
		
		
		
		public static void EasyVersion() {
			
			System.out.println("Are you ready to play?"
					+ " 1. Yes or 2. No");
			
			int ReadyAnswer = input.nextInt(); 
			
			switch(ReadyAnswer) {
			
			case 1:
				
				System.out.println("Okay let's start! ");
				
				TheGame(50, 0);
				
				break;
			
			case 2:
				
				while(ReadyAnswer == 2) {
					
					EasyVersion();

				}
			}			
		}
		
		/**
		 * 
		 * I dessa tre metoder över har jag skrivit i princip likadan kod i alla,
		 * jag valde att börja med att skriva ut om personen är redo att spela.
		 * För att detta skulle fungera gjorde jag en switch-case som har två alternativ:
		 * 1 och 2. Om man skriver in 1 kommer självaste spelet för den svårighetsgrad du valt att starta,
		 * klickar du däremot 2 kommer frågan att ställas om till spelaren skriver 1, alltså ja.
		 * 
		 */
		

		/*
		 * @param _highest
		 * @param _lowest
		 * @return
		 */
		
		public static int RightAnswer(int _highest, int _lowest) {
			
			Random RightAnswer = new Random();
			
			return RightAnswer.nextInt(_highest - _lowest + 1) + _lowest;
		}
		
		/**
		 * 
		 * I denna metod skapar jag så att programmet senare kan randomize
		 * en siffra mellan två tal beroende på vilken svårighetsgrad spelaren har valt.
		 * jag gör dettta genom att använda mig utav Random uttrycket.
		 * 
		 */
		
		
		/*
		 * @param highest
		 * @param lowest
		 */
		
		public static void TheGame(int highest, int lowest) {
			
			System.out.println("Write your guess: "); 
			
			_Guesses = 10;
			
			_RightAnswer = RightAnswer(highest, lowest);
			
		/**
		 * 
		 * I den här delen av metoden bestämmer jag att antalet gissningar man får
		 * i spelet är 10. 
		 * Sedan bestämmer även programmet vad det rätta svaret ska vara genom att
		 * jag skrev att det rätta svaret = metoden för att få fram det( det högsta 
		 * talet det kan vara, det lägsta talet det får vara.
		 * 
		 */
						
			for(int i = 0; i <= _Guesses; i--) {
				
				int PlayerAnswer = input.nextInt();
				_Guesses--;
				
				
			if(PlayerAnswer == _RightAnswer) {
				
				System.out.println("\nCongratulations you got it right and won this game!"
						+ "you can play again if you want to \n" 
						+ "\nif yes, type 1 and if you don't want to type 2: "); 
						
						int PlayAgain_Answer = input.nextInt();
									
						if(PlayAgain_Answer == 1) {
										
							BegginingOfGame();
							
									
					 } else if(PlayAgain_Answer == 2) { 
										 
							System.out.println("Okay, bye bye!"); 
										
							break;
								
							
					}
				
				/**
				 * 
				 * I den här delen av metoden skriver jag först en for-loop
				 * som visar att det ska repeteras till alla 10 gissningar är slut.
				 * _Guesses--; betyder att gissningarna minskar med ett efter varje gissning.
				 * Sedan står det vad som ska skrivas ut osv. om spelaren svarar rätt.
				 * Spelaren ska då få välja om han/hon vill spela om eller lämna spelet, 
				 * detta fungerar på grund av en if och else if-sats, som gör att om 
				 * spelaren skriver 1, startar spelet från början, skriver spelaren däremot
				 * 2 säger programmet hejdå och inget mer händer.
				 * 
				 */
				
			
			} else if(_Guesses != 0) {
				
					if(PlayerAnswer < _RightAnswer) {
				
						
						System.out.println("Sorry, The Answer is higher than your guess"
								
						+ "\nYou currently have: " +  _Guesses + " left");				
				
						
					} else if(PlayerAnswer > _RightAnswer) {
				
						
						System.out.println("Sorry, The Answer is lower than your guess"
								
						+ "\nYou currently have: " +  _Guesses + " left");
						
			} 
					
				/**
				 * 
				 * Här fortsätter spelet sålänge gissningarna inte har blivit 0.
				 * Om talet spelaren skriver in är mindre än det rätta svaret
				 * kommer programmet att skriva ut att talet är högre och hur många
				 * gissningar spelaren har kvar.
				 * Om talet som spelaren skriver in däremot är högre än svaret
				 * kommer programmet att skriva ut att talet ska vara lägre 
				 * och hur många gissningar som spelaren har kvar.
				 * 
				*/
			} else {
				
				System.out.println("You have no guesses left, I am so sorry"
						+ "\nHowever you can play again if you want to"
						+ "\nif yes, type 1 and if you don't want to type 2: ");
				
				int PlayAgain_Answer = input.nextInt();
				
					if(PlayAgain_Answer == 1) {
					
					BegginingOfGame();
					
					} else if(PlayAgain_Answer == 2) {
					
					System.out.println("Okay, bye bye!");
					
					break;
					
						}
					}
				}
				
				/**
				 * 
				 * Det här är det sista i spelet och då är det om personen har fått slut på gissningar.
				 * Då har personen samma val som om den skulle ha vunnit, 
				 * däremot är texten som programmet skriver ut annorlunda då personen har förlorat och inte vunnit.
				 * 
				 */
			
				
	}

		
							
			
		
		
}
