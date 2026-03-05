import java.util.Scanner;

public class PalindroneCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Input : ");
        String input = sc.nextLine();
        long startTime = System.nanoTime();
        boolean isPalindrome = checkPalindrome(input);
        long endTime = System.nanoTime();
        long executionTime = endTime - startTime;
        System.out.println("Is Palindrome? : " + isPalindrome);
        System.out.println("Execution Time : " + executionTime + " ns");
    }

    public static boolean checkPalindrome(String input) {
        int start = 0;
        int end = input.length() - 1;
        while (start < end) {
            if (Character.toLowerCase(input.charAt(start)) !=
                    Character.toLowerCase(input.charAt(end))) {
        PalindromeStrategy strategy = new StackStrategy();

        boolean result = strategy.check(input);

        System.out.println("Is Palindrome? : " + result);
        sc.close();
    }
}


class PalindromeService {

        Stack<Character> stack = new Stack<>();
        for (char c : input.toCharArray()) {
            stack.push(c);
        }
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
