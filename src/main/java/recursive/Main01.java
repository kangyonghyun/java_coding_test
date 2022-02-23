package recursive;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int[] array = new int[number];
        int[] result = solution(array, number);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }

    }

    public static int[] solution(int[] array, int number) {
        if (number == 0) {
            return array;

        }
        array[number - 1] = number;
        number--;
        return solution(array, number);
    }

}
