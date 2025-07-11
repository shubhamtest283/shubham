package javal;

import java.util.Scanner;

public class student_report_card {

	public static void main(String[] args) {
          Scanner marks=new Scanner(System.in);
          int [] subject_marks = new int[5];
          int total=0;
          System.out.println("enter your name: ");
          String name = marks.nextLine();
          
          System.out.println("enter your location: ");
          String city = marks.nextLine(); 
         
          for(int i=0; i<5; i++) {
        	  System.out.println("enter marks for subject " + (i + 1) + ": ");
              subject_marks[i] = marks.nextInt();
              total += subject_marks[i];
          }
          int avg = total/subject_marks.length;
          System.out.println("\n ------- Report Card for " + name + "-------");
          System.out.println("student name      :  " + name);
          System.out.println("student location  :  " + city);
          
            System.out.print("marks             :  ");
          for(int mark : subject_marks) {
        	  System.out.print(mark + " ");
            }
           System.out.println();
           System.out.println("Total             :  " + total);
           System.out.println("Average           :  " + avg);
           
         boolean  pass = true;
         for(int mark : subject_marks) {
        	 if (mark<=35) {
        		 pass=false;
        		 break;
        	 }
         }
         if(pass) {
        	 System.out.println("Result            :  Pass");
         }
         else {
        	 System.out.println("Result            :  fail");
         }
         
          int gradecategory = avg/10;
          String grade;
   
         switch(gradecategory) {
         case 10:
         case 9:
        	 grade = "A";
        	 break;
        	 
         case 8:
        	 grade = "B";
        	 break;
        	 
         case 7:
        	 grade = "C";
        	 break;
        	 
         case 6:
        	 grade = "D";
        	 break;
        	 
         case 5: 
        	 grade = "E";
        	 break;
        	 
         case 4:
        	 grade = "F";
        	 break;
        	 
         case 3:
        	 grade = "G";
        	 break; 
        	
         case 2:
        	 grade = "H";
        	 break;
        	 
         default:
        	 grade = "F";
        	 break;
         }
         System.out.println("Grade             :  " + grade);
	}
}
