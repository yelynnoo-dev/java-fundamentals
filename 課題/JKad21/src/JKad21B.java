/*
課題名:JKad21B
作成日:2025/7/3
作成者:YE LYNN OO
*/

public class JKad21B {
    public static void main(String[] args) {
        String[][] maison = {
                {"ピタゴラス", "アルキメデス", "ユークリッド", "エラトステネス", "フィボナッチ"},
                {"デカルト", "フェルマー", "パスカル", "オイラー", "ラプラス"},
                {"フーリエ", "ガウス"}
        };
        System.out.println("メゾンECCの階数:"+maison.length);
        for (int i = 0; i < maison.length; i++) {
            System.out.println(i+"階の部屋数:"+maison[i].length);
        }
        for (int i = 0; i < maison.length; i++) {
            System.out.println(i+"階");
            for (int j = 0; j < maison[i].length; j++) {
                System.out.println(j+":"+maison[i][j]);
            }
        }
    }
}
