package hash.main01;

import java.util.*;

public class Main01 {

    static char[] arr = {'A', 'B', 'C', 'D', 'E'};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<Character> list = new ArrayList<>();
        String str = sc.next();
        for (int i = 0; i <str.length(); i++) {
            list.add(str.charAt(i));
        }
        Main01 main01 = new Main01();
        System.out.println(main01.solution(n, list));
    }

    public Character solution(int n, List<Character> list) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : list) {
            if (map.get(c) != null) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        int max = maxValueMap(map);
        return result(max, map);
    }

    private char result(int max, Map<Character, Integer> map) {
        char answer = ' ';
        for (char c : arr) {
            if (map.get(c) == max) answer = c;
        }
        return answer;
    }

    private int maxValueMap(Map<Character, Integer> map) {
        int max = 0;
        for (int i = 0; i < 5; i++) {
            max = Math.max(max, map.get(arr[i]));
        }
        return max;
    }
}
