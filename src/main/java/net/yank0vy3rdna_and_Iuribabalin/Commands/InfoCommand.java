package net.yank0vy3rdna_and_Iuribabalin.Commands;

import net.yank0vy3rdna_and_Iuribabalin.App.CollectionWorker;
import net.yank0vy3rdna_and_Iuribabalin.App.Dispatcher;
import net.yank0vy3rdna_and_Iuribabalin.App.ObjectInterfaces.StoredTypeReader;
import net.yank0vy3rdna_and_Iuribabalin.JSON.Workerable;

public class InfoCommand implements Executable {
    @Override
    public String exec(String command, Dispatcher dispatcher) {
        return String.format("Тип коллекции: %s\nДата инициализации: %s\nКоличество элементов: %d",
                storable.getCollectionType(),
                storable.getCreateDate().toString(),
                storable.getSize());
    }

    @Override
    public String exec(String command, Dispatcher dispatcher, StoredTypeReader reader, CollectionWorker collectionWorker, Workerable workerable) {
        return null;
    }
}
