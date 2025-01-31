import java.util.Scanner;
class Question5{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Radius and Height");
		double r=sc.nextDouble();
		double h=sc.nextDouble();
		double v=3.1415*r*r*h;
		System.out.println(v);
	}
}