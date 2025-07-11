package javal;

import java.util.Scanner;

public class Day3_factorial_number {

	public static void main(String[] args) {
      Scanner fact=new Scanner(System.in);
      
      System.out.println("enter number");
      int num=fact.nextInt();
      
      int store = 1;
      int i = 1;
      
      while (i <= num) {
    	  store = store * i;
    	  i++;
      }
      System.out.println("factorial of " + num + " is: " + store);
	}

}
