import java.util.HashSet;
import java.util.Scanner;
public class PangramChecker {
    public static boolean isPangram(String input) {
        if (input == null || input.length() < 26) {
            return false;
        }
        
        input = input.toUpperCase();
        
        HashSet<Character> letters = new HashSet<>();
        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                letters.add(c);
            }
        }
        
        return letters.size() == 26;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();
        scanner.close();

        boolean isPangram = isPangram(input);
        
        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }
}