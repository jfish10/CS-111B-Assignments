import java.util.Scanner;
import java.util.Random;


public class twentyOneCardMagic {
    public static void main(String[] args) {
        Random rn = new Random();

        /* Declare a 21 element array of cards */
        int[] deck = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21};

        /* Declare a 7 by 3 array to receive the cards dealt to play the trick */
        int[][] array = new int[7][3];

        /* Declare a Scanner object for input */
        Scanner input = new Scanner(System.in);



        System.out.println("Press [0] to begin the game/trick.");
        int play = input.nextInt();

        if (play == 0) {


            //use 2 for loops to populate the cards
            for (int row = 0; row < 7; row++) {
                for (int col = 0; col < 3; col++) {
                    array[row][col] = rn.nextInt(21-1) + 1;
                    System.out.print(array[row][col]);
                    System.out.print("  ");
                }
                 System.out.println(" ");
            }
            System.out.println("Choose a number from one of the columns 1, 2, or 3.");
               int colOne = input.nextInt();

        }
    }
}
