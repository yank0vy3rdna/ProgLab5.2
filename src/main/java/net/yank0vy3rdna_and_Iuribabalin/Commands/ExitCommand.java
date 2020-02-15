package net.yank0vy3rdna_and_Iuribabalin.Commands;

import net.yank0vy3rdna_and_Iuribabalin.App.Dispatcher;
import net.yank0vy3rdna_and_Iuribabalin.App.ObjectInterfaces.StoredTypeReader;

public class ExitCommand implements Executable {
    @Override
    public String exec(String command, Dispatcher dispatcher, StoredTypeReader reader) {
        dispatcher.setEnabled(false);
        return "Работа в консоли закончена";
    }
}
