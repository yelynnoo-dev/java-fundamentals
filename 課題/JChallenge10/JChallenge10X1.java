/*
‰Û‘è–¼:JChallenge10X1
ì¬“ú:2025/05/22
ì¬Ò:YE LYNN OO
*/
import java.util.Scanner;

public class JChallenge10X1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("2Œ…`9Œ…‚Ì®”‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢„");
        int n = sc.nextInt();
        System.out.println("ŠeŒ…‚Ì”š‚ğ‡Œv‚µ‚Ü‚·I");
        while (n >= 10) {
            int sum = 0, temp = n;
            boolean first = true;
            String output = "";
            while (temp > 0) {
                int digit = temp % 10;
                sum += digit;
                temp /= 10;
                if (first) {
                    output = digit + output;
                    first = false;
                } else {
                    output = digit + " + " + output;
                }
            }
            System.out.println(output + " = " + sum);
            n = sum;
        }
        sc.close();
    }
}

