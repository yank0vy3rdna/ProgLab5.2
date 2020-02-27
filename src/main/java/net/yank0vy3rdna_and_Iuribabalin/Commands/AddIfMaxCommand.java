package net.yank0vy3rdna_and_Iuribabalin.Commands;

import net.yank0vy3rdna_and_Iuribabalin.App.Dispatcher;
import net.yank0vy3rdna_and_Iuribabalin.App.ObjectInterfaces.StoredType;

/***
 * Команда добавления при условии, что элемент больше всех тех, что уже находятся в коллекции
 */
public class AddIfMaxCommand  implements Executable {
    @Override
    public String exec(String command, Dispatcher dispatcher) {
        StoredType object = dispatcher.getReader().create("null");
        if (dispatcher.getCollectionWorker().ifMax(object)) {
            dispatcher.getCollectionWorker().insert(object);
            return "Добавлено";
        }else{
            return "Не максимальный";
        }
    }
}