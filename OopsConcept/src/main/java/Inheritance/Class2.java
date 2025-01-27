package Inheritance;

public class Class2 extends Class1 {

	double totalSalary;
	public void calculateTotalSalary()
	{
		totalSalary=basicpay+hra-pf-deduction+bonus;
	}
public void displaySlip()
{
	System.out.println("SALARY SLIP");
	System.out.println("Basic Pay:"+basicpay);
	System.out.println("HRA (50%):"+hra);
	System.out.println("PF (20%):"+pf);
	System.out.println("Deduction:"+deduction);
	System.out.println("Bonus:"+bonus);
	System.out.println("Total Salary (by hand):"+totalSalary);
}
}
