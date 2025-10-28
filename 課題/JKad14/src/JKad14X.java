import java.util.Random;
import java.util.Scanner;

public class JKad14X {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        String[] strHands = {"グー", "チョキ", "パー"};
        String[] strResults = {"あいこだ！", "あなたの勝ち！", "あなたの負け！"};

        int user;
        while (true) {
            System.out.print("あなたは何を出しますか？（0：グー、1：チョキ、2：パー、-1：終了）＞");
            user = sc.nextInt();
            if (user < 0) {
                break;
            } else if (user > 2) {
                System.out.println("そんな手はありません！");
            } else {
                int computer = rand.nextInt(3);
                System.out.println("あなたは" + strHands[user] + "を出した！");
                System.out.println("コンピュータは" + strHands[computer] + "を出した！");

                int result;
                if (user == computer) {
                    result = 0;
                } else if ((user == 0 && computer == 1) || (user == 1 && computer == 2) || (user == 2 && computer == 0)) {
                    result = 1;
                } else {
                    result = 2;
                }
                System.out.println(strResults[result]);
            }
        }
    }
}
