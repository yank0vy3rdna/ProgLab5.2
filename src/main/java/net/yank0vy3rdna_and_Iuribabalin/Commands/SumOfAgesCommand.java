package net.yank0vy3rdna_and_Iuribabalin.Commands;

import net.yank0vy3rdna_and_Iuribabalin.App.Dispatcher;
import net.yank0vy3rdna_and_Iuribabalin.App.ObjectInterfaces.StoredType;

/**
 * Команда, суммирующая значения полей age всех элементов коллекции
 */
public class SumOfAgesCommand implements Executable {
    @Override
    public String exec(String command, Dispatcher dispatcher) {
        long summ = 0;
        for (StoredType element: dispatcher.getCollectionWorker().getSet()) {
            summ = summ + element.getAge();
        }
        return String.valueOf(summ);
    }
}
