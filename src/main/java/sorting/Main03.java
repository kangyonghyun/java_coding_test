package sorting;

import java.util.Scanner;

public class Main03 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Main03 main03 = new Main03();
        for (int i : main03.solution(n, arr)) {
            System.out.print(i + " ");
        }
    }

    private int[] solution(int n, int[] arr) {
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = 0;
            for (j = i-1; j >= 0; j--) {
                if (arr[j] > key) {
                    arr[j + 1] = arr[j];
                } else {
                    break;
                }
            }
            arr[j + 1] = key;
        }
        return arr;
    }

}
