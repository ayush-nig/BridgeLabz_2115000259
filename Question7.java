import java.util.Scanner;
class Question7{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length and width of rectangle");
		double l=sc.nextDouble();
		double w=sc.nextDouble();
		System.out.println("Perimeter is "+(2*(l+w)));
	}
}