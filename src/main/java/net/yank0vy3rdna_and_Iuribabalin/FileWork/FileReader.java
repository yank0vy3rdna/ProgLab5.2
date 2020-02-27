package net.yank0vy3rdna_and_Iuribabalin.FileWork;

import net.yank0vy3rdna_and_Iuribabalin.App.UI;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class FileReader implements WorkFile {

    private UI ui;

    public FileReader(){}

    @Override
    public String readFile(String filename) {

        StringBuilder answ = new StringBuilder();

        try {

            BufferedReader reader = new BufferedReader((new InputStreamReader(new FileInputStream(filename))));

            String line;

            while((line = reader.readLine()) != null) {
                answ.append(line).append(";");
            }

            reader.close(); // закрываем поток
        } catch (Exception e) {
            return "Filename is wrong";
        }
        return answ.toString();
    }

    @Override
    public void setUI(UI ui) {
        this.ui = ui;
    }

}
