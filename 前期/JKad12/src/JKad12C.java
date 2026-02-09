import java.util.Scanner;

public class JKad12C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("わたしはスーパーティーチャー、ECCエクセレントよ！");
        System.out.print("あなたのクラスを教えてね！（0：IE、1：SK、2：SE）＞");
        int n = sc.nextInt();
        if (n == 0) {
            System.out.println("4年制コースなのね！");
        } else if (n == 1) {
            System.out.println("3年制コースなのね！");
        } else if (n == 2) {
            System.out.println("2年制コースなのね！");
        } else {
            System.out.println("わからないのね！");
        }
        sc.close();
    }
}
