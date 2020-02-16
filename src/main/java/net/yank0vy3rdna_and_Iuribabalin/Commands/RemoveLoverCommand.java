package net.yank0vy3rdna_and_Iuribabalin.Commands;

import net.yank0vy3rdna_and_Iuribabalin.App.Dispatcher;
import net.yank0vy3rdna_and_Iuribabalin.App.ObjectInterfaces.StoredType;

public class RemoveLoverCommand implements Executable {
    @Override
    public String exec(String command, Dispatcher dispatcher) {
        for (StoredType element: dispatcher.getCollectionWorker().getSet()) {
            dispatcher.getCollectionWorker().removeLower(element);
        }
        return "Remove successfully";
    }
}
