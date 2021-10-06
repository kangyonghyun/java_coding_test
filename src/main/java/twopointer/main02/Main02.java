package twopointer.main02;

import java.util.*;

public class Main02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = createArr(sc, n);
        int m = sc.nextInt();
        int[] arr2 = createArr(sc, m);

        Main02 main02 = new Main02();
        for (int x : main02.solution(n, arr1, m, arr2)) {
            System.out.print(x + " ");
        }
    }

    public List<Integer> solution(int n, int[] arr1, int m, int[] arr2) {
        inputArrSort(arr1, arr2);
        return commonElements(n, arr1, m, arr2);
    }

    private List<Integer> commonElements(int n, int[] arr1, int m, int[] arr2) {
        List<Integer> answer = new ArrayList<>();
        int p1 = 0;
        int p2 = 0;
        while (p1 < n && p2 < m) {
            if (arr1[p1] == arr2[p2]) {
                answer.add(arr1[p1]);
                p2++;
            } else if (arr1[p1] < arr2[p2]) {
                p1++;
            } else {
                p2++;
            }
        }
        return answer;
    }

    private void inputArrSort(int[] arr1, int[] arr2) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);
    }

    private static int[] createArr(Scanner sc, int length) {
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }
}
