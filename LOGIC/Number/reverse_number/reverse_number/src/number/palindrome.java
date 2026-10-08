package number;
import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number ");
		int number = sc.nextInt();
		
		int reverse= 0 ;
		int a =number;
		
		while(number>0) {
			int d= number%10;
			number = number/10;
			reverse  = reverse*10+d;
		}
		
		if(reverse == a) {
			System.out.println("the number is palindrome");
		}
		else {
			System.out.println("the number is not a  palindrome");
		}
	

	}

}
