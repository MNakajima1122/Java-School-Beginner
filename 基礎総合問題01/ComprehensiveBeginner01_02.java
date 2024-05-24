/*
* 整数値を3つ入力させ、それらの値が小さい順（等しくてもよい）に並んでいるか判定し、
* 小さい順に並んでいる場合はOK、そうなっていない場合はNGと表示するプログラムを作成してください。
*/ 

import java.util.InputMismatchException;
import java.util.Scanner;

class ComprehensiveBeginner01_02 {
    public static void main(String args[]) {
        Scanner scanner = new java.util.Scanner(System.in);

        while (true) {
            System.out.println("整数を3つ入力してください");

            try {
                System.out.print("1つ目の整数>");
                int inputNum1 = scanner.nextInt();

                System.out.print("2つ目の整数>");
                int inputNum2 = scanner.nextInt();

                System.out.print("3つ目の整数>");
                int inputNum3 = scanner.nextInt();

                if (inputNum1 < inputNum2 && inputNum2 < inputNum3) {
                    System.out.println("OK");

                } else {
                    System.out.println("NG");

                }

                break;

            } catch (InputMismatchException e) {
                System.out.println("入力された値は整数ではありません");
                scanner.next();
                continue;
            }

        }

        scanner.close();

    }
    
}
