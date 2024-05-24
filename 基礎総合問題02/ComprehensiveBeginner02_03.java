/*
 * 以下の表示結果が表示されるよう、下記のクラスを使用してコーディングしてください。
- buyDrink() メソッドを持つ、Coffee クラスを使用する
- buyDrink() メソッドを持つ、Juice クラスを使用する

```
バヤリース の オレンジ 味です。130 円になります。
午後の紅茶 の レモンティー 味です。150 円になります。
ボス の甘さは 控え目、 ミルク 無しです。 110 円になります。
ジョージア の甘さは 甘め、ミルク 入りです。 120 円になります。
```
 */

class Coffee {
    String brand;
    
    /*
     * 飲み物と値段を紐づけるメソッド
     */
    public void buyDrink() {
        System.out.println(
            switch (brand) {
                case "ボス" -> "110 円になります。";
                case "ジョージア" -> "120 円になります。";
                default -> "特定できませんでした";
            }
        );
    }

}

class Juice {
    String flavor;
    
    /*
     * 飲み物と値段を紐づけるメソッド
     */
    public void buyDrink() {
        System.out.println(
            switch (flavor) {
                case "バヤリース の オレンジ味" -> "130 円になります。";
                case "午後の紅茶 の レモンティー味" -> "150 円になります。";
                default -> "特定できませんでした";
            }
        );        
    }

}

class ComprehensiveBeginner02_03 {
    public static void main(String args[]) {
        Juice a001 = new Juice();
        a001.flavor = "バヤリース の オレンジ味";
        System.out.print(a001.flavor + "です。");
        a001.buyDrink();

        Juice a002 = new Juice();
        a002.flavor = "午後の紅茶 の レモンティー味";
        System.out.print(a002.flavor + "です。");
        a002.buyDrink();
        
        Coffee b001 = new Coffee();
        b001.brand = "ボス";
        System.out.print(b001.brand + " の甘さは 控え目、 ミルク 無しです。");
        b001.buyDrink();

        Coffee b002 = new Coffee();
        b002.brand = "ジョージア";
        System.out.print(b002.brand + " の甘さは 甘め、ミルク 入りです。");
        b002.buyDrink();
        
    }    

}
