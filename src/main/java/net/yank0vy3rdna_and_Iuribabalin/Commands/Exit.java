package net.yank0vy3rdna_and_Iuribabalin.Commands;

import net.yank0vy3rdna_and_Iuribabalin.App.Dispatcher;

public class Exit implements Executable {
    @Override
    public String exec(String command, Dispatcher dispatcher) {
        dispatcher.setEnabled(false);
        return "Работа в консоле закончена";
    }
}
