//WAP to accept the age and check the elgibilty for voting or not
package Omkar;

import java.util.Scanner;

public class Voting {

	public static void main(String[] args) {
		int age ;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Age: ");// requesting User to Enter their age
		age=sc.nextInt();
		
		//Using If else condition for checking the eligibility of the Voter
		if(age>=18) {
			System.out.println("You are Eligible to Vote!!");
		}
		else {
			System.out.println("You are not Eligible to Vote.");
		}

	}

}
