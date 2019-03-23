import java.util.Arrays;
import java.util.Scanner;

class Reverse {
	
	protected int integer;
	protected int[] arr;

//Constructors
public Reverse() {
	this.integer = integer;
	// this.arr = Arrays.copyOf(arr, arr.length);
}

public int getInt() {
	return integer;
}

public void setInt(int n) {
	integer = n;
}

public int[] getArray() {
	return Arrays.copyOf(arr, arr.length);
}

public void setArray(int[] array) {
	arr = array;
}

public void reverseInt() {
	Scanner console = new Scanner(System.in);
	System.out.print("Enter an integer of at least two digits: ");
	integer = console.nextInt();
	long reverseInt = 0;
	long temp = integer;

    while(integer != 0) {
        int digit = integer % 10;
        reverseInt = reverseInt * 10 + digit;
        integer /= 10;
    }

    System.out.println("The reversed number is: " + reverseInt);
}

public void reverseArray() {
	Scanner input = new Scanner(System.in);
	System.out.print("Enter the number of integers that will be in your array: ");
	int arraylen = input.nextInt();
	int[] arrayData = new int[arraylen];
	System.out.print("Enter " + arraylen + " numbers to be stored in order in your array:");
	for(int i = 0; i<=arrayData.length-1; i++) {
		arrayData[i] = input.nextInt();
	}
	System.out.println("The original array is: ");
	for(int i = 0; i<=arrayData.length-1; i++) {
		System.out.print(" {" + arrayData[i] + "} ");
	}
	System.out.println();
	System.out.println("The array in reversed order is: ");
	for(int i = arrayData.length-1; i>=0; i--) {
		System.out.print(" {" + arrayData[i] + "} ");
	}
}


}