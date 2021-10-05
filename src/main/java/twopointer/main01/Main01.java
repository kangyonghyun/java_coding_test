package twopointer.main01;

import java.util.Arrays;
import java.util.Scanner;

public class Main01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] arr2 = new int[m];
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }

        Main01 main01 = new Main01();
        for (int i : main01.solution(arr1, arr2)) {
            System.out.print(i + " ");
        }
    }

    private int[] solution(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m = arr2.length;
        int[] answer = new int[n+m];

        for (int i = 0; i < n+m; i++) {
            if (i < n) {
                answer[i] = arr1[i];
            } else {
                answer[i] = arr2[i-n];
            }
        }

        Arrays.sort(answer);

        return answer;
    }
}
