package sorting;

import java.util.Arrays;
import java.util.Scanner;

public class Main01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Main01 main01 = new Main01();
        for (int i : main01.solution(n, arr)) {
            System.out.print(i + " ");
        }
    }

    private int[] solution(int n, int[] arr) {
        int[] answer = new int[n];

        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }

        return arr;
    }

}
