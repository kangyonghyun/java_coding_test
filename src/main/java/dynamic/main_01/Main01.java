package dynamic.main_01;

import dynamic.Dynamic;

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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // n + 1 길이의 다이나믹 배열 생성
        // 배열의 마지막 인덱스가 n번째 계단에 오르는 경우의수
        Dynamic dynamic = new Dynamic(n + 1);
        System.out.println(dynamic.numberOfCase());

    }
}
