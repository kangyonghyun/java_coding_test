package slidingwindow.main01;

import java.util.Scanner;

public class Main01 {

    /*
        1. 3일 연속 매출 구하기
        2. 이중 for문을 이용할 경우 (Main03) -> 시간제한초과
        3. Sliding window 를 이용 -> for 문 한번
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Main01 main01 = new Main01();
        System.out.println(main01.solution(n, k, arr));
    }

    public int solution(int n, int k, int[] arr) {
        int max = 0;
        for (int i = 0; i < n-k+1; i++) {
            int tmp = 0;
            for (int j = i; j < k+i; j++) {
                tmp += arr[j];
            }
            if (tmp > max) max = tmp;
        }
        return max;
    }
}
