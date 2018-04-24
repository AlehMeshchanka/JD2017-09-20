package by.it.meshchenko.jd01_07;

public class MyMath {

    public static void main(String[] args) {
        double a = Math.pow(12.0, 10.0);
        System.out.println("a = " + a);

        System.out.println("myPow = " + myPow(12, 10));

        System.out.println("m = " + (999 * 333));
        System.out.println("multiplyTwoString = " + multiplyTwoString("999", "333"));
        System.out.println("***");
        System.out.println("add = " + (999995559 + 3338899));
        System.out.println("addTwoString = " + addTwoString("999995559", "3338899"));

    }

    private static String myPow(int num, int pow) {
        String result = "";
        String strNum = Integer.toString(num);

        while (pow > 0) {
            result = multiplyTwoString(result, strNum);
            System.out.println(result);
            pow--;
        }
        return result;
    }

    private static byte[] stringReverseToByteArray(String s) {
        byte[] result;
        String str = s.trim();
        if (str.isEmpty()) {
            return null;
        }
        result = new byte[str.length()];
        int len = str.length();
        for (int i = 0; i < len; i++) {
            result[len - 1 - i] = Byte.parseByte(str.substring(i, i + 1));
        }
        return result;
    }

    private static String byteArrayToString(byte[] arr) {
        StringBuilder str = new StringBuilder();
        boolean flag = false;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (flag || arr[i] != 0) {
                str.append(arr[i]);
                flag = true;
            }
        }
        return str.toString();
    }

    private static String multiplyTwoString(String s1, String s2) {
        if (!s1.isEmpty() && !s2.isEmpty()) {
            byte[] first = stringReverseToByteArray(s1);
            byte[] second = stringReverseToByteArray(s2);
            byte[][] multArr = new byte[second.length][first.length + second.length];
            byte[] remember;
            int mult = 0;
            int summ = 0;

            // multiplyTwoString
            for (int j = 0; j < second.length; j++) {
                for (int i = 0; i < first.length; i++) {
                    mult = first[i] * second[j] + multArr[j][i + j];
                    if (mult < 10) {
                        multArr[j][i + j] = (byte) mult;
                    } else {
                        multArr[j][i + j] = (byte) (mult % 10);
                        multArr[j][i + j + 1] = (byte) (mult / 10);
                    }
                }
            }

            //summ
            remember = new byte[first.length + second.length];
            for (int j = 0; j < first.length + second.length; j++) {
                for (int i = 0; i < second.length; i++) {
                    summ = summ + multArr[i][j];
                }
                summ = summ + remember[j];
                if (summ >= 10) {
                    remember[j] = (byte) (summ % 10);
                    remember[j + 1] = (byte) (summ / 10);
                } else {
                    remember[j] = (byte) summ;
                }
                summ = 0;
            }
            return byteArrayToString(remember);

        } else if (s1.isEmpty() && !s2.isEmpty()) {
            return s2;
        } else {
            return null;
        }
    }

    private static String addTwoString(String s1, String s2) {
        if (!s1.isEmpty() && !s2.isEmpty()) {
            byte[] first = stringReverseToByteArray(s1);
            byte[] second = stringReverseToByteArray(s2);
            int maxSize = Math.max(first.length, second.length);
            byte[] remember = new byte[maxSize + 1];
            int summ = 0;

            for (int i = 0; i < maxSize; i++) {
                if (i < first.length) {
                    summ = first[i];
                }
                if (i < second.length) {
                    summ = summ + second[i];
                }
                summ = summ + remember[i];
                if (summ >= 10) {
                    remember[i] = (byte) (summ % 10);
                    remember[i + 1] = (byte) (summ / 10);
                } else {
                    remember[i] = (byte) summ;
                }
                summ = 0;
            }

            return byteArrayToString(remember);

        } else if (s1.isEmpty() && !s2.isEmpty()) {
            return s2;
        } else {
            return null;
        }
    }
}
