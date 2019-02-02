
import java.util.Scanner;

// (1 * 10 + 1)  squared

class PalindromePyramid {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number [1-7] and [8] to quit: ");
        int steps = Integer.parseInt(scan.nextLine());


        while (steps >= 1 && steps <= 7) {
            int levelOne = 1;
            int levelTwo = (levelOne*10+1) * (levelOne*10+1);
            int levelThree = (levelOne*100+11) * (levelOne*100+11);
            int levelFour = (levelOne*1000+111) * (levelOne*1000+111);
            int levelFive = (levelOne*10000+1111) * (levelOne*10000+1111);
            long levelSix = (levelOne*100000L+11111L) * (levelOne*100000L+11111L);
            long levelSeven = (levelOne*1000000L+111111L) * (levelOne*1000000L+111111L);

            if(steps == 8){
                System.out.println("Quitting program. Run again to continue.");
                break;
            }

            if (steps == 1) {
                System.out.println("         " + levelOne);
                break;
            }
            else if (steps == 2) {
                System.out.println("         " + levelOne);
                System.out.println("        " + levelTwo);
                break;
            }
            else if (steps == 3) {
                System.out.println("         " + levelOne);
                System.out.println("        " + levelTwo);
                System.out.println("       " + levelThree);
                break;
            }
            else if (steps ==4) {
                System.out.println("         " + levelOne);
                System.out.println("        " + levelTwo);
                System.out.println("       " + levelThree);
                System.out.println("      " + levelFour);
                break;
            }
            else if (steps == 5) {
                System.out.println("         " + levelOne);
                System.out.println("        " + levelTwo);
                System.out.println("       " + levelThree);
                System.out.println("      " + levelFour);
                System.out.println("     " + levelFive);
                break;
            }
            else if (steps == 6) {
                System.out.println("      " + levelOne);
                System.out.println("     " + levelTwo);
                System.out.println("    " + levelThree);
                System.out.println("   " + levelFour);
                System.out.println("  " + levelFive);
                System.out.println(" " + levelSix);
                break;
            }
            else if (steps == 7){
                System.out.println("         " + levelOne);
                System.out.println("        " + levelTwo);
                System.out.println("       " + levelThree);
                System.out.println("      " + levelFour);
                System.out.println("     " + levelFive);
                System.out.println("    " + levelSix);
                System.out.println("   " + levelSeven);
                break;
            }
        }
    }
}


