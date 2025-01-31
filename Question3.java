import java.util.Scanner;
class Question3{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter temp. in celcius");
		double a=sc.nextDouble();
		double b=(a*1.8)+32.0;
		System.out.println("Temp in farenh. is"+b);
	}
}