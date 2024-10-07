import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = scanner.nextLine();
        
        // Check if the word is a palindrome
        if (isPalindrome(word)) {
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is not a palindrome.");
        }
        
        scanner.close();
    }

    // Method to check if a word is a palindrome
    public static boolean isPalindrome(String word) {
        // Convert the word to lowercase to make the check case-insensitive
        String lowerCaseWord = word.toLowerCase();
        int left = 0;
        int right = lowerCaseWord.length() - 1;
        
        // Compare characters from the beginning and end moving towards the center
        while (left < right) {
            if (lowerCaseWord.charAt(left) != lowerCaseWord.charAt(right)) {
                return false; // If characters don't match, it's not a palindrome
            }
            left++;
            right--;
        }
        return true; // If all characters matched, it's a palindrome
    }
          }
