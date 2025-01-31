import java.util.*;
class Question8{
		public static void main(String args[]){
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter base and exponent");
			double b=sc.nextDouble();
			double e=sc.nextDouble();
			System.out.println("Base raised to exponent is "+Math.pow(b,e));
		}
}