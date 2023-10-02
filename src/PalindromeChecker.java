import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter a word or phrase: ");
                String input = scanner.nextLine();
                System.out.println("Is the input a palindrome? " + isPalindrome(input));
            }

            public static boolean isPalindrome(String input) {
                input = input.replaceAll("\\W", "").toLowerCase();
                int start = 0;
                int end = input.length() - 1;

                while (start < end) {
                    if (input.charAt(start) != input.charAt(end)) {
                        return false;
                    }
                    start++;
                    end--;
                }

                return true;
            }
        }
