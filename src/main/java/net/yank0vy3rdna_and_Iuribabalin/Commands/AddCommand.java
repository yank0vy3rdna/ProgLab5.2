package net.yank0vy3rdna_and_Iuribabalin.Commands;

import net.yank0vy3rdna_and_Iuribabalin.App.Dispatcher;

public class AddCommand implements Executable{
    @Override
    @SuppressWarnings("unchecked")
    public String exec(String command, Dispatcher dispatcher) {
        reader.setUI(ui);
        storable.insert(reader.create());
        return "Добавлено";
    }
}
