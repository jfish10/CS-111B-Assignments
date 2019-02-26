import java.util.Scanner;
import java.util.Arrays;

public class twentyOneCardMagic {
    public static void main(String[] args) {

        /* Declare a 21 element array of cards */
        int[][] deck1 = {
    {1,2,3,4,5,6,7},
    {8,9,10,11,12,13,14},
    {15,16,17,18,19,20,21}
    };
    
    int[][] deck2 = {
      {8,9,10,11,12,13,14},
      {1,2,3,4,5,6,7},
      {15,16,17,18,19,20,21}
    };
    
    int[][] deck3 = {
      {1,2,3,4,5,6,7},
      {15,16,17,18,19,20,21},
      {8,9,10,11,12,13,14}
    };


        /* Declare a 7 by 3 array to receive the cards dealt to play the trick */
        // int[][] array = new int[7][3];

        /* Declare a Scanner object for input */
        Scanner input = new Scanner(System.in);


        System.out.println("Before you begin, please think of a number between 1 and 21, inclusive.");
        System.out.println("Press [0]-[enter] to begin the game/trick.");

        int play = input.nextInt();


          if (play == 0) {

          System.out.println(Arrays.toString(deck1));
          System.out.println(Arrays.toString(deck2));
          System.out.println(Arrays.toString(deck3));

          System.out.println("Which pile does your card reside in? Enter [1], [2], or [3]:");
          int pile = input.nextInt();

          if (pile == 1) {
            System.out.println(Arrays.toString(deck2));
            System.out.println(Arrays.toString(deck1));
            System.out.println(Arrays.toString(deck3));
        }
          else if (pile == 2) {
            System.out.println(Arrays.toString(deck1));
            System.out.println(Arrays.toString(deck2));
            System.out.println(Arrays.toString(deck3));
          }
          else if (pile == 3) {
            System.out.println(Arrays.toString(deck1));
            System.out.println(Arrays.toString(deck3));
            System.out.println(Arrays.toString(deck2));
          }
          System.out.println("Which pile does your card reside in? Enter [1], [2], or [3]:");
          int pileTwo = input.nextInt();

          if (pileTwo == 1) {
            System.out.println(Arrays.toString(deck2));
            System.out.println(Arrays.toString(deck1));
            System.out.println(Arrays.toString(deck3));
        }
          else if (pileTwo == 2) {
            System.out.println(Arrays.toString(deck1));
            System.out.println(Arrays.toString(deck2));
            System.out.println(Arrays.toString(deck3));
          }
          else if (pileTwo == 3) {
            System.out.println(Arrays.toString(deck1));
            System.out.println(Arrays.toString(deck3));
            System.out.println(Arrays.toString(deck2));
          }
          System.out.println("Which pile does your card reside in? Enter [1], [2], or [3]:");
          int pileThree = input.nextInt();

          if (pileThree == 1) {
            System.out.println(Arrays.toString(deck2));
            System.out.println(Arrays.toString(deck1));
            System.out.println(Arrays.toString(deck3));
        }
          else if (pileThree == 2) {
            System.out.println(Arrays.toString(deck1));
            System.out.println(Arrays.toString(deck2));
            System.out.println(Arrays.toString(deck3));
          }
          else if (pileThree == 3) {
            System.out.println(Arrays.toString(deck1));
            System.out.println(Arrays.toString(deck3));
            System.out.println(Arrays.toString(deck2));
        }
          System.out.println("Ok, is your card: ");
      }
    }
  }
