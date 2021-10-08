package hash.main02;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String first = sc.next();
        String second = sc.next();

        Main02 main02 = new Main02();
        System.out.println(main02.solution(first, second));
    }

    public String solution(String first, String second) {
        String answer;
        Map<Character, Integer> fMap = createMap(first);
        Map<Character, Integer> sMap = createMap(second);
        if (isEqualMap(fMap, sMap)) answer = "YES";
        else answer = "NO";
        return answer;
    }

    private boolean isEqualMap(Map<Character, Integer> fMap, Map<Character, Integer> sMap) {
        boolean answer = false;
        for (char c : sMap.keySet()) {
            if (!fMap.containsKey(c) || (fMap.get(c).equals(sMap.get(c)))) {
                return false;
            } else {
                answer = true;
            }
        }
        return answer;
    }

    private Map<Character, Integer> createMap(String str) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        return map;
    }

}
