package StudentDatabaseApp;

import java.util.Scanner;

public class StudentDatabaseApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Ask the user how many new students will be added
		System.out.print("Please enter number of students to add:");
		Scanner scan =new Scanner(System.in);
		int numberOfStudents=scan.nextInt();
		Student [] students=new Student[numberOfStudents];
		for(int i=1;i<=numberOfStudents;i++) {
			students[i-1]=new Student();
		}
		
		
	}

}
