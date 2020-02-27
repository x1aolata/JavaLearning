package fileTest;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Writer;

public class Test extends Thread {
    public static void main(String[] args) throws IOException {

            FileOutputStream fileInputStream = new FileOutputStream("./src/fileTest/test1.txt");
            fileInputStream.write('a');

    }
}
