package block4;

import java.util.Scanner;
import java.util.Stack;

public class BracketsParser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String st = scanner.nextLine();
        if (parseBracketsString(st))
            System.out.println("Правильно");
        else
            System.out.println("Неправильно");
    }
    private static boolean parseBracketsString(String st) {
        Stack<Character> openBracketsStack = new Stack<>();

        for (int i=0; i < st.length(); i++) {
            if (st.charAt(i)=='(' || st.charAt(i)==')' || st.charAt(i)=='[' || st.charAt(i)==']' || st.charAt(i)=='{' || st.charAt(i)=='}') {
                switch (st.charAt(i)) {
                    case ')':
                        if (openBracketsStack.isEmpty()) return false;
                        if (openBracketsStack.pop() == '(') break;
                        return false;
                    case ']':
                        if (openBracketsStack.isEmpty()) return false;
                        if (openBracketsStack.pop() == '[') break;
                        return false;
                    case '}':
                        if (openBracketsStack.isEmpty()) return false;
                        if (openBracketsStack.pop() == '{') break;
                        return false;
                    default:
                        openBracketsStack.add(st.charAt(i));
                        break;
                }
            }
        }
        return openBracketsStack.isEmpty();
    }
}
