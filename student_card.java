package mini_projects;

import java.util.Scanner;

public class student_card {
	
	static int calculatetotal(int[] marks) {
		int total = 0;
		for(int mark : marks) {
			total += mark;
		}
		return total;
	}
	static boolean result(int[] marks) {
		for(int mark: marks) {
			if (mark<35) {
				return false;
			}
		}
		return true;	
	}
	static String assingrade(int avg) {
		if (avg >= 75) {
			return "A";
		}
		else if (avg >= 60) {
			return "B";
		}
		else if (avg >= 50) {
			return "C";
	}
		else {
			return "D";
	}
	}
	
	static void studentdetails(String name, int rollno, int[] marks, int total, int avg, String result, String grade ) {
		System.out.println("Name                 : " + name);
		System.out.println("Roll number          : " + rollno);
		System.out.println("Marks                 : " );
		
		for (int mark: marks) {
			System.out.print(mark + " ");
		}
		System.out.println("\nTotal                 : " + total);
		System.out.println("Average                 : " + avg);
		System.out.println("Result                 : " + result);
		System.out.println("Grade                 : " + grade);

	}
	public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    
    System.out.println("Enter Student Name: ");
    String name = scanner.nextLine();
    
    System.out.println("Enter Roll No: ");
    int rollno = scanner.nextInt();
    
    int[] marks = new int[5];
    for(int i=0; i<marks.length; i++) {
    	System.out.println("Enter subject " +(i+1)+ "Marks: ");
    	marks[i] = scanner.nextInt();
    }
    
    int total = calculatetotal(marks);
    int avg = total/marks.length;
    boolean pass = result(marks);
    String result = pass ? "pass":"fail";
    String grades = assingrade(avg);
    
    studentdetails(name, rollno, marks, total, avg, result, grades);
    
	}

}
