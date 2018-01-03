package se_105598067hw4;
import java.util.Scanner;

public class Main {
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		char grade;
		while (true) {
			System.out.print("Your score:");
			grade = LetterGrade.letterGrade(scanner.nextInt());
			System.out.println("Your grade is " + grade);
		}
	}

}
