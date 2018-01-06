package by.it.meshchenko.jd01_07;

import java.io.IOException;
import java.io.RandomAccessFile;

public class Runner07 {
    public static void main(String[] args) {

        //Целочисленные пулы Java составляют от -128 до 127.
        int i1 = 128;
        int i2 = 128;
        Integer i3 = 128;
        Integer i4 = 128;
        Integer i5 = new Integer(128);
        Integer i6 = new Integer(128);

        System.out.println("1. int == int");
        if(i1==i2) System.out.println("true");
        else System.out.println("false");

        System.out.println("2. int == Integer");
        if(i1==i3) System.out.println("true");
        else System.out.println("false");

        System.out.println("3. int == new Integer()");
        if(i1==i5) System.out.println("true");
        else System.out.println("false");

        System.out.println("4. Integer == Integer");
        if(i3==i4) System.out.println("true");
        else System.out.println("false");

        System.out.println("5. Integer == new Integer()");
        if(i3==i5) System.out.println("true");
        else System.out.println("false");

        System.out.println("6. new Integer() == new Integer()");
        if(i5==i6) System.out.println("true");
        else System.out.println("false");


        String str1 = "1000";
        String str2 = "1000";
        String str3 = new String("1000");
        String str4 = new String("1000");

        System.out.println("\n7. String '' == String ''");
        if(str1==str2) System.out.println("true");
        else System.out.println("false");

        System.out.println("8. String '' == new String()");
        if(str1==str3) System.out.println("true");
        else System.out.println("false");

        System.out.println("9. new String() ==  new String()");
        if(str3==str4) System.out.println("true");
        else System.out.println("false");


        boolean b1 = true;
        boolean b2 = true;
        Boolean b3 = true;
        Boolean b4 = true;
        Boolean b5 = new Boolean(true);
        Boolean b6 = new Boolean(true);
        System.out.println("\n10. boolean ==  boolean");
        if(b1==b2) System.out.println("true");
        else System.out.println("false");

        System.out.println("11. boolean ==  Boolean");
        if(b1==b3) System.out.println("true");
        else System.out.println("false");

        System.out.println("12. boolean ==  new Boolean()");
        if(b1==b5) System.out.println("true");
        else System.out.println("false");

        System.out.println("13. Boolean ==  Boolean");
        if(b3==b4) System.out.println("true");
        else System.out.println("false");

        System.out.println("13. Boolean ==  new Boolean()");
        if(b3==b5) System.out.println("true");
        else System.out.println("false");

        System.out.println("14. new Boolean() ==  new Boolean()");
        if(b5==b6) System.out.println("true");
        else System.out.println("false");
    }
}




//    public static void main(String[] args) throws IOException{
//        int a;
//        // Инициализация статических и логических блоков при создании объектов:
//            // static блок инициализируется только один раз,
//            //      при первом создании объекта или при
//            //      первом обращении к static методу;
//            // логический блок инициализируется каждый раз,
//            //      и только, при создании объекта класса
////            System.out.println("Example1.main();");
////            Example1.main();
////
////            System.out.println("Example1 new1 = new Example1();");
////            Example1 new1 = new Example1();
////            System.out.println("Example1 new2 = new Example1();");
////            Example1 new2 = new Example1(); // ''
//            //System.out.println("Example1.main();");
//            //Example1.main();
//
//
//        //***************************
//
////        String src = System.getProperty("user.dir") + "/src/by/it/meshchenko/";
////        String fileInTxt = src + "jd01_07/random.dat";
////        //запись (все подряд)
////        RandomAccessFile file = new RandomAccessFile(fileInTxt, "rw");
////        String abc = "abcdefgh";
////        String s2 = "12345678";
////        // записываем строку переведенную в биты
////        file.seek(4);
////        file.write(abc.getBytes());
////        file.seek(12);
////        file.write(s2.getBytes());
////        file.skipBytes(4);
////        file.setLength(8);
////        // закрываем файл, после чего данные записываемые данные попадут в файл
////        file.close();
////        //переоткроем его только для чтения
////        file = new RandomAccessFile(fileInTxt, "r");
////        long n=file.length();
////        StringBuilder sb=new StringBuilder();
////        for (long position = n-1; position >=0 ; position--) {
////            file.seek(position);
////            sb.append((char)file.read());
////        }
////        file.close();
////        System.out.println(sb);
////
//
//
//
//    }
//}
