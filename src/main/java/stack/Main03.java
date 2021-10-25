package stack;

import java.util.Scanner;
import java.util.Stack;

public class Main03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] board = new int[n][n];

        for (int i = 0; i <n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = sc.nextInt();
            }
        }
        int m = sc.nextInt();
        int[] moves = new int[m];
        for (int i = 0; i < m; i++) {
            moves[i] = sc.nextInt();
        }
        Main03 main03 = new Main03();
        System.out.println(main03.solution(n, board, m, moves));
    }

    public int solution(int n, int[][] board, int m, int[] moves) {
        int answer = 0;

        Stack<Integer> stack = new Stack<>();

        for (int i : moves) {
            int pos = i - 1;
            for (int j = 0; j < n; j++) {
                if (board[j][pos] != 0){
                    int tmp = board[j][pos];
                    board[j][pos] = 0;
                    if (!stack.isEmpty() && stack.peek() == tmp) {
                        stack.pop();
                        answer += 2;
                    } else {
                        stack.push(tmp);
                    }
                    break;
                }
            }
        }
        return answer;
    }
}
