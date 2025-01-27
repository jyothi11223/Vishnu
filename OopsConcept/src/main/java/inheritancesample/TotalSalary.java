package inheritancesample;

public class TotalSalary extends Calculate {
double totalSalary;
public void totalSalary()
{
	totalSalary=basicpay+hra-pf-deduction+bonus;
}
public void salarySlip()
{
	System.out.println("SALARY SLIP");
	System.out.println("Basic Pay:"+basicpay);
	System.out.println("Deduction:"+deduction);
	System.out.println("Bonus:"+bonus);
	System.out.println("Total Salary By Hand:"+totalSalary);
}
}
