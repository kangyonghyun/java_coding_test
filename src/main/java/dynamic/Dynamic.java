package dynamic;

import dynamic.main_04.Brick;
import dynamic.main_06.Question;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Dynamic {

    private int[] dy;

    public Dynamic(int n) {
        this.dy = new int[n];
    }

    // 계단오르기, 돌다리건너기 경우의 수
    public int numberOfCase() {
        int n = dy.length;
        dy[1] = 1;
        dy[2] = 2;
        for (int i = 3; i <= n-1; i++) {
            dy[i] = dy[i - 2] + dy[i - 1];
        }
        return dy[n - 1];
    }

    // 순열 최대길이 값
    public int maxValue(int[] arr) {
        int n = arr.length;
        int result = 0;
        dy[0] = 1;
        for (int i = 1; i < n; i++) {
            int max = 0;
            for (int j = i - 1; j >= 0; j--) {
                if (arr[j] < arr[i] && dy[j] > max) {
                    max = dy[j];
                }
            }
            dy[i] = max + 1;
            result = Math.max(result, dy[i]);
        }
        return result;
    }

    // 벽돌 최대높이 값
    public int maxValue(List<Brick> bricks) {
        int result = 0;
        int n = bricks.size();
        Collections.sort(bricks);
        dy[0] = bricks.get(0).getHeight();
        for (int i = 1; i < n; i++) {
            int max_h = 0;
            for (int j = i - 1; j >= 0; j--) {
                if (bricks.get(j).getWeight() > bricks.get(i).getWeight() && max_h < dy[j] ) {
                    max_h = dy[j];
                }
            }
            dy[i] = max_h + bricks.get(i).getHeight();
            result = Math.max(result, dy[i]);
        }
        return result;
    }

    // 거스름돈을 줄수 있는 최소 동전개수
    public int minCount(int cnt, int money, Integer[] coin) {
        Arrays.fill(dy, Integer.MAX_VALUE);
        dy[0] = 0;
        for (int i = 0; i < cnt; i++) {
            for (int j = coin[i]; j <= money; j++) {
                dy[j] = Math.min(dy[j], dy[j - coin[i]] + 1);
            }
        }
        return dy[money];
    }

    // 제한시간안에 풀수 있는 문제의 최대 점수
    public int maxScore(int time, List<Question> questions) {
        dy[0] = 0;
        for (Question q : questions) {
            for (int j = time; j >= q.getTime(); j--) {
                dy[j] = Math.max(dy[j], dy[j - q.getTime()] + q.getScore());
            }
        }
        return dy[time];
    }

}
