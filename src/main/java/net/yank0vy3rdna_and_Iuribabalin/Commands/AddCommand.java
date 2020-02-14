package net.yank0vy3rdna_and_Iuribabalin.Commands;

import net.yank0vy3rdna_and_Iuribabalin.App.Dispatcher;
import net.yank0vy3rdna_and_Iuribabalin.App.UI;
import net.yank0vy3rdna_and_Iuribabalin.Dragon.DragonReader;

public class AddCommand implements Executable{
    DragonReader reader = new DragonReader();
    @Override
    @SuppressWarnings("unchecked")
    public String exec(String command, Dispatcher dispatcher) {
        reader.setUI(new UI());
        storable.insert(reader.create());
        return "Добавлено";
    }
}
