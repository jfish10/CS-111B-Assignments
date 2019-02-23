import java.util.Scanner;

class Contacts {
    String firstName;
    String lastName;
    String phoneNumber;
    String address;



     void setContact(String fName, String lName, String pN, String city) {
        firstName = fName;
        lastName = lName;
        phoneNumber = pN;
        address = city;
    }

    public String getFirstName(String pN){
        if(pN == phoneNumber) {
            return firstName;
        }
        else return "Not found!";
    }

    public String getLastName(String pN){
        if(pN == phoneNumber) {
            return lastName;
        }
        else return "Not found!";
    }

    public String getFullName(String pN) {
        if (pN == phoneNumber) {
            return firstName + " " + lastName;
        }
        else return "Not found";
    }

    public String getPhoneNumber(String lName) {
        if(lName == lastName) {
            return firstName;
        }
        else return "Not found!";
    }

    public void setFirstName(String fName) {
        firstName = fName;
    }

    public void setLastName(String lName) {
        lastName = lName;
    }

    public void setPhoneNumber(String pN) {
        phoneNumber = pN;
    }

    static void printAllContacts(Contacts[] c) {
        for (int i = 0; i < c.length; i++) {
            System.out.println("Contact name is: " + c[i].firstName + " " + c[i].lastName);
            System.out.println("Phone Number is: " + c[i].phoneNumber);
            System.out.println("Address/City of residence is: " + c[i].address);
            System.out.println("");
        }
    }
    public static void instructions() {
        System.out.println("[1]Quit\n[2]List of contacts\n[3]Add new contact\n[4]Update existing contact\n[5]Remove contact\n[7]Find contact");
    }

}