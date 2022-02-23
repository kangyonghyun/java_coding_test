package recursive;

import java.util.Scanner;

public class Main01_01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        Main01_01 main = new Main01_01();
        main.solution(number);
    }

    public void solution(int number) {
        DFS(number);
    }

    private void DFS(int number) {
        if (number == 0) {
            return;
        }
        DFS(number - 1);
        System.out.print(number + " ");
    }

}
