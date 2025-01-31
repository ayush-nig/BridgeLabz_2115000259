import java.util.Scanner;
class Question10{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter distance in kilometers ");
		double d=sc.nextDouble();
		System.out.println("Distancein miles is "+(d * 0.621371));
	}
}