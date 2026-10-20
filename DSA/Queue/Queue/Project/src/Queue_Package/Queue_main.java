package Queue_Package;

import java.util.Scanner;

class Queue_class{
	int queue[], MaxSize , front , rear ;
	public void create_queue(int size) {
		rear = -1;
		front = 0;
		MaxSize = size ;
		queue = new int[size];
	}
	
	void enqueue(int e) {
		queue[++rear] = e;
	}
	boolean ifFull() {
		return (rear == MaxSize-1);
	}
	
	int dequeue() {
		return(queue[front++]);
	}
	 boolean isEmpty()
	   {

	   	return(front>rear);
	   }
	  
	   void printqueue()
	   {
	       for(int i=front;i<=rear;i++)
	           System.out.print("\n"+queue[i]);
	   }
}

public class Queue_main {

	public static void main(String[] args) {
		Queue_class qc = new Queue_class();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the queue : ");
		
		qc.create_queue(sc.nextInt());
		int choice = 0 ;
		
		do {
			System.out.println("Queue Menu");
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
                		System.out.println("Enter the element to bedelete element in queue");
                		qc.dequeue();
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