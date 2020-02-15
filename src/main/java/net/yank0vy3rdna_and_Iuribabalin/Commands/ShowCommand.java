package net.yank0vy3rdna_and_Iuribabalin.Commands;

import net.yank0vy3rdna_and_Iuribabalin.App.CollectionWorker;
import net.yank0vy3rdna_and_Iuribabalin.App.Dispatcher;
import net.yank0vy3rdna_and_Iuribabalin.App.ObjectInterfaces.StoredType;
import net.yank0vy3rdna_and_Iuribabalin.App.ObjectInterfaces.StoredTypeReader;
import net.yank0vy3rdna_and_Iuribabalin.JSON.Workerable;

public class ShowCommand implements Executable {
    @Override
    public String exec(String command, Dispatcher dispatcher, StoredTypeReader reader, CollectionWorker collectionWorker,Workerable worker) {
        StringBuilder answ = new StringBuilder();
        for (StoredType element: collectionWorker.getSet()) {
            answ.append(element.toString(worker)).append("\n");
        }
        answ.append("It is full info");
        return answ.toString();
    }
}
