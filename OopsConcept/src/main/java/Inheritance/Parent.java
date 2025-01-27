package Inheritance;
import java.util.Scanner;
public class Parent {

	double basicpay;
	double deduction;
	double bonus;
	
	public void getDetails()
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Basic Pay: ");
		basicpay=scanner.nextDouble();
		System.out.println("Enter the Deduction: ");
		deduction=scanner.nextDouble();
		System.out.println("Enter the Bonus: ");
		bonus=scanner.nextDouble();
	}
	

}
