import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;

class AddressBook {
	
	
	// static way 
	//Person[] myPersons = new Person[100];
	
	//dynamic way 
	ArrayList<Person> myContacts = new ArrayList<Person>();
 
    
    public void addPerson() {
    	 
    	 Person p = new Person();
    	 Scanner scan = new Scanner(System.in);
    	 System.out.println("Enter First Name");
    	 p.firstName = scan.nextLine();
    	 System.out.println("Enter Last Name");
    	 p.lastName = scan.nextLine();
    	 System.out.println("Enter Phone Number");
    	 p.phoneNumber = scan.nextLine();
         myContacts.add(p);
    }
	
	    public void addPersonFromFile() throws IOException {
    	Person p = new Person();
		//Writing to file
		File file = new File("contacts.txt");
		System.out.println(file.exists()); //Checks if the file already there
		file.createNewFile();
		FileWriter fw = new FileWriter(file); //Ready to write into file
		PrintWriter pw = new PrintWriter(fw); //sets up to write inside the file
		pw.write(p.firstName = "Jonny");
		pw.write(p.lastName = "Fisher");
		pw.write(p.phoneNumber = "5109149277");
			pw.close();
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		String line="";
		while((line = br.readLine()) != null) {
			myContacts.add(p);
		}
		br.close();
		
    }
    
    public void removePerson(String phn) {
    	Person p = new Person();
    	Scanner scan = new Scanner(System.in);
    	System.out.println("Enter Phone Number");
    	p.phoneNumber = scan.nextLine();
    	if(p.phoneNumber == phn) {
    		myContacts.remove(p);
    	}
    }
	
    public void sortAddressBook() {
    	// you can use Collections.sort()
    }
    
       public void printAllContacts() {
        for (int i = 0; i < myContacts.size(); i++) {
            System.out.println("Contact name is: " + myContacts.get(i).firstName + " " + myContacts.get(i).lastName);
            System.out.println("Phone Number is: " + myContacts.get(i).phoneNumber);
            System.out.println("");
        }
    }
	
}
