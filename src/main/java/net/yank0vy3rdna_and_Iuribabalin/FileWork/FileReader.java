package net.yank0vy3rdna_and_Iuribabalin.FileWork;

import net.yank0vy3rdna_and_Iuribabalin.App.UI;

import java.io.BufferedReader;
import java.io.File;

public class FileReader implements WorkFile {

    private UI ui;

    public FileReader(){}

    @Override
    public String readFile(String filename) {
        StringBuilder answ = new StringBuilder();
        try {
            File file = new File(filename + ".txt");
            java.io.FileReader fileReader = new java.io.FileReader(file); // поток, который подключается к текстовому файлу
            BufferedReader bufferedReader = new BufferedReader(fileReader); // соединяем FileReader с BufferedReader

            String line;
            while((line = bufferedReader.readLine()) != null) {
                answ.append(line).append(";");
            }

            bufferedReader.close(); // закрываем поток
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
