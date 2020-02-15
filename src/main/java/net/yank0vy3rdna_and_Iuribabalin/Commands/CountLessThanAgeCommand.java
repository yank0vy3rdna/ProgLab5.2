package net.yank0vy3rdna_and_Iuribabalin.Commands;

import net.yank0vy3rdna_and_Iuribabalin.App.Dispatcher;

public class CountLessThanAgeCommand implements Executable {
    @Override
    public String exec(String command, Dispatcher dispatcher) {
        String[] sorted = command.split(" ");
        return String.valueOf(dispatcher.getCollectionWorker().coutAge(Integer.parseInt(sorted[1])));
    }
}
