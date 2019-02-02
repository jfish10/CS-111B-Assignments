import java.util.Scanner;
import java.lang.Math;

public class Calculator {

    //states and characteristics of the Calculator class
    double x;
    double y;
    double result;



    //addition method
    public void add() {

        result = x + y;
    }

    //subtraction method
    public void subtract() {

        result = x - y;
    }

    //multiplication method
    public void multiply() {

        result = x * y;
    }

    //division method
    public void divide() {
        result = x/y;
    }

    //power method
    public void powerNums() {
        result = (int)Math.pow(x,y);
    }

    //square root method
    public void squareRoot() {
        result = x*x;
    }

    //absolute value method
    public void absValue() {
        if(x >= 0) {
            result = x;
        }
        else {
            result = x * -1;
        }

    }

    //floor value method
    public void floorValue() {
        result = Math.floor(x);
    }
    //ceiling value method
    public void ceilValue() {
        result = Math.ceil(x);
    }
    //factorial method
    public double fact(int x) {
        if (x == 0 || x == 1) {
            result = x;
            return result;
        }
        else {
            result = fact( x - 1) * x;
            return result;
        }

    }

    //main method
    public static void main(String[] args) {
        Calculator mySimpleCalculator = new Calculator(); //instantiate the Calculator object

        while (true) {

            System.out.println("Enter the first number: ");
            Scanner scan = new Scanner(System.in);
            mySimpleCalculator.x = scan.nextDouble();
            System.out.println("Enter the second number: ");
            Scanner scan2 = new Scanner(System.in);
            mySimpleCalculator.y = scan2.nextDouble();

            System.out.print("Enter:\n '1' for addition,\n '2' for subtraction,\n '3' for multiplication,\n '4' for division,\n '5' for power of first number to the second,\n");
            System.out.print(" '6' for square root of the first number,\n '7' for absolute value of the first number,\n '8' for floor value of the first number,\n '9' for ceiling value of the first number,\n and '10' for factorial of the first number\n");
            Scanner scan3 = new Scanner(System.in);
            int choice = scan3.nextInt();

            if (choice == 1) {
                mySimpleCalculator.add();
                System.out.println("The sum of both numbers is: " + mySimpleCalculator.result);
            } else if (choice == 2) {
                mySimpleCalculator.subtract();
                System.out.println("The difference is: " + mySimpleCalculator.result);
            } else if (choice == 3) {
                mySimpleCalculator.multiply();
                System.out.println("The product is: " + mySimpleCalculator.result);
            } else if (choice == 4) {
                mySimpleCalculator.divide();
                System.out.println("The divisor is: " + mySimpleCalculator.result);
            } else if (choice == 5) {
                mySimpleCalculator.powerNums();
                System.out.println("The power of the first number to the second number is: " + mySimpleCalculator.result);
            } else if (choice == 6) {
                mySimpleCalculator.squareRoot();
                System.out.println("The square root of the first number is: " + mySimpleCalculator.result);
            } else if (choice == 7) {
                mySimpleCalculator.absValue();
                System.out.println("The absolute value of the first number is: " + mySimpleCalculator.result);
            } else if (choice == 8) {
                mySimpleCalculator.floorValue();
                System.out.println("The floor value of the first number is: " + mySimpleCalculator.result);
            } else if (choice == 9) {
                mySimpleCalculator.ceilValue();
                System.out.println("The ceiling value of the first number is: " + mySimpleCalculator.result);
            }

            else if(choice==10) {
              mySimpleCalculator.fact(4);
            System.out.println("The factorial of the first number is: " + mySimpleCalculator.result);
             }


        }
    }

}