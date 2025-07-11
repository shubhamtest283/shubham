package mini_projects;

import java.util.Scanner;

public class atm {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int balance=0;
    while(true) {
    	System.out.println("1. Check Balance");
    	System.out.println("2. Withdraw Cash");
    	System.out.println("3. Deposit");
    	System.out.println("4. Exit");
    	
    	int choice = sc.nextInt();
    	
    	if(choice == 1) {
    		System.out.println("Your Balance is: ₹" + balance);
    	}
    	else if(choice == 2) {
    		System.out.println("Enter Withdraw Amount: ");
    		int amount= sc.nextInt();
    		if(amount <=balance) {
    			balance -=amount;
    			System.out.println("Withdraw ₹" + amount);
    		}
    		else {
    			System.out.println("insufficient balance");
    		}
    	}else if(choice == 3) {
    		System.out.println("Enter Amount to Deposit: ");
    		int amount = sc.nextInt();
    		balance += amount;
    		System.out.println("Deposited ₹" + amount);
    	}
    	else if (choice == 4){
    		System.out.println("Thank You For Using ATM");
    		break;
    	}
    	else {
    		System.out.println("Invalid Choice");
    	}
    }
	}

}
