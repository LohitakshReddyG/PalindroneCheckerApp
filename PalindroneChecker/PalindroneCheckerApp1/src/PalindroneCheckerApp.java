import java.util.Scanner;

public class PalindroneCheckerApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input : ");
        String input = sc.nextLine();
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

