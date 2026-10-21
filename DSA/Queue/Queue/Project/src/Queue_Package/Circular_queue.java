package Queue_Package;

import java.util.Scanner;

class Circular_Adt{
	
	int circular_queue[],MaxSize,front, rear, count ;
	
	public void create_queue(int size) {
		rear = -1;
		front = 0;
		MaxSize = size;
		circular_queue = new int[size];
		count = 0;
	}
	void enqueue(int e) {
		rear = (rear+ 1)%MaxSize;
		circular_queue[rear] = e;
		count++;
	}
	boolean isFull() {
		return (count == MaxSize);
	}
	int dequeue() {
		int temp = circular_queue[front];
		front = (front+1 )% MaxSize ;
		count--;
		return(temp);
		
	}
	boolean isEmpty() {
		return (front>rear);
	}
	
	void printqueue() {
		int c= 0 , i = front;
		
		while(c<count) {
			System.out.print("\n" + circular_queue[i]);
			i = (i+1)%MaxSize;
			c++;
		}
	}
}

public class Circular_queue {

	public static void main(String[] args) {
		Circular_Adt qc = new Circular_Adt();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of the queue :");
		
		qc.create_queue(sc.nextInt());
		int choice = 0;

		do {
			System.out.println("Stack menu");
			System.out.println("-----------");
			System.out.println("1.Add element in queue");
	        System.out.println("2.delete element in queue");
	        System.out.println("3.Print all elements");
	        System.out.println("0.Exit");
	        System.out.println(":");
	        
	        choice = sc.nextInt();
	        
	        switch (choice)
            {
                case 1:
                	
                	System.out.println("enter the element to Add element in queue");
                	qc.enqueue(sc.nextInt());
                  
                    break;

                case 2:
                	if(!qc.isEmpty()) {
                		System.out.println(qc.dequeue());
                	}
                	else {
                		System.out.println("error the queue is empty");
                	}
                	
                    break;

                case 3:
                	if(!qc.isEmpty()) {
                		System.out.println("fllowing is the queue");
                		qc.printqueue();
                		}
                	else {
                		System.out.println("queue is empty");
                	}
                    break;
              
                	
                case 0:
                  System.out.println("Exiting the code ");
                    break;

                default://Invalid input capturing
                    System.out.print("\nInvalid option selected.");
                    break;
            }
        } while (choice != 0);
    }
}
