import java.util.Scanner;
import java.io.IOException;

class Driver {
	
	
	public static int choice;
	
	public static boolean getContinue() {
	     System.out.println("Continue? (y/n) ");
	     Scanner scan = new Scanner(System.in);
	     return (scan.next().charAt(0) == 'y');
	}
	 
	public static int menu() {
		System.out.println("Menu: ");
        System.out.println("1. Add a new contact ");
        System.out.println("2. Update an existing contact");
        System.out.println("3. Delete a contact ");
        System.out.println("4. List all added contacts in sorted order");
        System.out.println("5. Search for a given contact");
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
	}
	
	 
	public static void main(String args[]) throws IOException {
	
		AddressBook ab = new AddressBook();
		do {
            choice = menu();
            switch (choice) {
                case 1:
                	 
                    ab.addPerson();
                    break;
                case 2:
                     
                    break;
                case 3:
                    
                    break;

                case 4:
                    ab.printAllContacts();
                    break;
                case 5:
                     
                    break;
            }

        } while (getContinue());
		
	}
}
