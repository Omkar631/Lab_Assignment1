//WAP a Program to accept Radius from the User and Calculate Area of Circle And Circumference Of Circle

package Omkar;

import java.util.Scanner;

public class AC_and_CC {

	public static void main(String[] args) {
		int r;
		float ac,cc;
		System.out.print("Enter the Radius of the circle:");//Taking Radius Value from the User
		Scanner sc=new Scanner(System.in);
		r=sc.nextInt();
		
		//Area calculation:
		ac= (22/7)*(r*r);
		System.out.println("\nArea of The Circle is "+ac);
		
		//Circumference Calculation:
		cc= (2*(22/7))*r;
		System.out.println("Circumference of the Circle is "+cc);
		


	}

}
