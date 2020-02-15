package net.yank0vy3rdna_and_Iuribabalin.Commands;

import net.yank0vy3rdna_and_Iuribabalin.App.CollectionWorker;
import net.yank0vy3rdna_and_Iuribabalin.App.Dispatcher;
import net.yank0vy3rdna_and_Iuribabalin.App.ObjectInterfaces.StoredTypeReader;
import net.yank0vy3rdna_and_Iuribabalin.JSON.Workerable;

public class InfoCommand implements Executable {

    @Override
    public String exec(String command, Dispatcher dispatcher) {

        return "Collection type: " + dispatcher.getCollectionWorker().getCollectionType() + "\nInitialization data: " + dispatcher.getCollectionWorker().getCreationDate() + "\nNumber of elements: " +  dispatcher.getCollectionWorker().getSize();

    }
}
