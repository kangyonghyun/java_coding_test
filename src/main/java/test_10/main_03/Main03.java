package test_10.main_03;

import test_10.Dynamic;

import java.util.Scanner;

public class Main03 {
    /*
        #동적 계획법
        1. 최대 부분 증가수열
        2. 다이나믹 배열에 max 원소 개수 저장
        3. 다이나믹 배열에 들어있는 값 중 max 값이 최대길이
     */

    public static void main(String[] args) {
        int[] arr = getArr();

        Dynamic dynamic = new Dynamic(arr.length);
        System.out.println(dynamic.maxValue(arr));
    }

    private static int[] getArr() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

}
