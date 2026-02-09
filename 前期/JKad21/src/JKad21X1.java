/*
課題名:JKad21A1
作成日:2025/7/3
作成者:YE LYNN OO
*/

public class JKad21X1 {
    public static void main(String[] args) {
        String[][][] maisonECC = {
                {
                        {"ピタゴラス", "アルキメデス", "ユークリッド", "エラトステネス", "フィボナッチ"},
                        {"デカルト", "フェルマー", "パスカル", "オイラー", "ラプラス"},
                        {"フーリエ", "ガウス"}
                },
                {
                        {"ド・モルガン", "ブール", "リーマン", "ポアンカレ"},
                        {"ラッセル", "ニュートン", "テイラー"}
                }
        };
        System.out.println("メゾンECCの建物数:" + maisonECC.length);
        for (int i = 0; i < maisonECC.length; i++) {
            System.out.println(i + "号館の階数:" + maisonECC[i].length);
            for (int j = 0; j < maisonECC[i].length; j++) {
                System.out.println(j + "階の部屋数:" + maisonECC[i][j].length);
            }
            System.out.println();
        }

        for (int i = 0; i < maisonECC.length; i++) {
            System.out.println(i + " 号館の住人を表示します！");
            for (int j = 0; j < maisonECC[i].length; j++) {
                System.out.println(j + "階 :");
                for (int k = 0; k < maisonECC[i][j].length; k++) {
                    System.out.println(k + " : " + maisonECC[i][j][k]);
                }
            }
            System.out.println();
        }
    }
}
