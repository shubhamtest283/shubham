package javal;

import java.util.Scanner;

public class Day2 {

	public static void main(String[] args) {
      Scanner shubham=new Scanner(System.in);
      
      System.out.println("Your name is: ");
      String name= shubham.nextLine();
      
      System.out.println("And your age : ");
      int age= shubham.nextInt();
      shubham.nextLine();
      
      System.out.print("And your city: ");
      String city = shubham.nextLine();
      
      System.out.println("Hello " + name +" Your " + age +" years old " + "And you are from " + city);
	}

}
