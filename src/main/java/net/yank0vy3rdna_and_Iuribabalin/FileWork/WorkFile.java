package net.yank0vy3rdna_and_Iuribabalin.FileWork;

import net.yank0vy3rdna_and_Iuribabalin.App.UI;

import java.io.IOException;

public interface WorkFile {
    String readFile(String filename) throws IOException;
    void setUI(UI ui);
}
