package javal;

import java.util.Scanner;

public class banana {

	public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    
    System.out.println("Enter Farmer Name: ");
    String name= scanner.nextLine();
    
    System.out.println("Enter group Name: ");
    String groupname= scanner.nextLine();
    
    System.out.println("Enter rate: ");
    int rate = scanner.nextInt();
    
    System.out.println("Enter Labourcost: ");
    int labourcost = scanner.nextInt();
    
    int count = 0;
    int sum = 0;
    
    System.out.println("Enter weight of banana bunch: ");
    
    while(true) {
    	int input = scanner.nextInt();
    	
    	if(input == 0) {
    		break;
    	}
    	sum += input;
    	count++;
    }
    
    int average= sum/count;
    float quintles = sum/100;
    float totalamount = quintles*rate;
    float labourcosts = labourcost*count;
    float netamount = totalamount-labourcosts;
   
    
    System.out.println("\n ---------- Banana Harvesting Slip ----------");
    System.out.println("Farmer Name                     : " + name);
    System.out.println("group Name                      : " + groupname);
    System.out.println("rate                            : " + rate);
    System.out.println("Total banana bunch count        : " + count);
    System.out.println("Total kg of banana bunch        : " + sum);
    System.out.println("Total weight of banana bunch    : " + quintles);
    System.out.println("Average                         : " + average);
    System.out.println("Total Amount                    : " + totalamount);
    System.out.println("Labourcost                      : " + labourcosts);
    System.out.println("Payable Amount                  : " + netamount);  
	}
}
