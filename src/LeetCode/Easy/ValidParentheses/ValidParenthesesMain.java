package LeetCode.Easy.ValidParentheses;

import java.util.Stack;

public class ValidParenthesesMain {
    public static void main(String[] args) {
        String input_string = "{()}";
        boolean result = valid_parentheses(input_string);
        System.out.println("result = " + result);
    }

    private static boolean valid_parentheses(String input_string) {
        Stack<String> stack = new Stack<>();

        for (int i = 0; i < input_string.length(); i++) {
            String[] target_array = input_string.split("");
            String target =target_array[i];
            System.out.println("target = " + target);
            if (("(").equals(target) || ("{").equals(target) || ("[").equals(target)) {
                stack.push(target);
                System.out.println("stack push = " + stack.peek());
            }
            if ((")").equals(target) || ("}").equals(target) || ("]").equals(target)) {
                stack.pop();
                System.out.println("stack pop = " + stack.peek());
            }
        }
        return stack.empty();

    }
}
