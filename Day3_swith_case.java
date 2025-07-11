package javal;

import java.util.Scanner;

public class Day3_swith_case {

	public static void main(String[] args) {
      //char grade = 'c';
		Scanner grade=new Scanner(System.in);
		
		System.out.println("enter grade");
		String letter = grade.nextLine();
      
      
      switch (letter) {
      case "A":
    	  System.out.println("good");
    	  break;
    	  
      case "B":
    	  System.out.println("excellent");
    	  break;
    	  
      case "C":
    	  System.out.println("average");
    	  break;
    	  
     default :
    	 System.out.println("invalid");
      }
      
      
	}

}
