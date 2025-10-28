/*
課題名:JKad21A2
作成日:2025/7/3
作成者:YE LYNN OO
*/

public class JKad21A2 {
    public static void main(String[] args) {
        String[] subject = {"国語", "算数", "英語", "情報"};
        String[] name = {"のび太", "しずか", "出木杉"};
        int score[][] = {
                {20, 16, 12, 18},
                {96, 85, 92, 80},
                {100, 100, 100, 100}
        };

        System.out.print("\t\t");
        for (int i = 0; i < subject.length ; i++) {
            System.out.print(subject[i]+"\t");
        }
        System.out.println();
        for (int i = 0; i < score.length; i++) {
            System.out.print(name[i]+"\t");
            for (int j = 0; j < subject.length; j++) {
                System.out.print((score[i][j])+"\t");
            }
            System.out.println();
        }
    }
}
