package twopointers.main03;

import java.util.Arrays;
import java.util.Scanner;

public class Main03 {
    /*
        1. 연속된 자연수의 합
        2. 연속된 자연수의 합이 특정숫자를 만족하는 경우의 수
        3. two pointers 로 풀이
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Main03 main03 = new Main03();
        System.out.println(main03.solution(n));
    }

    public int solution(int n) {
        int answer = 0;
        int sum = 0;
        int lt = 0;
        int m = n/2 + 1;
        int[] arr = new int[m];
        for (int i = 0; i < m; i++) {
            arr[i] = i+1;
        }

        for (int rt = 0; rt < m; rt++) {
            sum += arr[rt];
            if (sum == n) {
                answer++;
            }
            while (sum >= n) {
                sum -= arr[lt++];
                if (sum == n) answer++;
            }
        }
        return answer;
    }

}
