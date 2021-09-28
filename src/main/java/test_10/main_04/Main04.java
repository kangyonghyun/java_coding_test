package test_10.main_04;

import test_10.Dynamic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main04 {

    /*
        1. 가장 높은 탑 쌓기
        2. 밑면이 넓고, 무거운 무게가 아래에 있다.
        3. 가장 높게 쌓아 올릴 수 있는 탑의 높이
        4. Dynamic 객체(dynamic 배열, max값 구하는 메소드)
        5. 다이나믹 배열에 높이 저장
     */

    public static void main(String[] args) {
        List<Brick> bricks = getBricks();

        Dynamic dynamic = new Dynamic(bricks.size());
        System.out.println(dynamic.maxValue(bricks));
    }

    static private List<Brick> getBricks() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Brick> bricks = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            bricks.add(new Brick(a, b, c));
        }
        return bricks;
    }
}
