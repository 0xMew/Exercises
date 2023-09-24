package packagee;

import java.util.Random;
import java.util.Scanner;


public class ex3
{

	public static void main(String[] args) {
		
		Random rand = new Random();
		
		String quitter = "c";
		String isQuitter;
		
		int money = 1;
		
		Scanner in = new Scanner(System.in);
		Scanner in2 = new Scanner(System.in);
		
		System.out.println("Welcome to the lucky 7!");
		System.out.println("How much money do you want to spend?");
		
		money = in.nextInt();
		
		do 
		{
			int r1 = rand.nextInt(0,11);
			int r2 = rand.nextInt(0,11);
			int r3 = rand.nextInt(0,11);
			
			System.out.println("You currently have "+money+" coins.");
			
			System.out.println(r1);
			System.out.println(r2);
			System.out.println(r3);
			
			money--;
			
			if(r1 == 7 || r2 == 7 || r3 == 7) 
			{
				System.out.println("You won 3 coins.");
				money = money + 3;
				
			} else {
			
				System.out.println("You won nothing.");
				
			}
			
			System.out.println("Do you want to keep playing? Press c to continue.");
			isQuitter = in2.nextLine();
			
			
		} while(isQuitter.equals(quitter) && (money >= 0));
		
		System.out.println("Thank you for playing");
		
	}

}
