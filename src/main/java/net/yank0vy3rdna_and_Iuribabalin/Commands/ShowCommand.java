package net.yank0vy3rdna_and_Iuribabalin.Commands;

import net.yank0vy3rdna_and_Iuribabalin.App.Dispatcher;
import net.yank0vy3rdna_and_Iuribabalin.App.ObjectInterfaces.StoredType;

/**
 * Команда, реализующая вывод всех элементов коллекции
 */
public class ShowCommand implements Executable {
    @Override
    public String exec(String command, Dispatcher dispatcher) {
        StringBuilder answ = new StringBuilder();
        for (StoredType element: dispatcher.getCollectionWorker().getSet()) {
            answ.append(element.toString(dispatcher.getWorker())).append("\n");
        }
        answ.append("It is full info");
        return answ.toString();
    }
}
