package javal;

import java.util.Scanner;

public class Day3 {

	public static void main(String[] args) {
     
		Scanner number=new Scanner(System.in);
	
		
		System.out.println("enter number");
		int num= number.nextInt();
		
		if(num % 2 ==0) {
			System.out.println(num + " is even number");
		}
		else 
			System.out.println(num + " is odd number");
	}

}
