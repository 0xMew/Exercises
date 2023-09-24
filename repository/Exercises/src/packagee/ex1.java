package packagee;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		String adam = "Adam";
		String wontQuit = "n";
		String areuaQuitter;
		int guesses = 0;
		do
		{
			System.out.println("Please, guess my name.");
			String name = in.nextLine();
			guesses++;
			if((name.equals(adam))) 
			{
				System.out.println("Congratulations!");
				System.out.println("Guesses: "+guesses);
						
			}else 
			{
				System.out.println(adam.substring(0,guesses));
			}
			
			System.out.println("Do you want to quit? (y/n)");
			areuaQuitter = in.nextLine();
			
			
			
		} while((areuaQuitter.equals(wontQuit)));
		
		System.out.println("Thank you for playing!");
				
	}

}