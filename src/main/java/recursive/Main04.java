package recursive;

import java.util.Scanner;

public class Main04 {

    private static int[] cache = new int[45];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        Main04 main = new Main04();
        // 배열
        main.printArray(number);
        System.out.println();
        // 재귀
        main.printRecursive(number);
        System.out.println();
        // 캐쉬 (배열 + 재귀)
        main.printCache(number);
    }

    private void printCache(int number) {
        CDFS(number);
        for (int i = 0; i < number; i++) {
            System.out.print(cache[i] + " ");
        }
    }

    private int CDFS(int number) {
        if (number == 1 || number == 2) {
            return cache[number - 1] = 1;
        }
        return cache[number - 1] = CDFS(number - 2) + CDFS(number - 1);
    }

    private void printArray(int number) {
        int[] array = solution(number);
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    private int[] solution(int number) {
        int[] array = new int[number];
        array[0] = 1;
        array[1] = 1;
        for (int i = 2; i < array.length; i++) {
            array[i] = array[i - 2] + array[i - 1];
        }
        return array;
    }

    private void printRecursive(int number) {
        for (int i = 1; i <= number; i++) {
            System.out.print(DFS(i) + " ");
        }
    }

    private int DFS(int number) {
        if (number == 1 || number == 2) {
            return 1;
        }
        return DFS(number - 2) + DFS(number - 1);
    }

}
