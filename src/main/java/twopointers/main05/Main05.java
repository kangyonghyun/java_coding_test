package twopointers.main05;

import java.util.Scanner;

public class Main05 {
    /*
        1. 연속 부분수열 - 연속으로 된 수열의 합이 특정숫자가 되는 경우의 수
        2. 이중 for 문 -> 정답으로 나옴, 이상함
        3. sliding window 로 포인트 2개(lt, rt)로 밀면서 특정숫자를 찾아나간다
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // n개의 수
        int m = sc.nextInt(); // 특정숫자 m
        int[] arr = new int[n]; // 수열
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Main05 main05 = new Main05();
        System.out.println(main05.solution(n, m, arr));

    }

    public int solution(int n, int m, int[] arr) {
        int answer = 0;

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];
                if (sum == m) {
                    answer++;
                    break;
                }
                if (sum > m) {
                    break;
                }
            }
        }

        return answer;
    }
}
