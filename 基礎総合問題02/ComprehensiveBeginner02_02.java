/*
 *  ジャンケンプログラムを作成してください。
    1. `"ジャンケン"`と表示させる
    2. `"0:グー 1:チョキ 2: パー ＞数字を入力してください"` 左記の数字が入力された場合、後続の処理に進み、<br>
    それ以外の数字が入力された場合、エラーとして説明した後に `1. ` に戻るようにする
    3. 今までに作成してきたジャンケンプログラムを参考に、ジャンケン処理を実装する

 */
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

class ComprehensiveBeginner02_02 {
    public static void main(String args[]) {
        Scanner scanner = new java.util.Scanner(System.in);

        while (true) {
            try {
                System.out.println("ジャンケン");

                System.out.print("0:グー 1:チョキ 2: パー ＞数字を入力してください>");
                int inputPlayHand = scanner.nextInt();

                if (inputPlayHand >= 0 && inputPlayHand <= 2) {
                    int comHand = new Random().nextInt(2);

                    if (inputPlayHand == comHand) {
                        System.out.println("あなた:" + inputPlayHand + " あいて:" + comHand +
                                janken(inputPlayHand, comHand) + "です。もう一度");

                        continue;

                    } else {
                        System.out.println("あなた:" + inputPlayHand + " あいて:" + comHand +
                                janken(inputPlayHand, comHand));

                    } 

                } else {
                    System.out.println("エラー:入力できる数字は 0, 1, 2 です");
                    continue;

                }
                
                break;
            
            } catch (InputMismatchException e) {
                System.out.println("エラー:入力された値が正しくありません");
                scanner.next();

            }

        }

        scanner.close();
    }
    
    private static String janken(int a, int b) {
        String[][] vs = {
            { " あいこ", " あなたの勝ち", " あなたの負け" },
            { " あなたの負け", " あいこ", " あなたの勝ち" },
            { " あなたの勝ち", " あなたの負け", " あいこ" } };

        return vs[a][b]; 
    }

}

