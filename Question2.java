import java.util.Scanner;
public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year: ");
        int year = sc.nextInt();
        if (year < 1582) {
            System.out.println("Enter the year based on the Gregorian calendar.");
        } 
        else if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            System.out.println("The Year is a Leap Year");
        } else{
            System.out.println("The year is not a Leap year");
        }
        sc.close();
    }
}
