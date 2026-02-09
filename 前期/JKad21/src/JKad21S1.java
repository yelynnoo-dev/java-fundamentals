/*
課題名:JKad21A2
作成日:2025/7/3
作成者:YE LYNN OO
*/

public class JKad21S1 {
    public static void main(String[] args) {
        for (int i = 9; i >= 1; i--) {
            for (int j = 0; j < 9 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= 9; i++) {
            for (int j = 0; j < 9 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
