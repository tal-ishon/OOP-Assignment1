/**
 * @author Tal Ishon
 * class Str.
 *
 *
 * Prints two groups of words:
 * The words in the sequence that start with the query
 * All words in the sequence that include the query
 * Each group of words is printed in the order it appears in the original sequence.
 * If the input is not valid, the program prints out 'Invalid input'.
 */
public class Str {
    /**
     * Main method.
     *
     * Receive input from user and validate it.
     * If invalid input - exit with an error code.
     * Otherwise - print words as required.
     *
     * @param args input of strings 'query' and 'sequence' from user.
     */
    public static void main(String[] args) {

        if (args.length != 2) {
            System.out.println("Invalid input");
            System.exit(1);
        }

        String query = args[0];
        String sequence = args[1];

        String[] array = sequence.split("_");

        // loop check if string start with 'query' and print if it does
        for (String s : array) {

            if (s.startsWith(query)) {
                System.out.println(s);
            }
        }

        // loop check if string contain 'query' and print if it does
        for (String s : array) {

            if (s.contains(query) && !s.startsWith(query)) {
                System.out.println(s);
            }
        }


    }
}
