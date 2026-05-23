package Day9_class_Assingment;

// Use Case : Patient Management System :
// Problem : In a hospital, we need to store and manage a list of patients visiting the out patient department (OPD) daily. 
// Patients can register, and their details should be stored in the order they arrive. The system must allow adding new patients, listing all patients, and searching a patient by name.

import java.util.*;


class Patient {

 int id;
 String name;

 Patient(int id, String name) {
     this.id = id;
     this.name = name;
 }

 public String toString() {
     return "Id :" + id + " Name : " + name;
 }
}

public class Q1 {
	public static void main(String[] args) {
		 
        ArrayList<Patient> patientList = new ArrayList<>();

       
        patientList.add(new Patient(101, "Gaurav"));  // adding new patient
        patientList.add(new Patient(102, "Sneha"));
        patientList.add(new Patient(103, "Vishal"));

        
        System.out.println("All Patients:");  // listing all patient

        for(Patient p : patientList) {
            System.out.println(p);
        }

       
        String searchName = "Sneha"; // for searching patient details, enter name of patient 

        boolean found = false;

        System.out.println("\nSearching Patient :");

        for(Patient p : patientList) {

            if(p.name.equals(searchName)) {  // Searching by patient name

                System.out.println("Patient Found 😁 -> " + p);

                found = true;
                break;
            }
        }

        if(!found) {
            System.out.println("Patient Not Found 😒"); // 
        }
	}
}
