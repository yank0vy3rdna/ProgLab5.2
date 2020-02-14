package net.yank0vy3rdna_and_Iuribabalin.Commands;

import net.yank0vy3rdna_and_Iuribabalin.App.Dispatcher;

public class AddIfMaxCommand implements Executable {
    public String exec(String command, Dispatcher dispatcher) {
        reader.setUI(ui);
        StoredType storedObject = reader.create();
        if(storable.ifMax(storedObject)) {
            storable.insert(storedObject);
            return "Добавлено";
        }else {
            return "Не максимальный";
        }
    }
}
