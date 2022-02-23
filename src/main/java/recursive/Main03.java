package recursive;

import java.util.Scanner;

public class Main03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        Main03 main03 = new Main03();

        System.out.println(main03.solution(number));
    }

    private int solution(int number) {
        if (number == 1) {
            return 1;
        }
        return number * solution(number - 1);
    }

}
