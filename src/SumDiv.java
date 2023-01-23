/**
 * @author Tal Ishon
 * class SumDiv.
 *
 * Rceives 3 numbers from user, validates them and prints out the numbers between 1 and 'a'
 * (including “a” itself) that are divisible by b or c, and the sum of all these numbers.
 */
public class SumDiv {
    /**
     * Main method.
     *
     * Receive input from user, validate it using helper methods.
     * If invalid input - exit with an error code.
     * Otherwise - print numbers as required.
     *
     * @param args input of 3 numbers from the user.
     */
    public static void main(String[] args) {

        // parse and validate input

        if (args.length != 3) {
            System.out.println("Invalid input");
            System.exit(1);
        }

        int sum = 0;
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        if (isNotPositive(a, b, c)) {
            System.out.println("Invalid input");
            System.exit(1);
        }

        // if we got here we have valid input so let's
        // print numbers between 1 to a when the numbers divide by b or c

        for (int i = 1; i <= a; i++) {

            if (isNumDivByBOrC(i, b, c)) {
                System.out.println(i);
                sum = sum + i;
            }

        }

        // print sum of all numbers
        System.out.println(sum);

    }

    /**
     * isNumDivByBOrC method checks if a divides by b or c.
     *
     * @param a ("i" in loop) referring to all integers checked if divide by b or c.
     * @param b is one of the integers we divide a by.
     * @param c is one of the integers we divide a by.
     * @return boolean value true if a divides by b or c false if not.
     */
    private static boolean isNumDivByBOrC(int a, int b, int c) {
        return a % b == 0 || a % c == 0;
    }

    /**
     * isNotPositive method checks if any of the inputs are negative.
     *
     * @param num1 is referring to integer a from input.
     * @param num2 is referring to integer b from input.
     * @param num3 is referring to integer c from input.
     * @return boolean value true if both integers are positive or false if any of the inputs are negative.
     */
    private static boolean isNotPositive(int num1, int num2, int num3) {
        return num1 <= 0 || num2 <= 0 || num3 <= 0;
    }

}
