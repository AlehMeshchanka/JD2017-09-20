package by.it.meshchenko.jd01_07;

public class Runner07_01 {

    public static void main(String[] args) {
        byte a = (byte) 0b01111111111111111111111111000000;
        byte b = 0b00001111;
        int i = 0;
        System.out.println(a);
        while (i < 33) {
            a = (byte) (a >>> 1);
            System.out.println(a + " - " + Integer.toBinaryString(a));
            //System.out.println(b);
            i++;
        }
    }
}
