package test_10;

import test_10.main_04.Brick;

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
}
