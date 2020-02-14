package net.yank0vy3rdna_and_Iuribabalin.App;

import net.yank0vy3rdna_and_Iuribabalin.Commands.Executable;

import java.util.HashMap;
import java.util.Map;

public class Dispatcher {
    private final Map<String, Executable> commandsMap;
    public Dispatcher(Map commands){
         commandsMap = new HashMap<>();
         commandsMap.putAll(commands);
    }
    public String dispatch(String line){
        Executable command = commandsMap.get(line.split(" ")[0]);
        return command.exec(line,this);
    }
}
