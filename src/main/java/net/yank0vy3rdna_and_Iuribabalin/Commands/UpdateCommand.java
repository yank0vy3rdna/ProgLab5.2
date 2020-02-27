package net.yank0vy3rdna_and_Iuribabalin.Commands;

import net.yank0vy3rdna_and_Iuribabalin.App.Dispatcher;
import net.yank0vy3rdna_and_Iuribabalin.App.ObjectInterfaces.StoredType;

/**
 * Команда, заменяющая значение элемента с данным id на данное
 */
public class UpdateCommand implements Executable {

    @Override
    public String exec(String command, Dispatcher dispatcher) {
        try {
            String[] splitted = command.split(" ");
            for (StoredType element : dispatcher.getCollectionWorker().getSet()) {
                if (element.getId() == Long.parseLong(splitted[1])) {
                    dispatcher.getCollectionWorker().remove(element);
                    dispatcher.getCollectionWorker().insert(dispatcher.getReader().create(splitted[1]));
                    return "Update data";
                }
            }
        }catch (ArrayIndexOutOfBoundsException e){
            return "Id wasn't found!!!";
        }
        return "Id is not valid";
    }
}
