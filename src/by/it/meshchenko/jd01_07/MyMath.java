package by.it.meshchenko.jd01_07;

public class MyMath {

    public static void main(String[] args) {
        double a = Math.pow(12.0, 10.0);
        System.out.println("a = " + a);

        System.out.println("myPow = " + myPow(12, 10));

        System.out.println("m = " + (999 * 3));
        System.out.println("multiplyTwoString = " + multiplyTwoString("999", "3"));
        System.out.println("***");
        System.out.println("add = " + (999 + 3));
        System.out.println("addTwoString = " + addTwoString("999", "3"));

        System.out.println("(88 - 99) = " + (88 - 99));
        System.out.println("subTwoString (88 - 99) = " + subTwoString("88", "99"));
        System.out.println("(122 - 99) = " + (122 - 99));
        System.out.println("subTwoString (122 - 99) = " + subTwoString("122", "99"));
        System.out.println("(99 - 3) = " + (99 - 3));
        System.out.println("subTwoString (99 - 3)  = " + subTwoString("99", "3"));
        System.out.println("(9 - 33) = " + (9 - 33));
        System.out.println("subTwoString (9 - 33) = " + subTwoString("9", "33"));
        System.out.println("(999 - 1000) = " + (999 - 1000));
        System.out.println("subTwoString (1000 - 1000) = " + subTwoString("1000", "1000"));

        System.out.println("myTwoFactorial 5! = " + myTwoFactorial("5"));
        System.out.println("myTwoFactorial 0! = " + myTwoFactorial("0"));
        System.out.println("myTwoFactorial 1! = " + myTwoFactorial("1"));
        System.out.println("myTwoFactorial 2! = " + myTwoFactorial("2"));
        System.out.println("myTwoFactorial -2! = " + myTwoFactorial("-2"));
        System.out.println("myTwoFactorial 6! = " + myTwoFactorial("6"));

       //System.out.println("100!*100!! = "
       //        + multiplyTwoString(myFactorial("100"),myTwoFactorial("100")));
        //45!*63!*28!*55!!
        System.out.println("45!*63!*28!*55!! = "
                + multiplyTwoString(
                    multiplyTwoString(
                        multiplyTwoString(
                                myFactorial("45"),myFactorial("63"))
                        ,myFactorial("28"))
                    ,myTwoFactorial("55")));
    }

    private static String myFactorial(String num) {
        String result = num;
        String strNum1 = num;
        String strNum2;

        if(!num.isEmpty() && num.trim().equalsIgnoreCase("0")) {
            return "1";
        }
        else if(num.trim().substring(0,1).equalsIgnoreCase("-")) {
            return "MINUS";
        }
        else if(num.equalsIgnoreCase("1")) {
            return "1";
        }
        else {
             do {
                 strNum1 = subTwoString(strNum1, "1");
                 result = multiplyTwoString(result, strNum1);
            } while (!strNum1.equalsIgnoreCase("1") );
        }

        return result;
    }

    private static String myTwoFactorial(String num) {
        String result = num;
        String strNum1 = num;
        String strNum2;

        if(!num.isEmpty() && num.trim().equalsIgnoreCase("0")) {
            return "1";
        }
        else if(num.trim().substring(0,1).equalsIgnoreCase("-")) {
            return "MINUS";
        }
        else if(num.equalsIgnoreCase("1")) {
            return "1";
        }
        else if(num.equalsIgnoreCase("2")) {
            return "2";
        }
        else {
            do {
                strNum1 = subTwoString(strNum1, "2");
                result = multiplyTwoString(result, strNum1);
            } while (!(strNum1.equalsIgnoreCase("1")
                    || strNum1.equalsIgnoreCase("2")) );
        }

        return result;
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

    private static String subTwoString(String s1, String s2) {
        if (!s1.isEmpty() && !s2.isEmpty()) {
            byte[] first = stringReverseToByteArray(s1);
            byte[] second = stringReverseToByteArray(s2);

            if(first == null || second == null) return null;

            int maxSize = 0;
            String znak = "";

            if(first.length < second.length) {
                first = stringReverseToByteArray(s2);
                second = stringReverseToByteArray(s1);
                znak = "-";
            }
            else if(first.length == second.length) {
                for (int i = first.length - 1; i > 0; i--) {
                    if (first[i] > second[i]) {
                        break;
                    }
                    else if (first[i] == second[i]) {
                        continue;
                    }
                    else {
                        first = stringReverseToByteArray(s2);
                        second = stringReverseToByteArray(s1);
                        znak = "-";
                    }
                }
            }

            maxSize = first.length;

            byte[] remember = new byte[maxSize + 1];
            int sub = 0;

            for (int i = 0; i < maxSize; i++) {
                if (i < first.length) {
                    sub = first[i];
                }
                if (i < second.length) {
                    sub = sub - second[i];
                }
                sub = sub - remember[i];
                if (sub < 0) {
                    remember[i] = (byte) (sub + 10);
                    remember[i + 1] = 1;
                } else {
                    remember[i] = (byte) sub;
                }
                sub = 0;
            }

            return znak + byteArrayToString(remember);

        } else if (s1.isEmpty() && !s2.isEmpty()) {
            return s2;
        } else {
            return null;
        }
    }
}
