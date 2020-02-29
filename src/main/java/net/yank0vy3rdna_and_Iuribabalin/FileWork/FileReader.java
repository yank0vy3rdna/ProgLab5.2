package net.yank0vy3rdna_and_Iuribabalin.FileWork;

import net.yank0vy3rdna_and_Iuribabalin.App.UI;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class FileReader implements WorkFile {

    private UI ui;

    public FileReader(){}

    @Override
    public Scanner getScanner(String filename) throws IOException {


        BufferedReader reader = new BufferedReader((new InputStreamReader(new FileInputStream(filename))));
        char[] charBuffer = new char[8 * 1024];
        StringBuilder builder = new StringBuilder();
        int numCharsRead;
        while ((numCharsRead = reader.read(charBuffer, 0, charBuffer.length)) != -1) {
            builder.append(charBuffer, 0, numCharsRead);
        }
        InputStream targetStream = new ByteArrayInputStream(
                builder.toString().getBytes(StandardCharsets.UTF_8));
        return new Scanner(targetStream);

    }


    @Override
    public void setUI(UI ui) {
        this.ui = ui;
    }

}
