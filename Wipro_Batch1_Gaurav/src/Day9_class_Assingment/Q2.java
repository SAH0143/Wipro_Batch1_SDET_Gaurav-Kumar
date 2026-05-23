package Day9_class_Assingment;

// Q2. Use Case: Hospital Queue (LinkedList)
//Scenario:
// In a hospital, patients arrive and are treated in the same order they come in, first-come, first-served. You may also need to: Add a patient

import java.util.*;
public class Q2 {
	public static void main(String[] args) {
		
        LinkedList<Patient> queue = new LinkedList<>(); // for queue (first come - first served)

       
        queue.add(new Patient(201, "Vishal"));
        queue.add(new Patient(303, "Bikash"));
        queue.add(new Patient(504, "Sneha"));

        
        queue.addFirst(new Patient(200, "Emergency Patient : Akalu")); // For emergency patient 

        
        queue.addLast(new Patient(505, "Sonam"));

        
        System.out.println("Hospital Queue :");

        for(Patient p : queue) {
            System.out.println(p);  // for showing all patient name
        }

        
        System.out.println("\nRemoved Patient : " + queue.removeFirst()); // visit done, so remove from list

        System.out.println("\nFirst Patient : " + queue.getFirst());
        System.out.println("Last Patient : " + queue.getLast());

        
        System.out.println("\nUpdated Queue :"); // update lsit show on display for next patient

        for(Patient p : queue) {
            System.out.println(p);
        }
	}
}
