import java.util.Scanner;

/*
課題名:JKad25S2
作成日:2025/7/24
作成者:YE LYNN OO
*/
public class JKad25S2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("文字列1を入力してください＞");
        String str1 = sc.next();

        System.out.print("文字列2を入力してください＞");
        String str2 = sc.next();

        int result = strContains(str1, str2);

        if (result == -1) {
            System.out.println("同じ文字列は見つかりませんでした！");
        } else {
            System.out.println((result + 1) + "文字目から同じ文字列を見つけました！");
        }

        sc.close();
    }

    public static int strContains(String str1, String str2) {
        if (str2.length() > str1.length()) {
            return -1;
        }

        for (int i = 0; i <= str1.length() - str2.length(); i++) {
            int j;
            for (j = 0; j < str2.length(); j++) {
                char c1 = str1.charAt(i + j);
                char c2 = str2.charAt(j);

                if (c1 != c2) {
                    break;
                }
            }
            if (j == str2.length()) {
                return i;
            }
        }
        return -1;
    }
}