package sorting;

import java.util.Scanner;

public class Main01_An {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Main01_An main01 = new Main01_An();
        for (int i : main01.solution(n, arr)) {
            System.out.print(i + " ");
        }
    }

    private int[] solution(int n, int[] arr) {
        int[] answer = new int[n];

        for (int i = 0; i < n-1; i++) {
            int idx = i;
            for (int j = i+1; j < n; j++) {
                if (arr[idx] > arr[j]) {
                    idx = j;
                }
            }
            int tmp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = tmp;
        }

        return arr;
    }

}
