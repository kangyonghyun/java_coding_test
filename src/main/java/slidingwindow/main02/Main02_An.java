package slidingwindow.main02;

import java.util.Scanner;

public class Main02_An {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // n개의 수
        int m = sc.nextInt(); // 특정숫자 m
        int[] arr = new int[n]; // 수열
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Main02_An main02 = new Main02_An();
        System.out.println(main02.solution(n, m, arr));

    }

    public int solution(int n, int m, int[] arr) {
        int answer = 0;
        int sum = 0;
        int lt = 0;
        for (int rt = 0; rt < n; rt++) {
            sum += arr[rt];
            if (sum == m) {
                answer++;
            }
            while (sum >= m) {
                sum -= arr[lt++];
                if (sum == m) answer++;
            }
        }
        return answer;
    }
}
