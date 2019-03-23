import java.util.Scanner;

class Driver {
	
	
public static int choice;
	
	public static boolean getContinue() {
	     System.out.println("Continue? (y/n) ");
	     Scanner scan = new Scanner(System.in);
	     return (scan.next().charAt(0) == 'y');
	}
	
	public static int menu() {
		System.out.println("Welcome to the Integer and Integer Array Reverser.");
        System.out.println("Enter [1] to reverse an Integer ");
        System.out.println("Enter [2] to reverse an Array");
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
	}
	
	public static void main(String[] args) {
		Reverse r = new Reverse();
		Palindrome p = new Palindrome();
		do {
            choice = menu();
            switch (choice) {
                case 1: 	 
                    p.reverseInt();
                    p.checkPalindrome(r);
                    break;
                case 2:
                    p.reverseArray();
                    p.checkPalindrome(r);
                    
                    break;
            }

        } while (getContinue());
		
	}
}