import java.util.Scanner;

public class JKad13S {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("西暦年号を入力してください＞");
        int n = sc.nextInt();
        boolean leapYear = (n % 4 == 0) && (n % 100 != 0 || n % 400 == 0);
        System.out.println(leapYear?"うるう年です！":"うるう年ではありません！ ");
    }
}
