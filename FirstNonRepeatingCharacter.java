import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FirstNonRepeatingCharacter {
    public static char findFirstNonRepeatingChar(String text) {
        Map<Character, Integer> frequencies = new HashMap<>();
        for (int i = 0; i < text.length(); i++) {
            char character = text.charAt(i);
            frequencies.put(character, frequencies.getOrDefault(character, 0) + 1);
        }

        for (int i = 0; i < text.length(); i++) {
            char character = text.charAt(i);
            if (frequencies.get(character) == 1) {
                return character;
            }
        }
        return '\0';
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word or sentence: ");
        String text = scanner.nextLine();
        char firstUniqueCharacter = findFirstNonRepeatingChar(text);

        if (firstUniqueCharacter == '\0') {
            System.out.println("No Non-Repeating Character Found");
        } else {
            System.out.println("First Non-Repeating Character: '" + firstUniqueCharacter + "'");
        }
        scanner.close();
    }
}
