package stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Main02_An {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        Main02_An main02 = new Main02_An();
        System.out.println(main02.solution(str));
    }

    public String solution(String str) {
        String answer = "";
        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray()) {
            if (c == ')') {
                while(stack.pop() != '(');
            } else {
                stack.push(c);
            }
        }
        for (int i = 0; i < stack.size(); i++) {
            answer += stack.get(i);
        }
        return answer;
    }
}
