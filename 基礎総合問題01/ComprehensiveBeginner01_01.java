/*
 * 整数値を入力させ、その値が偶数ならばeven、奇数ならばoddと表示するプログラムを作成してください。
 */ 

import java.util.InputMismatchException;
import java.util.Scanner;

class ComprehensiveBeginner01_01 {
    public static void main(String args[]) {
        Scanner scanner = new java.util.Scanner(System.in);
        
        while (true) {
            try {
                System.out.print("整数１つを入力してください>");
                int inputNum = scanner.nextInt();

                if (inputNum % 2 == 0) {
                    System.out.println("even");
    
                } else if (inputNum % 2 == 1 || inputNum % 2 == -1) {
                    System.out.println("odd");

                } 

                break;
        
            } catch (InputMismatchException e) {
                    System.out.println("入力された値は整数ではありません。整数を１つ入力してください>");
                    scanner.next();

            }
        }

        scanner.close();

    }
}
