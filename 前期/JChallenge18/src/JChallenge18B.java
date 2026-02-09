import java.util.Random;
import java.util.Scanner;

public class JChallenge18B {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        String[] names = {"ボロンゴ", "プックル", "チロル", "ゲレゲレ"};
        System.out.println("わしはこの世界の王、ECCキングじゃ");
        System.out.println("冒険に出たいという若者はお前か？");
        System.out.print("名は何という？＞");
        String realName = sc.nextLine();
        System.out.println( realName + "は弱そうじゃ");

        String chosenName;
        while (true) {
            String givenName = names[rand.nextInt(names.length)];
            System.out.print(givenName + "はどうじゃ？（0：やだ、それ以外：うん）＞");
            int n = sc.nextInt();
            if (n != 0) {
                chosenName = givenName;
                break;
            }
        }
        System.out.println("そうか！" + chosenName + "を気に入ってもらえたか！");
        System.out.println("行け！" + chosenName + "！世界の平和を取り戻すのじゃ！");
    }
}


