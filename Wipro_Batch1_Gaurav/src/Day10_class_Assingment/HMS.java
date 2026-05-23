package Day10_class_Assingment;
import java.util.*;
class PatientInfo {

    private int patientCode;
    private String patientName;

    public PatientInfo(int patientCode, String patientName) {

        this.patientCode = patientCode;
        this.patientName = patientName;
    }

    public int getPatientCode() {
        return patientCode;
    }

    public String getPatientName() {
        return patientName;
    }

    public String toString() {

        return "Patient Id : " + patientCode + " | Patient Name : " + patientName;
    }
}


class HospitalPortal {

    private HashMap<Integer, PatientInfo> patientStorage = new HashMap<>();


    public void registerPatient(PatientInfo person) {

        if(patientStorage.containsKey(person.getPatientCode())) {

            System.out.println("Id already registered");
        }

        else {

            patientStorage.put(person.getPatientCode(), person);

            System.out.println("Patient added to system");
        }
    }


    public void showAllPatients() {

        if(patientStorage.isEmpty()) {

            System.out.println("No patient records found");
            return;
        }

        System.out.println("Unique Registered Patients :");

        for(Map.Entry<Integer, PatientInfo> data : patientStorage.entrySet()) {
        	System.out.println(data.getValue());
        }
    }


    public void searchPatient(int id) {

        if(patientStorage.containsKey(id)) {

            System.out.println(patientStorage.get(id));
        }

        else {

            System.out.println("Patient not found");
        }
    }
}


public class HMS {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

        HospitalPortal receptionDesk = new HospitalPortal();

        while(true) {

            System.out.println("===== Hospital Menu =====");

            System.out.println("1. Register Patient");
            System.out.println("2. View All Patients");
            System.out.println("3. Search Patient");
            System.out.println("4. Exit");

            System.out.print("Enter Choice : ");

            int choice = input.nextInt();

            input.nextLine();

            switch(choice) {

                case 1:

                    System.out.print("Enter Patient Id : ");
                    int id = input.nextInt();

                    input.nextLine();

                    System.out.print("Enter Patient Name : ");
                    String name = input.nextLine();

                    PatientInfo newPatient =
                            new PatientInfo(id, name);

                    receptionDesk.registerPatient(newPatient);

                    break;


                case 2:

                    receptionDesk.showAllPatients();

                    break;


                case 3:

                    System.out.print("Enter Patient Id : ");

                    int searchId = input.nextInt();

                    receptionDesk.searchPatient(searchId);

                    break;


                case 4:

                    System.out.println("System Closed");
                    input.close();
                    return;


                default:

                    System.out.println("Invalid Choice");
            }
        }
	}
}
