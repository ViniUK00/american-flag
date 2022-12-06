/*@author Ervin Bilo 21512979
* Computer Science
* Tutor: Dr Ikram Ur Rehman
* Created this code that displays the american flag with colors in the terminal. Used
* print statements, repetition statements and selection statements */

public class Main {

    public static final String ANSI_RESET = "\u001B[0m"; // reseting the color to normal

    // Declaring the background color
    public static final String ANSI_RED_BACKGROUND = "\u001B[41m"; // Red background color
    public static final String ANSI_BLUE_BACKGROUND = "\033[48;5;19m"; // Blue background color
    public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m"; // White background color

    // Declaring the text color
    public static final String ANSI_RED = "\u001B[31m"; // Red text color
    public static final String ANSI_WHITE = "\u001B[37m"; // White text color

    // Main  method
    public static void main(String[] args) {
        String line = "=";

        //String topStars = "*  *  *  *  *  *  *  *  *  *  *";
        String topStars = ("*   ").repeat(9);
        String blueBackground = line.repeat(45);

        String bottomStars = ("  * ").repeat(9);

        String underStarsLine = line.repeat(81);

        for (int i = 1; i <= 8; i++) {   // used for loop to avoid D.R.Y code.
            if (i % 2 != 0) {
                System.out.println(ANSI_BLUE_BACKGROUND + topStars +
                        ANSI_RED_BACKGROUND + ANSI_RED + blueBackground + ANSI_RESET);
            } else {
                System.out.println(ANSI_BLUE_BACKGROUND + bottomStars +
                        ANSI_WHITE_BACKGROUND + ANSI_WHITE + blueBackground + ANSI_RESET);
            }
        }
        for (int i = 1; i <= 9; i++) {
            if (i % 2 != 0) {
                System.out.println(ANSI_RED_BACKGROUND + ANSI_RED + underStarsLine + ANSI_RESET);
            } else{
                System.out.println(ANSI_WHITE_BACKGROUND + ANSI_WHITE + underStarsLine + ANSI_RESET);
            }
        }
    }
}
