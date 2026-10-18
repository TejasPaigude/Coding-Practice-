package Problem1;
import java.util.*;

public class reverse_string {
	
    static String rev_string( String string) {
		String rev_string ="";
		
		Stack <Character> stack= new Stack<>();
		
		for(char c: string.toCharArray()) {
			stack.push(c);
		}
		
		while(!stack.isEmpty()) {
			rev_string +=stack.pop();
		}
		
		return rev_string;
	}
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the  string to be reversed :");
		String str = sc.next();
		
		System.out.println("The reversed string is "+rev_string(str));
	}

}
