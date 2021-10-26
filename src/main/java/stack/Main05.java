package stack;

import java.util.Scanner;
import java.util.Stack;

public class Main05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String problem = sc.next();

        Main05 main05 = new Main05();
        System.out.println(main05.solution(problem));
    }

    private int solution(String str) {
        int answer = 0;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                stack.push('(');
            } else {
                stack.pop();
                if (str.charAt(i - 1) == '(') {
                    answer += stack.size();
                } else {
                    answer++;
                }
            }
        }
        return answer;
    }

}
