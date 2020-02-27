package net.yank0vy3rdna_and_Iuribabalin.Commands;

import net.yank0vy3rdna_and_Iuribabalin.App.Dispatcher;

/***
 * Команда очищения коллекции
 */
public class ClearCommand implements Executable{
    @Override
    public String exec(String command, Dispatcher dispatcher) {
        dispatcher.getCollectionWorker().clear();
        return "Collection clear";
    }
}
