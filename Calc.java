import java.util.Scanner;

public class Calc{
	
	public static void main(String[] args){
		
	Calc c = new Calc();
		c.calculator();
	}
	
	void calculator(){
		Scanner input = new Scanner(System.in);
		double answer,temp ;
		System.out.println("Basic Calculator");
		System.out.println("User can use any of these operator"+"\n"+"+ , - , / , * ");
		System.out.println("Enter First Number");
		double first_number = input.nextDouble();
		System.out.println("Enter Second Number");
		double second_number = input.nextDouble();
		System.out.println("Enter the operator to calculate");
		String operator = input.next();
		switch(operator){
			case "+":
				answer = first_number + second_number;
				System.out.println(answer);
				break;
			case "-":
				answer = first_number - second_number;
				System.out.println(answer);
				break;
			case "/":
				answer = first_number / second_number;
				System.out.println(answer);
				break;
			case "*":
				answer = first_number * second_number;
				System.out.println(answer);
				break;
			default:
				System.out.println("Operator is invalid");
		}	
		input.close();
	}
	
}