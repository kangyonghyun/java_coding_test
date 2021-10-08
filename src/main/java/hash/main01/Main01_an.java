package hash.main01;

import java.util.*;

public class Main01_an {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<Character> list = new ArrayList<>();
        String str = sc.next();
        Main01_an main01 = new Main01_an();
        System.out.println(main01.solution(n, str));
    }

    public char solution(int n, String str) {
        char answer = ' ';
        Map<Character, Integer> map = new HashMap<>();
        for (char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int max = Integer.MIN_VALUE;
        for (char key : map.keySet()) {
            if (map.get(key) > max) {
                max = map.get(key);
                answer = key;
            }
        }
        return answer;
    }
}
