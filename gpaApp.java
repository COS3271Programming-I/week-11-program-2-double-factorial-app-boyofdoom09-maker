package test;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Random;
public class Im {
		static double computeGPA(double[] grades, double[] credits) {
	        double totalPoints = 0;
	        double totalCredits = 0;

	        for (int i = 0; i < grades.length; i++) {
	            totalPoints += grades[i] * credits[i];
	            totalCredits += credits[i];
	        }
	        return totalCredits == 0 ? 0 : totalPoints / totalCredits;
	    }
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the number of courses: ");
	        int numCourses = scanner.nextInt();

	        double[] grades = new double[numCourses];
	        double[] credits = new double[numCourses];

	        for (int i = 0; i < numCourses; i++) {
	            System.out.print("Enter grade for course " + (i + 1) + ": ");
	            grades[i] = scanner.nextDouble();
	            System.out.print("Enter credits for course " + (i + 1) + ": ");
	            credits[i] = scanner.nextDouble();
	        }
	        double gpa = computeGPA(grades, credits);
	        System.out.printf("Your GPA is: %.2f%n", gpa);
	    }
	}

    
    
