package net.yank0vy3rdna_and_Iuribabalin.App;

import net.yank0vy3rdna_and_Iuribabalin.Commands.Executable;

import java.util.HashMap;
import java.util.Map;

public class App {

    private final UI ui;
    private final Dispatcher dispatcher;
    //private final CollectionWorker collection;


    public App(HashMap<String, Executable> commandsMap){
        ui = new UI();
       // collection = new CollectionWorker();
        dispatcher = new Dispatcher(commandsMap);
    }


    public void start(){
        while (dispatcher.getEnabled()){
            String line = ui.getNextCommand();
            dispatcher.dispatch(line.trim().toLowerCase());
        }
    }

}
