/*
 * 九九の表を、2重の繰り返し(2重for文)を使って表示するプログラムを作成してください。
 */
class ComprehensiveBeginner01_05 {
    public static void main(String args[]) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                int k = i * j;
                if (k < 10) {
                    System.out.print("  " + k);
                } else {
                    System.out.print(" " + k);
                }
            }

            System.err.println();
        }

    }    
}
