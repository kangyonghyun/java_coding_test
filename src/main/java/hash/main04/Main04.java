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

    public int solution(String source, String target) {
        //sMap 초기화
        Map<Character, Integer> sMap = sourceMapSetting(source, target);
        //tMap 초기화
        Map<Character, Integer> tMap = targetMapSetting(target);
        // 아나그램이 되는 횟수 계산
        return countAnagram(sMap, tMap, source, target);
    }

    private int countAnagram(Map<Character, Integer> sMap, Map<Character, Integer> tMap, String source, String target) {
        int count = 0;
        int lt = 0;
        char[] arr = source.toCharArray();
        for (int rt = target.length() - 1; rt < source.length(); rt++) {
            sMap.put(arr[rt], sMap.getOrDefault(arr[rt], 0) + 1);
            if (sMap.equals(tMap)) count++;
            sMap.put(arr[lt], sMap.get(arr[lt]) - 1);
            if (sMap.get(arr[lt]) == 0) sMap.remove(arr[lt]);
            lt++;
        }
        return count;
    }

    private Map<Character, Integer> sourceMapSetting(String source, String target) {
        Map<Character, Integer> map = new HashMap<>();
        char[] arr = source.toCharArray();
        for (int i = 0; i < target.length() - 1; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        return map;
    }

    private Map<Character, Integer> targetMapSetting(String target) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : target.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        return map;
    }
}
