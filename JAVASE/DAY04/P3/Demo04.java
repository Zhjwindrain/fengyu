package JAVASE.DAY04.P3;

import java.io.File;
import java.io.IOException;
//File
public class Demo04 {
    public static void main(String[] args) {
        File f = new File("d:/src3/TestObject.java");
        File f2 = new File("d:/src3");
        File f3 = new File(f2, "TestFile.java");
        File f4 = new File(f2, "TestFile666.java");
        File f5 = new File("d:/src3/aa/bb/cc/dd");
//f5.mkdirs();
        f5.delete();
        try {
            f4.createNewFile();
            System.out.println("文件创建成功！");
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (f.isFile()) {
            System.out.println("是一个文件！");
        }
        if (f2.isDirectory()) {
            System.out.println("是一个目录！");
        }
        if (f3.isFile()) {
            System.out.println("是一个文件奥");
        }
    }
}

