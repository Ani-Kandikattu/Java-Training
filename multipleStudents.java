import java.util.Scanner;

public class multipleStudents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// int array to hold grades;

		int[][] Grades = new int[2][4];

		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < 2; i++) {

			for (int j = 0; j < 4; j++) {

				System.out.println("Enter Student " + (i + 1) + "'s grades for subject " + (j + 1) + ":");
				Grades[i][j] = scanner.nextInt();

			}

		}
		
		for (int i = 0; i <2; i++) {
				int sum = 0;
			for (int j = 0; j < 4; j++) {
				
				System.out.println("Grades for subject " + (j + 1) + " for student  " + (i + 1) + ":" +Grades[i][j]);
				sum = sum + Grades[i][j];
				
			}
			System.out.println("Total grades for Student " +(i+1)+ ": " +sum);
			System.out.println("Average grades for Student " +(i+1)+ ": " + sum/4);
		}
		
		scanner.close();
	}

}
