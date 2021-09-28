package test_10.main_01;

import java.util.Scanner;

public class Main01 {

    /*
        # 동적계획법
        1. n번째 계단까지 올라가는 방법의 수
        2. 1번째 계단   -> 1
           2번쨰 계단   -> 2
           3번쨰 계단   -> 1번째 계단의 경우의수 + 2번째 계단의 경우의수
           4번째 계단   -> 2번째 계단의 경우의수 + 3번째 계단의 경우의수
        3. 메모제이션
     */

    public int solution(int n, int[] dy) {
        dy[1] = 1;
        dy[2] = 2;
        for (int i = 3; i <= n; i++) {
            dy[i] = dy[i - 2] + dy[i - 1];
        }
        return dy[n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Main01 main01 = new Main01();

        int n = sc.nextInt();
        int[] dy = new int[n + 1];

        System.out.println(main01.solution(n, dy));


    }
}
