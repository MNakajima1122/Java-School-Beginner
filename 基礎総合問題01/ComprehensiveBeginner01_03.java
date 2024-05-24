/*
 * 2次方程式 ax^2 + bx + c = 0 （x^2はxの2乗の意味）の係数a, b, cを入力し、
 * 2次方程式の解が2つの実数解か、重解か、2つの虚数解かを判別するプログラムを作成してください。
 */


import java.util.InputMismatchException;
import java.util.Scanner;

class ComprehensiveBeginner01_03 {
    public static void main(String args[]) {
        Scanner scanner = new java.util.Scanner(System.in);

        while (true) {
            System.out.println("2次方程式 ax^2 + bx + c = 0 の係数a, b, c に好きな数値を入力してください");

            try {
                System.out.print("a >");
                double inputNumA = scanner.nextDouble();

                System.out.print("b >");
                double inputNumB = scanner.nextDouble();

                System.out.print("c >");
                double inputNumC = scanner.nextDouble();

                double numD = (inputNumB * inputNumB) - (4 * inputNumA * inputNumC);


                if (numD > 0) {
                    System.out.println(inputNumA + "x^2 + " + inputNumB + "x + " + inputNumC + " = 0 " + "は2つの実数解を持つ");

                } else if (numD == 0) {
                    System.out.println(inputNumA + "x^2 + " + inputNumB + "x + " + inputNumC + " = 0 " + "は重解を持つ");

                } else {
                    System.out.println(inputNumA + "x^2 + " + inputNumB + "x + " + inputNumC + " = 0 " + "は2つの虚数解を持つ");
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
