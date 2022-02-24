package recursive;

import java.util.Scanner;

public class Main06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        Main06 main = new Main06();
        main.DFS(number);
    }

    private void DFS(int number) {
        if (number == 0) {
            return;
        }

        DFS(number-1);
        System.out.print(number + " ");
    }

}
