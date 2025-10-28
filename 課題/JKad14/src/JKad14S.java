import java.util.Scanner;

public class JKad14S {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("わたしは量子コンピュータECCトロピカルよ！");
        while (true) {
            System.out.print("何の段を教えてほしいの？＞");
            n = sc.nextInt();
            if (n < 1) {
                System.out.println("さよなら！");
                break;
            }
            if (n > 9) {
                System.out.println("そんな難しいの、わかんないわ！");
            } else {
                int i = 1;
                while (i <= 9) {
                    System.out.print((n * i) + "\t");
                    i++;
                }
                System.out.println();
            }
        }
    }
}
