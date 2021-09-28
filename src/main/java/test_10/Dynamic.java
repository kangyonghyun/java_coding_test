package test_10.main_03;

import test_10.main_04.Brick;

import java.util.List;

public class Dynamic {

    int[] dy;

    public Dynamic(int n) {
        this.dy = new int[n];
        dy[0] = 1;
    }

    public Dynamic(int n, int v) {
        this(n);
        dy[0] = v;
    }

    public int maxValue(int[] arr) {
        int n = arr.length;
        int answer = 0;
        for (int i = 1; i < n; i++) {
            int max = 0;
            for (int j = i - 1; j >= 0; j--) {
                if (arr[j] < arr[i] && dy[j] > max) {
                    max = dy[j];
                }
            }
            dy[i] = max + 1;
            answer = Math.max(answer, dy[i]);
        }
        return answer;
    }

    public int maxValue(List<Brick> bricks) {
        int result = 0;
        int n = bricks.size();

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
