/*
課題名:JKad25B2
作成日:2025/7/17
作成者:YE LYNN OO
*/

public class JKad25B2 {
    public static void main(String[] args) {
        for (int i = 0x00; i <= 0xff; i++) {
            String str = switch (i) {
                case '\b', '\t', '\n', '\r' -> ".\t";
                default -> (char) i + "\t";
            };
            System.out.print(str);
            if (i % 16 == 15) {
                System.out.println();
            }
        }
    }
}

