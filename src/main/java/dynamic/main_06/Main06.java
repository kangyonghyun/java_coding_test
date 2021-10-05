package dynamic.main_06;

import dynamic.Dynamic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main06 {

    /*
        1. 냅색 알고리즘
        2. 제한시간안에 풀수 있는 최대점수
        3. 다이나믹 배열에 index : 제한시간
                        value : 점수
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 문제개수
        int m = sc.nextInt(); // 제한시간

        // score time
        List<Question> questions = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int score = sc.nextInt();
            int time = sc.nextInt();
            questions.add(new Question(score, time));
        }

        Dynamic dynamic = new Dynamic(m + 1);
        System.out.println(dynamic.maxScore(m, questions));
    }

}
