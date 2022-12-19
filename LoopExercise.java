import java.util.Scanner;

public class LoopExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//to calculate student total mark and average using loops and arrays
		
		//declare an double variable for the number of classes and marks for each class.
		
		double[] numClasses = {88, 92, 95, 87, 99};
		
		//declare double variable for the total marks.
		
		double totalMarks = 0; 
		
		//create a for loop to calculate the total marks
		
		for(double num: numClasses) {
			
			totalMarks = totalMarks + num;
		}
		
		System.out.println("The total marks are: " +totalMarks);

		//create a double and divide total marks by number of classes
		
		double averageMarks = totalMarks/numClasses.length;
		
		//Print the statement and use format to include decimal values for the average.
		System.out.format("The average is: %.2f", averageMarks);
						
		}
	
	
}


