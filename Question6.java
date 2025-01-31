import java.util.*;
class Question6
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter principle,rate and time");
		double p=sc.nextDouble();
		double r=sc.nextDouble();
		double t=sc.nextDouble();
		double si=(double)(p*r*t)/100;
		System.out.println("SI is"+si);
	}
}