package Problem1;

import java.util.*;

public class Balanced {
	
	static void  check_balnced(String str) {
		Stack <Character> stack = new Stack<>();
		
		for(char c : str.toCharArray()) {
			if(c=='{'||c=='['||c=='(') {
				stack.push(c);
			}
			else if (c=='}'||c==']' || c==')') {
				if(stack.isEmpty()) {
					System.out.println("Unbalanced");
					return;
				}
				char top = stack.pop();
				if ((c == '}' && top !='{') || (c == ']' && top !='[') || (c == ')' && top !='(') ) {
					System.out.println("Unbalanced");
					return;
				}
			}
		}
		
		if(stack.isEmpty()) {
			System.out.println("Balanced");
		}
		else {
			System.out.println("Unbalanced");
		}
		
	}
	public static void main(String[] args) {
	
		check_balnced("{[()]}");
		check_balnced("{[(])}");
		check_balnced("(((");
	    }
	}

