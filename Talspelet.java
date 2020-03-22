import java.util.Scanner;
import java.util.Random;

public class Talspelet {
	
	static Scanner input = new Scanner(System.in);
	
	protected static int _RightAnswer;				//Skapar variabeln f�r Det r�tta svaret p� fr�gorna
	protected static int _Guesses;					//Skapar variabeln f�r antalet gissningar spelaren har p� sig

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
		 * I b�rjan av programmet v�lkomnar den spelaren till spelet.
		 * Programmet f�rklarar �ven vad spelet g�r ut p� f�r spelaren.
		 * Det visar �ven vad spelaren ska g�ra i spelet.
		 * Jag har anv�nt System.out.println(); f�r detta d� det var det 
		 * mest effektiva uttrycket att anv�nda sig utav f�r detta.
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
			 * I den h�r delev av programmet har jag anv�nt mig utav en switch-case
			 * det fungerar genom om spelaren ska skriva in ett svar, som i detta fallet
			 * var ett heltal mellan 1-3.
			 * Kan man skriva in det som ska h�nda beroende p� vilken case spelaren v�ljer
			 * i detta fallet skriver programmet en kommentar beroende p� sv�righetsgraden du valt
			 * och sedan startar programmet f�r den sv�righetsgrad personen har valt.
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
		 * I dessa tre metoder �ver har jag skrivit i princip likadan kod i alla,
		 * jag valde att b�rja med att skriva ut om personen �r redo att spela.
		 * F�r att detta skulle fungera gjorde jag en switch-case som har tv� alternativ:
		 * 1 och 2. Om man skriver in 1 kommer sj�lvaste spelet f�r den sv�righetsgrad du valt att starta,
		 * klickar du d�remot 2 kommer fr�gan att st�llas om till spelaren skriver 1, allts� ja.
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
		 * I denna metod skapar jag s� att programmet senare kan randomize
		 * en siffra mellan tv� tal beroende p� vilken sv�righetsgrad spelaren har valt.
		 * jag g�r dettta genom att anv�nda mig utav Random uttrycket.
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
		 * I den h�r delen av metoden best�mmer jag att antalet gissningar man f�r
		 * i spelet �r 10. 
		 * Sedan best�mmer �ven programmet vad det r�tta svaret ska vara genom att
		 * jag skrev att det r�tta svaret = metoden f�r att f� fram det( det h�gsta 
		 * talet det kan vara, det l�gsta talet det f�r vara.
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
				 * I den h�r delen av metoden skriver jag f�rst en for-loop
				 * som visar att det ska repeteras till alla 10 gissningar �r slut.
				 * _Guesses--; betyder att gissningarna minskar med ett efter varje gissning.
				 * Sedan st�r det vad som ska skrivas ut osv. om spelaren svarar r�tt.
				 * Spelaren ska d� f� v�lja om han/hon vill spela om eller l�mna spelet, 
				 * detta fungerar p� grund av en if och else if-sats, som g�r att om 
				 * spelaren skriver 1, startar spelet fr�n b�rjan, skriver spelaren d�remot
				 * 2 s�ger programmet hejd� och inget mer h�nder.
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
				 * H�r forts�tter spelet s�l�nge gissningarna inte har blivit 0.
				 * Om talet spelaren skriver in �r mindre �n det r�tta svaret
				 * kommer programmet att skriva ut att talet �r h�gre och hur m�nga
				 * gissningar spelaren har kvar.
				 * Om talet som spelaren skriver in d�remot �r h�gre �n svaret
				 * kommer programmet att skriva ut att talet ska vara l�gre 
				 * och hur m�nga gissningar som spelaren har kvar.
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
				 * Det h�r �r det sista i spelet och d� �r det om personen har f�tt slut p� gissningar.
				 * D� har personen samma val som om den skulle ha vunnit, 
				 * d�remot �r texten som programmet skriver ut annorlunda d� personen har f�rlorat och inte vunnit.
				 * 
				 */
			
				
	}

		
							
			
		
		
}
