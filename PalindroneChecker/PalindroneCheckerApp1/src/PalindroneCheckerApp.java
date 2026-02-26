import java.util.*;
public class PalindroneCheckerApp {
    private static boolean check(String s, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (s.charAt(start) != s.charAt(end)) {
            return false;
        }
        return check(s, start + 1, end - 1);
    }
    void main (String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        boolean result = check(input, 0, input.length() - 1);
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + result);
    }
}