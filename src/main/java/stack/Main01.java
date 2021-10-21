package stack;

import java.util.Scanner;
import java.util.Stack;

public class Main01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String parentheses = sc.next();

        Main01 main01 = new Main01();

        System.out.println(main01.solution(parentheses));
    }

    public String solution(String parentheses) {
        String answer = "";
        Stack<Character> stack = new Stack<>();
        for (char c : parentheses.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) return answer = "NO";
                stack.pop();
            }
        }
        if (stack.isEmpty()) answer = "YES";
        else answer = "NO";
        return answer;
    }
}
