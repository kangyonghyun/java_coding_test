package queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String compulsorySubject = sc.next();
        String plan = sc.next();

        Main02 main02 = new Main02();
        System.out.println(main02.solution(compulsorySubject, plan));
    }

    private String solution(String compulsorySubject, String plan) {
        String answer = "YES";

        Queue<Character> queue = new LinkedList<>();
        for (char c : compulsorySubject.toCharArray()) {
            queue.offer(c);
        }
        while (!queue.isEmpty()) {
            for (char c : plan.toCharArray()) {
                if (!queue.isEmpty() && queue.peek() == c) {
                    queue.poll();
                }
            }
            if (!queue.isEmpty()) return answer = "NO";
        }
        return answer;
    }
}
