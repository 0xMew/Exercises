package packagee;

public class ex2 {

	public static void main(String[] args) 
	{
		String creator = "Adam";
		int number1 = 1;
		int number2 = 3;
		int multiplication;
		int addition;
		int subtraction;
		double division;
		
		System.out.println("Printer App");		
		System.out.println("This app is made by:"+ creator);
		
		
		System.out.println(number1);
		//it works i guess
		
		System.out.println("The value of number1 is "+number1);
		//now i change the value of number1
		
		number1 = 3;
		System.out.println("The value of number1 is "+number1);
		System.out.println("The value of number2 is "+number2);
		
		
		multiplication = number1 * number2;
		addition = number1 + number2;
		division = number1 / number2;
		subtraction = number1 - number2;
		
		System.out.println("3*3= "+multiplication);
		System.out.println("3+3= "+addition);
		System.out.println("3-3= "+subtraction);
		System.out.println("3/3= "+division);
	}

}
