/*
 * とある美術館の入場料金は、一人600円であるが、5人以上のグループなら一人550円、20人以上の団体なら一人500円である。
 * 人数を入力し、入場料の合計を計算するプログラムを作成してください。
 */

import java.util.InputMismatchException;
import java.util.Scanner;

class ComprehensiveBeginner01_04 {
    public static void main(String args[]) {
        Scanner scanner = new java.util.Scanner(System.in);

        while (true) {
            try {
                System.out.print("人数を入力してください>");
                int people = scanner.nextInt();

                if (people >= 1 && people < 5) {
                    int fee = 600 * people;
                    System.out.println("入場料金は" + fee + "円です");

                } else if (people >= 5 && people < 20) {
                    int fee = 550 * people;
                    System.out.println("入場料金は" + fee + "円です");

                } else if (people >= 20) {
                    int fee = 500 * people;
                    System.out.println("入場料金は" + fee + "円です");

                } else {
                    System.out.println("人数が適切ではありません");
                    continue;

                }

                break;

            } catch (InputMismatchException e) {
                System.out.println("入力された値が正しくありません");
                scanner.next();
                continue;
            }
        }

        scanner.close();

    }    
}
