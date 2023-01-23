/**
 * @author Tal Ishon
 * class Fermat.
 *
 * Receives input of exponent and range from user.
 * Prints all a,b,c numbers for which the Pythagorean equation-
 * a^n + b^n = c^n is respected, while a, b and c are between 1 and range.
 */
public class Fermat {
    /**
     * Main method.
     *
     * Receive input from user, validate it using a helper method.
     * If invalid input - exit with an error code.
     * Otherwise - print numbers as required.
     *
     * @param args input of (supposedly positive) n and range from the user.
     */
    public static void main(String[] args) {

        // parse and validate input

        if (args.length != 2) {
            System.out.println("Invalid input");
            System.exit(1); // stop program- input not valid
        }

        int n = Integer.parseInt(args[0]);
        int range = Integer.parseInt(args[1]);

        if (isNotPositive(n, range)) {
            System.out.println("Invalid input");
            System.exit(1); // stop program- input not valid
        }

        if (n > 2) { // according to Fermat law n > 2 will never comply
            System.out.println("no");
            System.exit(0);  // but exit(0) since the input is valid
        }

        // if we got here we have valid input so let's
        // print numbers that comply with the requirements

        for (int a = 1; a <= range; a++) {
            for (int b = a + 1; b <= range; b++) {  // ensure b>a to avoid duplicate tests (when a and b are swapped)
                for (int c = 1; c <= range; c++) {

                    if (Math.pow(a, n) + Math.pow(b, n) == Math.pow(c, n)) {
                        System.out.println(a + "," + b + "," + c);
                    }
                }
            }
        }
    }

    /**
     * isNotPositive method checks if any of the inputs is negative.
     *
     * @param num1 is referring to integer n from input.
     * @param num2 is referring to integer range from input.
     * @return boolean value true if both integers are positive or false if any of the inputs is negative.
     */
    public static boolean isNotPositive(int num1, int num2) {
        return num1 <= 0 || num2 <= 0;
    }
}





