package StudentDatabaseApp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private int year;
	private int studentId;
	private static int id=1000;
	private int tuitionBalance;
	private int courseCost=600;
	private String courses="";
	
	public Student (){
		System.out.print("Please enter student first name:");
		Scanner scan=new Scanner(System.in);
		this.firstName=scan.next();
		System.out.print("Please enter student last name:");
		this.lastName=scan.next();
		System.out.print("Please enter student year:");
		this.year=scan.nextInt();
		this.studentId=studentId();
		enrollOnCourse();
		payTuition();
		viewStatus();
		
	}
	//generate student id
	private int studentId() {
		this.id++;
		return Integer.valueOf(this.year+""+this.id);
	}
	//enroll on courses
	private void enrollOnCourse() {
		do{
			System.out.println("Please enter course to enroll(Q for exit): ");
		Scanner course =new Scanner(System.in);
		String enrollCourse=course.nextLine();
		ArrayList <String> coursesList= new ArrayList <String>(Arrays.asList("history101","mathematics101","english101","chemistry101","computer science101"));
		
			if(coursesList.contains(enrollCourse.toLowerCase())) {
			courses=courses+"\n"+enrollCourse;
			tuitionBalance=tuitionBalance+courseCost;
			System.out.println("Congratulations! You have enrolled in "+enrollCourse+".");
		}else if(enrollCourse.equals("Q")||enrollCourse.equals("q")){
			break;
		} else{
			 System.out.println("Please enter a valid course from the list!(Type in the course name as in the list)");
			 System.out.println("Courses list:\nHistory101\nMathematics101\nEnglish101\nChemistry101\nComputer Science101");
		}
		}while(1!=0);
		System.out.println("You have enrolled in the following courses:"+courses);
		System.out.println("Your balance is $"+tuitionBalance+".");
	}
	
	//pay tuition
	public void payTuition() {
		System.out.println("Please enter payment: $");
		Scanner in=new Scanner(System.in);
		int pay=in.nextInt();
		tuitionBalance=tuitionBalance-pay;
		System.out.println("Thank you for your payment of $"+pay+".");
		
	}
	//view balance
	public void viewBalance() {
		System.out.println("Your balance is $"+tuitionBalance+".");
	}
	//view status
	public void viewStatus() {
		System.out.println("Your name is "+firstName+" "+lastName+".");
		System.out.println("Your ID is "+studentId+".");
		System.out.println("You have enrolled in the following courses:"+courses);
		System.out.println("Your balance is $"+tuitionBalance+".");
	}
	

}
