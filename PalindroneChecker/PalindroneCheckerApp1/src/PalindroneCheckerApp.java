import java.util.Stack;

public class PalindroneCheckerApp {
    static void main(String[] args) {
        String input = "noon";
        System.out.println("Input : " + input);
        Stack<Character> stack = new Stack<>();
        for (char c : input.toCharArray()) {
            stack.push(c);
        }
        boolean isPalindrome = true;
        for (char c : input.toCharArray()) {
            char popped = stack.pop();
            if (c != popped) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}