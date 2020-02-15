package net.yank0vy3rdna_and_Iuribabalin.App;

import net.yank0vy3rdna_and_Iuribabalin.App.ObjectInterfaces.StoredType;
import net.yank0vy3rdna_and_Iuribabalin.App.ObjectInterfaces.StoredTypeReader;
import net.yank0vy3rdna_and_Iuribabalin.Commands.Executable;
import net.yank0vy3rdna_and_Iuribabalin.JSON.Workerable;

import java.util.HashMap;
import java.util.Set;

public class App {

    private final UI ui;
    private final Dispatcher dispatcher;

    public App(HashMap<String, Executable> commandsMap, Set<StoredType> set, StoredTypeReader reader, String filename, Workerable worker){
        ui = new UI();
        reader.setUI(ui);
        dispatcher = new Dispatcher(commandsMap, set, reader, filename, worker);
    }


    public void start(){
        while (dispatcher.getEnabled()){
            String line = ui.getNextCommand();
            ui.print(dispatcher.dispatch(line.trim().toLowerCase()));
        }
    }

}
