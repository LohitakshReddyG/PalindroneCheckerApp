
public class PalindroneCheckerApp {
    static void main(String[] args) {
        System.out.println("Welcome to Palindrome Checker App Management System !!!");

        String str = "madam";
        boolean ispalindrome = true;
        for (int i = 0; i <= str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                ispalindrome = false;
                break;
            }
        }
        if (ispalindrome) {
            System.out.println(str + " is palindrome.");
        } else {
            System.out.println(str + " is not a palindrome");
        }
    }
}