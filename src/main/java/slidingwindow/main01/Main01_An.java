package slidingwindow.main01;

import java.util.Scanner;

public class Main01_An {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Main01_An main03 = new Main01_An();
        System.out.println(main03.solution(n, k, arr));
    }

    public int solution(int n, int k, int[] arr) {
        int answer;
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        answer = sum;
        for (int i = k; i < n; i++) {
            sum += (arr[i] - arr[i - k]);
            answer = Math.max(answer, sum);
        }
        return answer;
    }
}
