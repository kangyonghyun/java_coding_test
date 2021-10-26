package stack;

import java.util.Scanner;
import java.util.Stack;

public class Main04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        Main04 main04 = new Main04();
        System.out.println(main04.solution(str));
    }

    private int solution(String str) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for (char c : str.toCharArray()) {
            if (48 <= c && c <= 57) {
                stack.push(c - 48);
            } else {
                int rt = stack.pop();
                int lt = stack.pop();
                if (c == '*') stack.push(lt * rt);
                if (c == '+') stack.push(lt + rt);
                if (c == '-') stack.push(lt - rt);
                if (c == '/') stack.push(lt / rt);
            }
        }
        answer = stack.get(0);
        return answer;
    }
}
