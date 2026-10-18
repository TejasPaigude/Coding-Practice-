package Problem1;

import java.util.Scanner;

class stack_class{
	
	int  MaxSize1,MaxSize2,tos1,tos2 ,size ;
	
	int[] BigArray ;
	
	////have to create a meyhod for to tkae the size of whole array
	
	public void whole_size(int size) {
		this.size = size ;
		BigArray = new int[size];
	}
	
	public void stack1() {
		tos1 = -1;
		
	}
	
	public void stack2() {
		tos2 = size;
	}
	
	void push1(int e) {
		if(tos1+1 != tos2) {
			BigArray[++tos1] = e;
		}
		else {
			System.out.println("Stack overflow ");
		}
	}
	
	void push2(int e) {
		if(tos2-1 != tos1) {
			BigArray[--tos2] = e;
		}
		else {
			System.out.println("Stack overflow ");
		}
	}
	
	
	void pop1() {
	if(tos1 != -1) {
		System.out.println((BigArray[tos1--]));
	}
	else {
	     System.out.println("stack empty");
	}
	}
	
	
	void pop2() {
		if(tos2 != size) {
			System.out.println((BigArray[tos2++]));
		}
		else {
		     System.out.println("stack empty");
		}
	}
	void display1() {
		for(int i = tos1 ; i >=0; i--) {
			System.out.println(BigArray[i] + " ");
		}
	}
	
	void display2() {
		for(int i = tos2 ; i <size ; i++) {
			System.out.println(BigArray[i]+ " ");
		}
	}
	
	
}

public class twin_stack {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		stack_class st = new stack_class();
		
		System.out.print("Enter the size of the whole array");
		int size = sc.nextInt();
		st.whole_size(size);
		st.stack1();
		st.stack2();
		int choice = 0, e;

		do {
			System.out.println("Stack menu");
			System.out.println("-----------");
			System.out.println("1.Push element in stack 1");
	        System.out.println("2.Pop element of stack1");
	        System.out.println("3.Push element in stack 2");
	        System.out.println("4.Pop element of stack 2");
	        System.out.println("5.Print all the elements of stack 1");
	        System.out.println("6.Print all the elements of stack 2");
	        System.out.println("0.Exit");
	        System.out.println(":");
	        
	        choice = sc.nextInt();
	        
	        
	        switch (choice)
            {
                case 1:
                	System.out.println("enter the element to be put in stack 1");
            		st.push1(sc.nextInt());
                  
                    break;

                case 2:
            		st.pop1();
                    break;

                case 3:

                	System.out.println("Enter the element to be put in stack 2");
            		st.push2(sc.nextInt());
                    break;

                case 4:
                	st.pop2();
                    break;
                    
                case 5:
                	st.display1();
                	break;
                case 6 : 
                	st.display2();
                	break;
                	
                case 0:
                  System.out.println("Exiting the code ");
                    break;

                default://Invalid input capturing
                    System.out.print("\nInvalid option selected.");
                    break;
            

        }
	        
		}while (choice!=0);
		
		
	}
}
