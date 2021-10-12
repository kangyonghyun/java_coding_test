package hash.main03;

import java.util.*;

public class Main03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Main03 main03 = new Main03();
        for (int x : main03.solution(n, k, arr)) {
            System.out.print(x + " ");
        }

    }

    public List<Integer> solution(int n, int k, int[] arr) {
        List<Integer> list = new ArrayList<>();

        for (int rt = 0; rt <= n-k; rt++) {
            Map<Integer, Integer> map = new HashMap<>();
            int lt = 0;
            while (lt < k) {
                map.put(arr[lt+rt], map.getOrDefault(arr[lt+rt], 0) + 1);
                lt++;
            }
            list.add(map.size());
        }

        return list;
    }
}
