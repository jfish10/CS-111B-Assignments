import java.util.Scanner;


class Driver {





    public static void main(String[] args) {


        Contacts.instructions(); //instructions for user input


        Contacts [] myContacts = new Contacts[10]; //declare all contacts

        for (int i = 0; i < 10; i++)
            myContacts[i] = new Contacts(); //initialize all contacts


        //populate myContacts
        myContacts[0].setContact("Jonathan", "Fisher", "9492329045","San Francisco");
        myContacts[1].setContact("Kobe","Bryant","8888882424","Los Angeles");
        myContacts[2].setContact("Lebron","James","2322322323","Los Angeles");
        myContacts[3].setContact("Michael","Ross","5105436789","Oakland");
        myContacts[4].setContact("","","","");
        myContacts[5].setContact("","","","");
        myContacts[6].setContact("","","","");
        myContacts[7].setContact("","","","");
        myContacts[8].setContact("","","","");
        myContacts[9].setContact("","","","");

        boolean quit = false;
        int option = 0;
        while(!quit) {
            System.out.println("Enter your choice: ");
            Scanner scan = new Scanner(System.in);
            option = scan.nextInt();
            scan.nextLine();
            switch(option) {
                case 0:
                    Contacts.instructions();
                case 1:
                    quit = true;
                    break;
                case 2:
                    Contacts.printAllContacts(myContacts);
                    break;

            }

        }


    }

        //print all Contacts
        //Contacts.printAllContacts(myContacts);

        //gets full name by index value
        //for (int i = 0; i < 10; i++) {
        //  String a = myContacts[0].getFullName();
        //}

      /*  //gets first name by index value
        String one = myContacts[1].getFirstName();
        System.out.println(one);

        //gets last name by index value
        String two = myContacts[1].getLastName();
        System.out.println(two);


        //gets full name by phone #
        String name = myContacts[0].getContactName("9492329045");
        System.out.println(name);

        //gets phone number by index value
        String num = myContacts[0].getPhoneNumber();
        System.out.println(num);
        */


    }
