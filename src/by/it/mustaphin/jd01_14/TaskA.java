package by.it.mustaphin.jd01_14;

import java.io.*;

public class TaskA {

    String src = System.getProperty("user.dir") + "/src/by/it/mustaphin/jd01_14/someFile";

    void write() {
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(new File(src)))) {
            for (int i = 0; i < 20; i++) {
                dos.writeInt((int) (Math.random() * 100) + 1);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    void read() {
        try (DataInputStream dis = new DataInputStream(new FileInputStream(new File(src)))) {
            while (dis.available() > 0) {
                System.out.println(dis.readInt());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
