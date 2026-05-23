
// Module Working Health care Sector : 

package Day4_class_Assingment;


// 1.	Patient Registration (Class, Object, Encapsulation)

class Registration{
	
	private String Name;
	private int Id;
	private int age;
	private String illness;
	
	public Registration(String Name, int Id, int age){
		
		this.Name=Name;
		if(Id>0){
			this.Id=Id;
		}
		if(age>0) {
			this.age=age;
		}	
	}
	
	public void setIllness(String role, String illness) {
	
		if(role.equals("doctor")) {
			this.illness=illness;
		}
		
		else {
			System.out.println("Invalid usser !");
		}
	}
	
	public String getName() {
		 return Name;
	}
	
	public int  getAge() {
		return age;
	}
	
	public int getId() {
		
		return Id;
	
	}
	
	public String getIllness(String role) {
		
		if(role.equals("doctor") || role.equals(Name)) {
			return illness;
		}
		
		else {
			return "Invalid User !";
		}
	}
}

// 2.	Patient Service (Interface, Implementation)

interface PatientService{
	
	void registerPatient(Registration patient);
	
	void showPatient(int Id);
}

class PatientServiceImp implements PatientService{
	
	private Registration[] patients = new Registration[10];
	private int count = 0;
	
	public void registerPatient(Registration patient) {
		
		if(count< patients.length) {
			patients[count]=patient;
			count++;
			System.out.println("Patient Registered Successfully");
		}
		else {
			 System.out.println("Storage Full");
		}
	}	
	
public void showPatient(int id) {

    boolean found = false;

    for(int i = 0; i < count; i++) {
        if(patients[i].getId() == id) {

            System.out.println("Name: " + patients[i].getName());
            System.out.println("Age: " + patients[i].getAge());
            System.out.println("Id: " + patients[i].getId());
            System.out.println("Illness: " + patients[i].getIllness("doctor"));

            found = true;
            break;
        }
    }

    if(!found) {
        System.out.println("Patient Not Found");
    }
}
}

	public class Healthcare_Sector {

		public static void main(String[] args) {
			
			PatientService service = new PatientServiceImp();
			
			Registration rg1 = new Registration("Gaurav Kumar", 3536, 21 );
			rg1.setIllness("doctor","All Good");
			
			Registration rg2 = new Registration("Shivam Kumar", 3537, 22 );
			rg2.setIllness("doctor","COVID-19");
			
			service.registerPatient(rg1);
			service.registerPatient(rg2);
			
			service.showPatient(3537);
			service.showPatient(3536);
			
				
		}
		
	}
