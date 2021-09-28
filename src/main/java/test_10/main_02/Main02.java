package test_10.main_01;

import java.util.Scanner;

public class Main02 {

    /*
        # 동적계획법
        1. n개의 돌다리
        2. n + 1
     */

    public int solution(int n, int[] dy) {
        dy[1] = 1;
        dy[2] = 2;

        for (int i = 3; i <= n+1; i++) {
            dy[i] = dy[i - 2] + dy[i - 1];
        }
        return dy[n + 1];
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Main02 main02 = new Main02();

        int n = sc.nextInt();

        int[] dy = new int[n + 2];

        System.out.println(main02.solution(n, dy));
    }

}
