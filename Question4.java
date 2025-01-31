import java.util.Scanner;
class Question4{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter radius");
		double a=sc.nextDouble();
		double b=3.1415*a*a;
		System.out.println("Area is "+b);
	}
}