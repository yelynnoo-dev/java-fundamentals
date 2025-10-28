/*
課題名:JKad25B1
作成日:2025/7/17
作成者:YE LYNN OO
*/

public class JKad25B1 {
    public static void main(String[] args) {
        for (int i = 0x00; i <= 0xff; i++) {
            switch (i) {
                case '\b', '\t', '\n', '\r':
                    System.out.print(".\t");
                    break;
                default:
                    System.out.print((char) i+"\t");
            }
            if (i % 16 == 15) {
                System.out.println();
            }
        }
    }
}
