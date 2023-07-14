//WAP to Accept a No from the user and find out the Factorial
package Omkar;
import java.util.*;
public class Factorial {

	public static void main(String[] args) {
		int num,fact=1;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a No: ");
		num=sc.nextInt();
		
		//Using While Loop for getting Factorial of the input value
		while(num>=1)
		{
			fact=fact*num;
			num--;	  
		}
		System.out.println("The Factorial is "+fact);
		

	}

}
