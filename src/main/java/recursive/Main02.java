package recursive;

import java.util.Scanner;

public class Main02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        Main02 main = new Main02();
        main.solution(number);
    }

    private void solution(int number) {
        DFS(number);
    }

    public void DFS(int number) {
        if (number == 0) {
            return;
        }
        DFS(number / 2);
        System.out.print(number % 2);
    }

}
