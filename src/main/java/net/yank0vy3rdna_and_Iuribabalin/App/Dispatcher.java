package net.yank0vy3rdna_and_Iuribabalin.App;

import net.yank0vy3rdna_and_Iuribabalin.App.ObjectInterfaces.StoredType;
import net.yank0vy3rdna_and_Iuribabalin.App.ObjectInterfaces.StoredTypeReader;
import net.yank0vy3rdna_and_Iuribabalin.Commands.Executable;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Dispatcher {
    private final Map<String, Executable> commandsMap = new HashMap<>();
    private final CollectionWorker collectionWorker;
    private final StoredTypeReader reader;
    private boolean enabled = true;

    public Dispatcher(HashMap<String, Executable> commands, Set<StoredType> list, StoredTypeReader reader){
        this.reader = reader;
        collectionWorker = new CollectionWorker(list);
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

    public void setEnabled(Boolean enabled){
        this.enabled = enabled;
    }
}
