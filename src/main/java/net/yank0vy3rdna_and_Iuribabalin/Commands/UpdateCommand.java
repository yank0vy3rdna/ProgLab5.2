package net.yank0vy3rdna_and_Iuribabalin.Commands;

import net.yank0vy3rdna_and_Iuribabalin.App.Dispatcher;

public class UpdateCommand implements Executable {
    @Override
    public String exec(String command, Dispatcher dispatcher) {
        reader.setUI(ui);
        String[] splitted = command.split(" ");
        String key = ui.readField("key");
        if (storable.getElementById(key)==null) {
            storable.insert(key, reader.create());
            return "Обновлено";
        }else {
            return "Элемента с таким ключом нет";
        }
    }
}
