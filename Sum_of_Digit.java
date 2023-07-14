//Write  a program to accept a no from the user and find out the sum of digit
package Omkar;

import java.util.Scanner;

public class Sum_of_Digit {

	public static void main(String[] args) {
		int n1,digit,sum;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a No: ");
		n1=sc.nextInt();
		
		//executes until the condition number!=0 becomes false  

		for(sum=0; n1!=0; n1=n1/10)  
		{  
		//finds the last digit and add it to the variable sum      
		sum = sum + n1 % 10;  
		}  
		//prints the result  
		System.out.println("Sum of No: "+sum);  
		}  
		


}
