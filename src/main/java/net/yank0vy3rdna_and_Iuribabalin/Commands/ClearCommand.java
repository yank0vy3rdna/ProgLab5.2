package net.yank0vy3rdna_and_Iuribabalin.Commands;

import net.yank0vy3rdna_and_Iuribabalin.App.Dispatcher;

public class ClearCommand implements Executable{
    public String exec(String command, Dispatcher dispatcher) {
        storable.clear();
        return "Очищено";
    }
}
