package javal;

import java.util.Scanner;

public class Day2calculator {

	public static void main(String[] args) {
    Scanner calci=new Scanner(System.in);
    
    System.out.println("enter your first value: ");
    int value1 = calci.nextInt();
    
   System.out.println("enter your second value: ");
    int value2 = calci.nextInt();
   
    int sum= value1+value2;
    int sub= value1-value2;
    int div= value1/value2;
    int mult= value1*value2;
    
    System.out.println("your final value is: " + sub);
		
	}
	}


