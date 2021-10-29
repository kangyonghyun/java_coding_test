package sorting;

import java.util.Arrays;
import java.util.Scanner;

public class Main05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Main05 main05 = new Main05();
        System.out.println(main05.solution(n, arr));
    }

    private String solution(int n, int[] arr) {
        String answer = "U";
        Arrays.sort(arr);
        for (int i = 1; i < n; i++) {
            if (arr[i] == arr[i - 1]) {
                return answer = "D";
            }
        }
        return answer;
    }

}
