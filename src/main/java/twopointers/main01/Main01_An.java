package twopointers.main01;

import java.util.*;

public class Main01_An {

    /*
        1. 정렬된 오름차순 배열 2개
        2. 오름차운으로 정렬된 배열을 출력
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = createArr(sc, n);
        int m = sc.nextInt();
        int[] arr2 = createArr(sc, m);

        Main01_An main01_An = new Main01_An();
        for (int i : main01_An.solution(n, arr1, m, arr2)) {
            System.out.print(i + " ");
        }
    }

    private List<Integer> solution(int n, int[] arr1, int m, int[] arr2) {
        List<Integer> answer = new ArrayList<>();
        int p1 = 0;
        int p2 = 0;
        while (p1 < n && p2 < m) {
            if (arr1[p1] < arr2[p2]) {
                answer.add(arr1[p1++]);
            } else {
                answer.add(arr2[p2++]);
            }
        }
        while (p1 < n) {
            answer.add(arr1[p1++]);
        }
        while (p2 < m) {
            answer.add(arr2[p2++]);
        }
        return answer;
    }

    private static int[] createArr(Scanner sc, int length) {
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

}
