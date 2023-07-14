//WAP To Accept the no from the user and check it is even or odd
package Omkar;
import java.util.*;
public class Even_and_Odd {

	public static void main(String[] args) {
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number: ");
		num=sc.nextInt();
		
		//Using if else condition for getting Even, Odd Number
		if(num%2==0) {
			System.out.print( num+" is Even Number");
		}
		else {
			System.out.print( num+" is Odd Number");
		}

	}

}
