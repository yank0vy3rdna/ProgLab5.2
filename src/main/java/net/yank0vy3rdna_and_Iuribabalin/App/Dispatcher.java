package net.yank0vy3rdna_and_Iuribabalin.App;

import net.yank0vy3rdna_and_Iuribabalin.App.ObjectInterfaces.StoredType;
import net.yank0vy3rdna_and_Iuribabalin.App.ObjectInterfaces.StoredTypeReader;
import net.yank0vy3rdna_and_Iuribabalin.Commands.Executable;
import net.yank0vy3rdna_and_Iuribabalin.JSON.Workerable;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Dispatcher {
    private final Map<String, Executable> commandsMap = new HashMap<>();
    private final CollectionWorker collectionWorker;
    private final StoredTypeReader reader;
    private final Workerable worker;
    private final String filename;
    private boolean enabled = true;

    public Dispatcher(HashMap<String, Executable> commands, Set<StoredType> list, StoredTypeReader reader, String filename, Workerable worker){
        this.reader = reader;
        this.filename = filename;
        this.worker = worker;
        collectionWorker = new CollectionWorker(list);
        collectionWorker.init(filename,worker);
        commandsMap.putAll(commands);
    }

    public String dispatch(String line){
        if(commandsMap.get(line.split(" ")[0]) != null) {
            Executable command = commandsMap.get(line.split(" ")[0]);
            return command.exec(line, this, reader);
        }
        return "";
    }

    public CollectionWorker getCollectionWorker() {
        return collectionWorker;
    }

    boolean getEnabled(){
        return this.enabled;
    }

    public void stop(){
        this.enabled = false;
        collectionWorker.save(filename,worker);
    }
}
