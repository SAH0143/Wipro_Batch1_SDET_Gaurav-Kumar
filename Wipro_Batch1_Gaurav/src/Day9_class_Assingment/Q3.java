package Day9_class_Assingment;

import java.util.*;

class HospitalPatient {

 int patientId;
 String patientName;

 HospitalPatient(int patientId, String patientName) { // Cons*

     this.patientId = patientId;
     this.patientName = patientName;
 }

 public boolean equals(Object obj) {

     HospitalPatient p = (HospitalPatient) obj;

     return this.patientId == p.patientId;
 }

 
 public int hashCode() {

     return patientId;  // Create unique id
 }


 public String toString() {

     return "Patient Id :"+ patientId +" | Patient Name: "+ patientName;
 }
}



class RegistrationDesk {

 HashSet<HospitalPatient> patientData = new HashSet<>();


 
 public void registerPatient(HospitalPatient patient) {  // Method for Patient registration

     if(patientData.add(patient)) {

         System.out.println("Patient added to system");
     }

     else {

         System.out.println("Id already registered");
         System.out.println("=====================");
     }
 }


 // Method to display patients
 public void getPatientsDetails() {

     System.out.println("Unique Registered Patients :");

     for(HospitalPatient p : patientData) {

         System.out.println(p);
     }
 }
}

public class Q3 {
	 public static void main(String[] args) {

	        RegistrationDesk desk = new RegistrationDesk();


	        HospitalPatient p1 = new HospitalPatient(101, "Bhim");
	        HospitalPatient p2 = new HospitalPatient(102, "Raju");
	        HospitalPatient p3 = new HospitalPatient(103, "Jagu");
	        HospitalPatient p4 = new HospitalPatient(104, "Chutki");
	        HospitalPatient p5 = new HospitalPatient(104, "Chutki"); // try to Register duplicate id
	        

	        desk.registerPatient(p1);
	        desk.registerPatient(p2);
	        desk.registerPatient(p3);   // Registration of Patient
	        desk.registerPatient(p4);
	        desk.registerPatient(p5);

	        desk.getPatientsDetails();
	    }
}
