package inheritancesample;

public class Calculate extends GetValues {

	double hra;
	double pf;
	public void calculateHraAndPf()
	{
		hra=0.05*basicpay;
		pf=0.20*basicpay;
	}
}
