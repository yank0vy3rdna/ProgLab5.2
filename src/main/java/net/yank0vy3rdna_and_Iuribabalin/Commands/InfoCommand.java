package net.yank0vy3rdna_and_Iuribabalin.Commands;

import net.yank0vy3rdna_and_Iuribabalin.App.Dispatcher;

public class InfoCommand implements Executable {
    @Override
    public String exec(String command, Dispatcher dispatcher) {
        return String.format("Тип коллекции: %s\nДата инициализации: %s\nКоличество элементов: %d",
                storable.getCollectionType(),
                storable.getCreateDate().toString(),
                storable.getSize());
    }
}
