/*
課題名:JKad25A
作成日:2025/7/17
作成者:YE LYNN OO
*/

public class JKad25A {
    public static void main(String[] args) {
        String str1=new String("ECC Computer");
        String str2=new String("ECC Computer");

        System.out.println("str1 は"+str1+"です！");
        System.out.println("str1 は"+str2+"です！");

        System.out.println("==（比較演算子）で比較しました！");
        System.out.println(str1==str2);

        System.out.println("eauqls メソッドで比較しました！");
        System.out.println(str1.equals(str2));

        System.out.println("一文字ずつがんばって比較しました！");
        System.out.println(strEquals(str1,str2));
    }

    public static boolean strEquals(String str1, String str2) {
        if (str1.length()!=str2.length()){
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
