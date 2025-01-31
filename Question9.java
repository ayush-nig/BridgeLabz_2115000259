import java.util.Scanner;
class Question9{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 3 numbers");
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		double c=sc.nextDouble();
		double avg=(double)(a+b+c)/3;
		System.out.println("Average is "+avg);
	}
}