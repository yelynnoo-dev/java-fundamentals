/*
課題名:JKad22B
作成日:2025/7/8
作成者:YE LYNN OO
*/

public class JKad22B {
    public static void main(String[] args) {
        showBMI("ドラえもん", 129.3, 129.3);
        showBMI("ドラミちゃん", 100.0, 91.0);
    }

    public static void showBMI(String name, double height, double weight) {
        double heightMeter = height / 100;
        double BMI = weight / heightMeter / heightMeter;
        System.out.println(name + "のBMIは" + BMI + "です！");
    }
}
