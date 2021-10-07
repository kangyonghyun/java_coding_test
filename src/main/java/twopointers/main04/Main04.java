package twopointers.main04;

import java.util.Scanner;

public class Main04 {

    /*
        1. 최대 길이 연속부분수열
        2. two pointers
        3. rt 포인터는 0이 3개 일때 멈춘다
            lt 포인터는 0이 1개 일때 멈춘다
        4. 1이 최대인 개수는 (rt포인트 - lt포인트) + 1
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Main04 main04 = new Main04();
        System.out.println(main04.solution(n, k, arr));

    }

    public int solution(int n, int k, int[] arr) {
        int answer = 0;
        int cnt = 0;
        int lt = 0;
        for (int rt = 0; rt < n; rt++) {
            if (arr[rt] == 0) cnt++;
            while (cnt > k) {
                if (arr[lt] == 0) cnt--;
                lt++;
            }
            answer = Math.max(answer, rt - lt + 1);
        }
        return answer;
    }
}
