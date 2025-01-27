package inheritancesample;

import java.util.Scanner;
public class GetValues{
	double basicpay;
	double deduction;
	double bonus;
public void display()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Basic Pay:"+basicpay);
	basicpay=sc.nextInt();
	System.out.println("Enter Deduction:"+deduction);
	deduction=sc.nextInt();
	System.out.println("Enter bonus:"+bonus);
	bonus=sc.nextInt();
}
}
