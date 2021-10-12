package hash.main04;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();

        Main04 main04 = new Main04();
        System.out.println(main04.solution(s, t));
    }

    public int solution(String s, String t) {
        int answer = 0;

        Map<Character, Integer> map = new HashMap<>();
        char[] arr = s.toCharArray();
        for (int i = 0; i < t.length() - 1; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        Map<Character, Integer> tMap = new HashMap<>();
        for (char c : t.toCharArray()) {
            tMap.put(c, tMap.getOrDefault(c, 0) + 1);
        }

        int lt = 0;
        for (int rt = t.length() - 1; rt < s.length(); rt++) {
            map.put(arr[rt], map.getOrDefault(arr[rt], 0) + 1);
            if (map.equals(tMap)) answer++;
            map.put(arr[lt], map.get(arr[lt]) - 1);
            if (map.get(arr[lt]) == 0) map.remove(arr[lt]);
            lt++;
        }
        return answer;
    }
}
