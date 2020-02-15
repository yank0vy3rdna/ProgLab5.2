package net.yank0vy3rdna_and_Iuribabalin.Commands;

import net.yank0vy3rdna_and_Iuribabalin.App.Dispatcher;
import net.yank0vy3rdna_and_Iuribabalin.App.ObjectInterfaces.Storable;
import net.yank0vy3rdna_and_Iuribabalin.App.ObjectInterfaces.StoredType;
import net.yank0vy3rdna_and_Iuribabalin.App.ObjectInterfaces.StoredTypeReader;
import net.yank0vy3rdna_and_Iuribabalin.App.UI;

public class UpdateCommand implements Executable {

    @Override
    public String exec(String command, Dispatcher dispatcher) {
        UI ui = new UI();
        dispatcher.getReader().setUI(new UI());
        String[] splitted = command.split(" ");
        for (StoredType element: dispatcher.getCollectionWorker().getSet()) {
            if(element.getId() == Long.parseLong(splitted[1])) {
                dispatcher.getCollectionWorker().remove(element);
                dispatcher.getCollectionWorker().insert(dispatcher.getReader().create(splitted[1]));
                return "Update data";
            }
        }
        return "Ip is not valid";
    }
}
