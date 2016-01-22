package chapter03;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * Created by Peng on 2016/1/22.
 * write data to a file.
 */
public class WriteData {
    public static void main(String[] args) throws FileNotFoundException {
        File mFile = new File("data/test.txt");

//        if (mFile.exists()) {
//            System.out.println("File already exists!");
//            System.exit(0);
//        }

        // Create a file.
        PrintWriter output = new PrintWriter(mFile);

        // Write something to the file.

        output.println(mFile.getAbsolutePath());
        output.print(789);
        output.append("2376");
        output.println();
        // 使用以后，要关闭文件。
        output.close();
    }
}
