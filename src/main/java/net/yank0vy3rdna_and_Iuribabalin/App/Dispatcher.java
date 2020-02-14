package net.yank0vy3rdna_and_Iuribabalin.App;

import net.yank0vy3rdna_and_Iuribabalin.Commands.Executable;

import java.util.HashMap;
import java.util.Map;

public class Dispatcher {
    private final Map<String, Executable> commandsMap = new HashMap<>();;
    private boolean enabled = true;
    private final UI ui;

    public Dispatcher(HashMap<String, Executable> commands){
        ui = new UI();
        commandsMap.putAll(commands);
    }

    public void dispatch(String line){
        if(commandsMap.get(line.split(" ")[0]) != null) {
            Executable command = commandsMap.get(line.split(" ")[0]);
            ui.print(command.exec(line, this));
        }

    }

    boolean getEnabled(){
        return this.enabled;
    }

    public void setEnabled(Boolean enabled){
        this.enabled = enabled;
    }
}
