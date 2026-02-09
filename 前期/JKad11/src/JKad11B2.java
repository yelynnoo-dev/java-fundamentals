import java.util.Scanner;

public class JKad11B2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int COFFEE = 290;
        int tax, total;
        System.out.println("ようこそ！ECCコーヒーへ ");
        System.out.print("どうしますか？（0：イートイン、0以外：テイクアウト）＞");
        int input = sc.nextInt();
        tax = (input == 0) ? (int) (COFFEE * 0.1) : (int) (COFFEE * 0.08);
        total = COFFEE + tax;
        System.out.println("コーヒー" + COFFEE + "円、消費税が" + tax + "円で合計" + total + "円になります！");
        System.out.println("ありがとうございました！");
    }
}
