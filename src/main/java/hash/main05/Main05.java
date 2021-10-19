package hash.main05;

import java.util.*;

public class Main05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Main05 main05 = new Main05();
        System.out.println(main05.solution(n, k, arr));
    }

    public int solution(int n, int k, Integer[] arr) {
        Set<Integer> treeSet = createReverseTreeSet(n, arr);
        return resultTreeSet(k, treeSet);
    }

    private int resultTreeSet(int k, Set<Integer> treeSet) {
        int answer = -1;
        int cnt = 0;
        for (int s : treeSet) {
            cnt++;
            if (cnt == k) answer = s;
        }
        return answer;
    }

    private TreeSet<Integer> createReverseTreeSet (int n, Integer[] arr) {
        TreeSet<Integer> treeSet = new TreeSet<>(Comparator.reverseOrder());
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                for (int l = j+1; l < n; l++) {
                    treeSet.add(arr[i] + arr[j] + arr[l]);
                }
            }
        }
        return treeSet;
    }
}
