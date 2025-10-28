/*
課題名:JKad21A2
作成日:2025/7/3
作成者:YE LYNN OO
*/

public class JKad21S2 {
    public static void main(String[] args) {
        String[] subject = {"国語", "算数", "英語", "情報"};
        String[] name = {"のび太", "しずか", "出木杉"};
        int score[][] = {
                {20, 16, 12, 18},
                {96, 85, 92, 80},
                {100, 100, 100, 100}
        };

        int[] stdentTotal = {0, 0, 0};
        double[] studentAug = {0, 0, 0};

        int[] subTotal = {0, 0, 0, 0};
        double[] subAug = {0, 0, 0, 0};

        System.out.print("\t\t");
        for (int i = 0; i < subject.length; i++) {
            System.out.print(subject[i] + "\t");
        }
        System.out.println();
        for (int i = 0; i < score.length; i++) {
            System.out.print(name[i] + "\t");
            for (int j = 0; j < subject.length; j++) {
                System.out.print((score[i][j]) + "\t");
            }
            System.out.println();
        }

        System.out.println("それぞれの合計点と平均点を表示します！");
        for (int i = 0; i < score.length; i++) {
            int total = 0;
            for (int j = 0; j < score[i].length; j++) {
                total += score[i][j];
            }
            double avg = (double) total / score[i].length;
            System.out.println(name[i] + "\t合計点:" + total + "\t平均点:" + avg);
        }

        System.out.println("科目ごとの合計点と平均点を表示します！ ");
        for (int i = 0; i < subject.length; i++) {
            int total = 0;
            for (int j = 0; j < name.length; j++) {
                total += score[j][i];
            }
            double avg = (double) total / subject.length;
            System.out.println(subject[i] + "\t\t合計点:" + total + "\t平均点:" + avg);
        }
    }
}
