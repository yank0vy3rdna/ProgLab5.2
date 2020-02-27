package net.yank0vy3rdna_and_Iuribabalin.Commands;

import net.yank0vy3rdna_and_Iuribabalin.App.Dispatcher;
import net.yank0vy3rdna_and_Iuribabalin.App.ObjectInterfaces.StoredType;

import java.util.stream.Collectors;

/**
 * Команда, выводящая те элементы, поле name которых содержит данную строку
 */
public class FilterContainsNameCommand implements Executable{
    @Override
    public String exec(String command, Dispatcher dispatcher) {
        StringBuilder answ = new StringBuilder();
        for (StoredType element: dispatcher.getCollectionWorker().getSet().stream().filter(
                x->x.getName().contains(command.split(" ")[1])).collect(Collectors.toSet())) {
            answ.append(element.toString(dispatcher.getWorker())).append("\n");
        }
        answ.append("It is full info");
        return answ.toString();
    }
}
