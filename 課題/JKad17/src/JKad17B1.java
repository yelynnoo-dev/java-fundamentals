/*
課題名:JKad16A1
作成日:2025/6/19
作成者:YE LYNN OO
*/

public class JKad17B1 {
    public static void main(String[] args) {
        String[][] name = {{"ピタゴラス", "アルキメデス", "ユークリッド", "エラトステネス", "フィボナッチ"}, {"デカルト", "フェルマー", "パスカル", "オイラー", "ラプラス"}};
        System.out.println("メゾンECCの階数:" + name.length);

        for (int i = 0; i < name.length; i++) {
            System.out.println(i + "階の部屋数:" + name[i].length);
        }
        for (int i = 0; i < name.length; i++) {
            System.out.println(i + "階の住人を表示します！");
            for (int j = 0; j < name[i].length; j++) {
                System.out.println(j + ":" + name[i][j]);
            }
        }
    }
}
