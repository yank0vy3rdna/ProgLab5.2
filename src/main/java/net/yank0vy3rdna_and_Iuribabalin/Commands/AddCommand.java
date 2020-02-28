package net.yank0vy3rdna_and_Iuribabalin.Commands;

import net.yank0vy3rdna_and_Iuribabalin.App.Dispatcher;

/***
 * Add - команда добавления нового элемента
 */
public class AddCommand implements Executable{
    @Override
    public String exec(String command, Dispatcher dispatcher) {
        if(dispatcher.getCollectionWorker().insert(dispatcher.getReader().create("null"))) {
            return "Добавлено";
        }else{
            return "Такой элемент уже есть";
        }
    }
}
