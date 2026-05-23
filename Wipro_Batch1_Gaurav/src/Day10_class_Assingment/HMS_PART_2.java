package Day10_class_Assingment;
import java.util.*;

class PatientData {

    private int patientId;
    private String patientName;
    private int patientAge;

    public PatientData(int patientId,String patientName,int patientAge) {

        this.patientId = patientId;
        this.patientName = patientName;
        this.patientAge = patientAge;
    }

    public int getPatientId() {
        return patientId;
    }

    public String getPatientName() {
        return patientName;
    }

    public int getPatientAge() {
        return patientAge;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public void setPatientAge(int patientAge) {
        this.patientAge = patientAge;
    }

    public String toString() {

        return "Patient Id : " + patientId + " | Name : " + patientName + " | Age : " + patientAge;
    }
}


class HospitalRecords {

    private HashMap<Integer, PatientData> patientMap =
            new HashMap<>();


    public void addPatient(PatientData person) {

        if(patientMap.containsKey(person.getPatientId())) {

            System.out.println("Patient already exists");
        }

        else {

            patientMap.put(person.getPatientId(), person);
            System.out.println("Patient added successfully");
        }
    }
    public void updatePatient(int id, String newName,int newAge) {

    	if(patientMap.containsKey(id)) {

    		PatientData p = patientMap.get(id);

			p.setPatientName(newName);
			p.setPatientAge(newAge);
			
			System.out.println("Patient updated successfully");
		}
			
			else {
			
				System.out.println("Patient not found");
			}
		}
			
			public void getPatient(int id) {
			
				if(patientMap.containsKey(id)) {
			
					System.out.println(patientMap.get(id));
				}
			
				else {
			
					System.out.println("Patient not found");
				}
		}
			public void removePatient(int id) {

		        if(patientMap.containsKey(id)) {

		            patientMap.remove(id);

		            System.out.println("Patient removed successfully");
		        }

		        else {

		            System.out.println("Patient not found");
		        }
		    }


		    public void showAllPatients() {

		        if(patientMap.isEmpty()) {

		            System.out.println("No patients available");
		            return;
		        }

		        System.out.println("\nAll Patient Records :");

		        for(Map.Entry<Integer, PatientData> data
		                : patientMap.entrySet()) {

		            System.out.println(data.getValue());
		        }
		    }


		    public void checkPatient(int id) {

		        if(patientMap.containsKey(id)) {

		            System.out.println("Patient exists in system");
		        }

		        else {

		            System.out.println("Patient does not exist");
		        }
		    }


		    public void totalPatients() {

		        System.out.println("Total Patients : "+ patientMap.size());
		    }
		    public void clearSystem() {

		        patientMap.clear();

		        System.out.println("All patient records cleared");
		    }
		}
public class HMS_PART_2 {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        HospitalRecords hospital =
	                new HospitalRecords();

	        while(true) {

	            System.out.println("===== Hospital Menu =====");

	            System.out.println("1. Add Patient");
	            System.out.println("2. Update Patient");
	            System.out.println("3. Retrieve Patient");
	            System.out.println("4. Remove Patient");
	            System.out.println("5. List All Patients");
	            System.out.println("6. Check Patient");
	            System.out.println("7. Count Patients");
	            System.out.println("8. Clear System");
	            System.out.println("9. Exit");

	            System.out.print("Enter Choice : ");

	            int choice = sc.nextInt();

	            sc.nextLine();

	            switch(choice) {

	                case 1:

	                    System.out.print("Enter Patient Id : ");
	                    int id = sc.nextInt();

	                    sc.nextLine();

	                    System.out.print("Enter Patient Name : ");
	                    String name = sc.nextLine();

	                    System.out.print("Enter Patient Age : ");
	                    int age = sc.nextInt();

	                    PatientData patient =
	                            new PatientData(id, name, age);

	                    hospital.addPatient(patient);

	                    break;


	                case 2:

	                    System.out.print("Enter Patient Id : ");
	                    int updateId = sc.nextInt();

	                    sc.nextLine();

	                    System.out.print("Enter New Name : ");
	                    String newName = sc.nextLine();

	                    System.out.print("Enter New Age : ");
	                    int newAge = sc.nextInt();

	                    hospital.updatePatient(updateId,
	                            newName,
	                            newAge);

	                    break;


	                case 3:

	                    System.out.print("Enter Patient Id : ");
	                    int searchId = sc.nextInt();

	                    hospital.getPatient(searchId);

	                    break;


	                case 4:

	                    System.out.print("Enter Patient Id : ");
	                    int removeId = sc.nextInt();

	                    hospital.removePatient(removeId);

	                    break;


	                case 5:

	                    hospital.showAllPatients();

	                    break;


	                case 6:

	                    System.out.print("Enter Patient Id : ");
	                    int checkId = sc.nextInt();

	                    hospital.checkPatient(checkId);

	                    break;


	                case 7:

	                    hospital.totalPatients();

	                    break;


	                case 8:

	                    hospital.clearSystem();

	                    break;


	                case 9:

	                    System.out.println("System Closed");

	                    sc.close();

	                    return;


	                default:

	                    System.out.println("Invalid Choice");
	            }
	        }

	}
}
