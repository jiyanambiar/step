import java.util.Scanner;

public class PalindromeChecker {
    public static boolean isPalindromeIterative(String text) {
        int left = 0;
        int right = text.length() - 1;
        while (left < right) {
            if (text.charAt(left) != text.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static boolean isPalindromeRecursive(String text) {
        return isPalindromeRecursive(text, 0, text.length() - 1);
    }

    private static boolean isPalindromeRecursive(String text, int left, int right) {
        if (left >= right) {
            return true;
        }
        return text.charAt(left) == text.charAt(right)
                && isPalindromeRecursive(text, left + 1, right - 1);
    }

    public static boolean isPalindromeArrayReversal(String text) {
        char[] original = text.toCharArray();
        char[] reversed = text.toCharArray();
        for (int left = 0, right = reversed.length - 1; left < right; left++, right--) {
            char temporary = reversed[left];
            reversed[left] = reversed[right];
            reversed[right] = temporary;
        }
        return new String(original).equals(new String(reversed));
    }

    private static String result(boolean palindrome) {
        return palindrome ? "Palindrome" : "Not Palindrome";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = scanner.nextLine();

        System.out.println("Iterative: " + result(isPalindromeIterative(text)));
        System.out.println("Recursive: " + result(isPalindromeRecursive(text)));
        System.out.println("Array Reversal: " + result(isPalindromeArrayReversal(text)));
        scanner.close();
    }
}
