import java.util.Scanner;

public class JKad15B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] name = {"ピタゴラス", "アルキメデス", "ユークリッド", "エラトステネス", "フィボナッチ"};
        int n;
        while (true) {
            System.out.print("何号室を見ますか？");
            n = sc.nextInt();
            if (n < 0) {
                break;
            } else if (n > name.length - 1) {
                System.out.println("そんな部屋番号はありません！");
            }else {
                System.out.println(name[n] + "が住んでいます！");
            }
        }
    }
}
