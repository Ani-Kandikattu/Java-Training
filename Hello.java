import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		float num1;
		float num2;
		String operator;
//		String name;
//		System.out.println("Enter two numbers and your name: ");
//		num1 = scanner.nextInt();
//		num2 = scanner.nextInt();
//		name = scanner.next();
//		System.out.println("Your name is " +name+ " and your numbers are: " +num1+ " and " +num2);

		System.out.println("Enter 1st number: ");
		num1 = scanner.nextFloat();
		System.out.println("Enter 2nd number: ");
		num2 = scanner.nextFloat();
		System.out.println("Enter operator character: ");
		operator = scanner.next();

		if (operator.equals("+")) {
			System.out.println(num1 + num2);
			
		}
		else if (operator.equals("-")) {
			System.out.println(num1 - num2);
		}
		else if (operator.equals("*")) {
			System.out.println(num1*num2);
		}
		else if (operator.equals("/")) {
			System.out.println(num1/num2);
		}
		else {
			System.out.println("Invalid input for operator.");
		}

		scanner.close();

	}

}
