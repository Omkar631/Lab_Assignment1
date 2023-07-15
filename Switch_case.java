/*WAP to perform the following operation 
     1:Accept age and check eligible for voting or not
	 2:Accept 3 no from the user and find out the greatest
	 3:WAP to accept a no from the user and check it is even or odd
*/


import java.util.*;

public class Switch_case {

	public static void main(String[] args) {
		int age,n1,n2,n3,num,choice;
		Scanner sc=new Scanner(System.in);
		System.out.println("Choose The Following Operations:\n\n1.Eligiblity for Voting"
				+ "\n2.Find The Greatest No\n3.Even or Odd");
		System.out.print("\nOperation You Choose: ");
		choice=sc.nextInt();
		
		switch(choice) {
		
		//Accept age and check eligible for voting or not
		case 1:
			System.out.print("Enter Your Age: ");// requesting User to Enter their age
			age=sc.nextInt();
			
			//Using If else condition for checking the eligibility of the Voter
			if(age>=18) {
				System.out.println("You are Eligible to Vote!!");
			}
			else {
				System.out.println("You are not Eligible to Vote.");
			}
			break;
		
		//Accept 3 no from the user and find out the greatest	
		case 2:
			System.out.print("Enter Three Numbers: ");
			// to accept the three values from the user 
			n1=sc.nextInt();
			n2=sc.nextInt();
			n3=sc.nextInt();
			
			//To Check which no is greatest by using if else
			if(n1>n2 && n1>n3 ) {
				System.out.println(" The Greatest no is "+n1) ;
			}
			 else if(n2>n3&&n2>n1) {
				 System.out.println(" The Greatest no is "+n2) ;
			 }
			 else {
				 System.out.println(" The Greatest no is "+n3) ;
			 }
			break;
		
		//WAP to accept a no from the user and check it is even or odd	
		case 3:
			System.out.print("Enter a number: ");
			num=sc.nextInt();
			
			//Using if else condition for getting Even, Odd Number
			if(num%2==0) {
				System.out.print( num+" is Even Number");
			}
			else {
				System.out.print( num+" is Odd Number");
			}
			break;
			

			
		}
	  

	}

}
