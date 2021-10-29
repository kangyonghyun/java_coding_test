package sorting;

import java.util.*;

public class Main06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Main06 main06 = new Main06();
        for (int x : main06.solution(n, arr)) {
            System.out.print(x + " ");
        }
    }

    private List<Integer> solution(int n, int[] arr) {
        List<Integer> list = new ArrayList<>();
        int[] newArr = new int[n];
        for (int i = 0; i < n; i++) {
            newArr[i] = arr[i];
        }
        Arrays.sort(newArr);
        for (int i = 0; i < n; i++) {
            if (newArr[i] != arr[i]) list.add(i + 1);
        }
        return list;
    }

}
