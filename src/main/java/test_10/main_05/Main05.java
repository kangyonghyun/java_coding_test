package test_10.main_05;

import test_10.Dynamic;
import test_10.main_04.Main04;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main05 {

    /*
        1. 냅색 알고리즘
        2. 거슬러줄 동전의 최소개수
        3. 다이나믹 배열에 index : 잔액
                        value : 동전 개수
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int m = sc.nextInt();

        Dynamic dynamic = new Dynamic(m + 1);
        System.out.println(dynamic.minCount(n, m, arr));
    }

}
