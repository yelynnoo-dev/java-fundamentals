/*
課題名:JKad06B
作成日:2025/05/08
作成者:YE LYNN OO
*/
import java.util.Scanner;

public class JKad06S2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("9桁までの正の整数を入力してください＞");
        int number = sc.nextInt(); 
        String placeValue = "1"; 

        System.out.println(number + " の2進数変換:");

        while (number > 0) {
            int bit = number % 2;
            System.out.println(placeValue + "のビットは" + bit);
            number /= 2; 
            placeValue += "0"; 
        }

        sc.close();
    }
}