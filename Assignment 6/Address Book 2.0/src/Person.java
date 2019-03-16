class Person {
	String firstName;
	String lastName;
	String phoneNumber;
	
	//write getters & setters 

void setContact(String fName, String lName, String pN) {
    firstName = fName;
    lastName = lName;
    phoneNumber = pN;
}

public String getFirstName(){
    return firstName;
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

}