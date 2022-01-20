import java.util.Scanner;
import org.apache.commons.lang3.StringUtils;

public class DependencyExercise {
    public static void main(String[] args) {
        /*Create a new class with a main method that prompts the user for input and does the following (using the Stringutils class)
            Tells whether or not what the user entered is a number
            Flips the case of the string
            Reverses the string
        */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Something:");
        String input = scanner.nextLine();
        System.out.println("You entered: \"" + input + "\"");
        // #1 Is input a number
        if(StringUtils.isNumeric(input)){
            System.out.println("\""+input+"\" is a number");
        } else {
            System.out.println("\""+input+"\" is not a number");
        }
        // #2 Flip Case
        System.out.println("Flipped Case: "+ StringUtils.swapCase(input));
        // #3 Reverse the String
        System.out.println("Reversed: "+StringUtils.reverse(input));
    }
}
