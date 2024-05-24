/*
 * スロットマシーンプログラムを作成してください。
    1. `"ゾロ目で大当たり！チャンスは30回"`と表示させる
    2. `"begin と入力してください> "` と入力すると、開始するようにする
    3. ランダムな3つの自然数を、`"〇回目：xxx"` というように表示させる
    4. 大当たり(ゾロ目)`"〇回目で大当たりです。おめでとうございます！"` と表示させる
    5. 30回のうちに大当たりが出なかった場合、`"残念でした。終わります。"` と表示させる
 */

import java.util.Random;
import java.util.Scanner;

class ComprehensiveBeginner02_01 {
    public static void main(String args[]) {
        System.out.println("ゾロ目で大当たり!チャンスは30回");
        
        Scanner scanner = new java.util.Scanner(System.in);

        while (true) {
            System.out.print("begin と入力してください>");
            String start = scanner.nextLine();

            if (start.equals("begin")) {
                    
                for (int i = 1; i <= 30; i++) {
                    int a = new Random().nextInt(9) + 1;
                    int b = new Random().nextInt(9) + 1;
                    int c = new Random().nextInt(9) + 1;

                    if (a == b && a == c) {
                        System.out.println(i + "回目で大当たりです。おめでとうございます");
                        break;

                    } else if (i == 30) {
                        System.err.println(i + "回目" + a + b + c);
                        System.out.println("残念でした。終わります。");

                    } else {
                        System.err.println(i + "回目" + a + b + c);
                    }
                        
                }

            } else {
                System.out.println("入力された値が正しくありません");
                continue;
            }

            break;

        }

        scanner.close();

    }
}