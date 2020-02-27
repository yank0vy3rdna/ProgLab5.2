package net.yank0vy3rdna_and_Iuribabalin.Commands;

import net.yank0vy3rdna_and_Iuribabalin.App.Dispatcher;
import net.yank0vy3rdna_and_Iuribabalin.App.ObjectInterfaces.StoredType;

/**
 * Команда, реализующая удаление всех элементов, больших данного
 */

public class RemoveGreaterCommand implements Executable {
    @Override
    public String exec(String command, Dispatcher dispatcher) {
        StoredType object = dispatcher.getReader().create(null);
        dispatcher.getCollectionWorker().removeGreater(object);
        return "Removed successfully";
    }
}
