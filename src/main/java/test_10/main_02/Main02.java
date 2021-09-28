package test_10.main_02;

import test_10.Dynamic;

import java.util.Scanner;

public class Main02 {

    /*
        # 동적계획법
        1. 계단오르기와 동일
        2. 돌다리를 건넌 후 지면까지 와야한다 -> n+1
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Dynamic dynamic = new Dynamic(n + 2);
        System.out.println(dynamic.numberOfCase());
    }


}
