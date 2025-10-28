/*
課題名:JKad22C
作成日:2025/7/8
作成者:YE LYNN OO
*/

public class JKad22C {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            printMulTable(i);
        }
    }

    public static void printMulTable(int n) {
        for (int i = 1; i < 10; i++) {
            System.out.print((n * i) + "\t");
        }
        System.out.println();
    }
}
