package stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Main02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        Main02 main02 = new Main02();
        for (Character c : main02.solution(str)) {
            System.out.print(c);
        }
    }

    public List<Character> solution(String str) {
        List<Character> list = new ArrayList<>();
        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray()) {
            if (c == '(') stack.push(c);
            else if (c == ')') stack.pop();

            if (stack.isEmpty() && c != '(' && c != ')') {
                list.add(c);
            }
        }

        return list;
    }
}
