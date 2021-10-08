package hash.main02;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main02_an {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String first = sc.next();
        String second = sc.next();

        Main02_an main02 = new Main02_an();
        System.out.println(main02.solution(first, second));
    }

    public String solution(String first, String second) {
        String answer = "YES";
        Map<Character, Integer> map = createMap(first);
        for (char c : second.toCharArray()) {
            if (!map.containsKey(c) || map.get(c) == 0) {
                return "NO";  //return 을 안할 경우, 리밋타임
            }
            map.put(c, map.get(c) - 1);
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
