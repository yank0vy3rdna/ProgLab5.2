package net.yank0vy3rdna_and_Iuribabalin.FileWork;

import net.yank0vy3rdna_and_Iuribabalin.App.UI;

import java.io.IOException;
import java.util.Scanner;

public interface WorkFile {
    Scanner getScanner(String filename) throws IOException;
    void setUI(UI ui);
}
