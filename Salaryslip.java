package javal;

import java.util.Scanner;

public class Salaryslip {

	public static void main(String[] args) {
       Scanner scanner=new Scanner(System.in);
       
       
       System.out.println("Enter your name: ");
       String name = scanner.nextLine();
       
       System.out.println("Enter your departement: ");
       String department = scanner.nextLine();
       
       System.out.println("Enter your Basicsalary: ");
       int basicsalary = scanner.nextInt();
       
       System.out.println("Enter your hra: ");
       int homeA = scanner.nextInt();
       
       System.out.println("Enter your DA: ");
       int das = scanner.nextInt();
       
       System.out.println("Enter your PF: ");
       int proftax = scanner.nextInt();
       
       int hra = basicsalary*homeA/100;
       
       int da = basicsalary*das/100;
       
       int pf = basicsalary*proftax/100;
       
       int netsalary = basicsalary+hra+da-pf;
       
       int gradecode;
         
       if (netsalary >= 50000) {
    	  gradecode = 1; 
       }
       else if(netsalary >= 30000 && netsalary <49999) {
    	   gradecode = 2;
       }
       else if(netsalary >= 20000 && netsalary <29999) {
    	   gradecode = 3;
       }
       else if(netsalary >= 10000 && netsalary <19999) {
    	   gradecode = 4;
       }
       else {
    	   gradecode = 5;
       }
       
       String grade;
       
       switch (gradecode) {
       case 1:
    	   grade = "A";
    	   break;
       case 2:
    	   grade = "B";
    	   break;
       case 3:
    	   grade = "C";
    	   break;
       case 4:
    	   grade = "D";
    	   break;
       default:
           grade = "Unknown";
       }
       
       System.out.println("\n------ " + name + " Salary Slip------");
       System.out.println("Employee Name              :  " + name);
       System.out.println("Employee Department        :  " + department);
       System.out.println("Employee Basicsalary       :  " + basicsalary);
       System.out.println("Employee HRA               :  " + hra);
       System.out.println("Employee DA                :  " + da);
       System.out.println("Employee PF                :  " + pf);
       System.out.println("Employee Net Salary        :  " + netsalary);
       System.out.println("Employee Grade             :  " + grade);

	}

}
