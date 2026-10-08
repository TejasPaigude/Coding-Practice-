package number;

import java.util.*;

public class rev {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number");
		int a = sc.nextInt();
		
		int d;
		int rev = 0 ; 
		
		while(a>0) {
			d = a%10;
			a = a/10;
			rev = rev*10+d;
		}
		
		System.out.println(rev);
		

	}

}
