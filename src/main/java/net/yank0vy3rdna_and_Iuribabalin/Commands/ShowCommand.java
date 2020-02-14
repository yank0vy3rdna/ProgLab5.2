package net.yank0vy3rdna_and_Iuribabalin.Commands;

import net.yank0vy3rdna_and_Iuribabalin.App.Dispatcher;

public class ShowCommand implements Executable {
    @Override
    public String exec(String command, Dispatcher dispatcher) {
       /* StringBuilder answ = new StringBuilder();
        for (String key:
             storable.getKeySet()) {
            answ.append(key).append(" : ").append(storable.getElementById(key).toString(worker)).append("\n");
        }
        return answ.toString();*/
        return "work";
    }
}
