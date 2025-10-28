public class JKad11D1 {
    public static void main(String[] args) {
        byte b = 0;
        short s = 0;
        int i = 0;
        long l = 0;
        long l2 = 9876543210L;
        float f = 3.5F;
        int count = 1;

        while (count <= 64) {
            b = (byte) (b * 2 + 1);
            s = (short) (s * 2 + 1);
            i = (i * 2 + 1);
            l = (l * 2 + 1);
            System.out.print(count + "\t");
            System.out.print("byte型:" + b + "\t");
            System.out.print("short:" + s + "\t");
            System.out.print("int:" + i + "\t");
            System.out.println("long型:" + l);
            count++;
        }
    }
}
