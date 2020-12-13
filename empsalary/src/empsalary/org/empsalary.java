package empsalary.org;

import java.util.Scanner;

public class empsalary {

	public static void main(String[] args) {
		double tax=0.0;
		Scanner scn=new Scanner (System.in);
		System.out.println("enter the salary");
		double sal=scn.nextDouble();
		
		if (sal>200000 && sal<=250000)
		{
			tax=0;
		}
		else if 
			(sal>250000 && sal<=500000)
		{
			tax=(5*sal)/100;
		}
		else if 
		(sal>500000 && sal<=1000000)
	{
		tax=(20*sal)/100;
	}
		else if 
		(sal>100000)
	{
		tax=(30*sal)/100;
	}
	System.out.println("the required tax is" + " " + tax);
}
}

