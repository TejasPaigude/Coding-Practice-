package Queue_Package;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

class Patient{
	int patientId;
	String name;
	int priority;
	public Patient(int patientId, String name, int priority) {
		super();
		this.patientId = patientId;
		this.name = name;
		this.priority = priority;
	}
	@Override
	public String toString() {
		return "Patient [patientId=" + patientId + ", name=" + name + ", priority=" + priority + "]";
	}
}

public class Queue_Hospital {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PriorityQueue<Patient> patients = new PriorityQueue<>(Comparator.comparingInt(p -> p.priority));
		
		int choice;
		
		do {
			System.out.println("\n-------OPD PATIENTS MANAGEMENT ");
			System.out.println("1. Register Patient ");
			System.out.println("2. Call Next Patient");
	       	System.out.println("3. View Next Patient");
	        System.out.println("4. Display Waiting Patients");
	        System.out.println("5. Search Patient");
	        System.out.println("6. Count Waiting Patients");
	        System.out.println("7. Exit");
	       	System.out.print("Enter choice: ");
	       	
	       	choice = sc.nextInt();
	       	
	       	switch(choice) {
	       	case 1:
	       		System.out.println("Enter the patients details ");
	       		System.out.println("give patient Id");
	       		int id  =  sc.nextInt();
	       		
	       		System.out.println("Enter the patient name :");
	       		String name = sc.next();
	       		
	       		System.out.println("Enter the patient priority :");
	       		int priority = sc.nextInt();
	       		
	       		if(priority == 1 || priority == 2 || priority == 3) {
	       			Patient p = new Patient(id , name , priority);
	       			patients.offer(p);
	       			System.out.println("Patient registered successfully");
	       		}
	       		else {
	       			System.out.println("give a proper priority");
	       		}
	       		break;
	       		
	       	case 2:
	       		
	       	}
		}while(choice != 7);
		
	}
}
