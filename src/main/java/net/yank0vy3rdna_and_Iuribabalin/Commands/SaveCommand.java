package net.yank0vy3rdna_and_Iuribabalin.Commands;

import net.yank0vy3rdna_and_Iuribabalin.App.Dispatcher;

public class SaveCommand implements Executable{
    public String exec(String command, Dispatcher dispatcher) {
        storable.save(ui.getFilename(), worker);
        return "Сохранено";
    }
}
