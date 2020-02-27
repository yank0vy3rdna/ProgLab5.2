package net.yank0vy3rdna_and_Iuribabalin.Commands;

import net.yank0vy3rdna_and_Iuribabalin.App.Dispatcher;
import net.yank0vy3rdna_and_Iuribabalin.App.ObjectInterfaces.StoredType;

/**
 * Команда, реализующая удаление всех элементов меньших данного
 */
public class RemoveLoverCommand implements Executable {
    @Override
    public String exec(String command, Dispatcher dispatcher) {
        StoredType object = dispatcher.getReader().create(null);
        dispatcher.getCollectionWorker().removeLower(object);
        return "Removed successfully";
    }
}
