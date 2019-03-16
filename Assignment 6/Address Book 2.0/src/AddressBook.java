import java.util.ArrayList;
import java.util.Scanner;

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
    
    public void printAddressBook() {
    	
    	for(int j=0;j<myContacts.size();j++)
            System.out.println(myContacts.get(j));
    }
	
}