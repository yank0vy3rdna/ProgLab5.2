package net.yank0vy3rdna_and_Iuribabalin.App;

import net.yank0vy3rdna_and_Iuribabalin.App.ObjectInterfaces.StoredType;
import net.yank0vy3rdna_and_Iuribabalin.App.ObjectInterfaces.StoredTypeReader;
import net.yank0vy3rdna_and_Iuribabalin.Commands.Executable;
import net.yank0vy3rdna_and_Iuribabalin.FileWork.WorkFile;
import net.yank0vy3rdna_and_Iuribabalin.JSON.Workerable;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/***
 * Dispatcher - class contains all objects and make them linked.
 */
public class Dispatcher {
    public int cntex = 0;
    private final Map<String, Executable> commandsMap = new HashMap<>();
    private final CollectionWorker collectionWorker;
    private final StoredTypeReader reader;
    private final Workerable worker;
    private final String filename;
    private final WorkFile fileReader;
    private boolean enabled = true;

    public Dispatcher(HashMap<String, Executable> commands, Set<StoredType> list, StoredTypeReader reader, String filename, Workerable worker, WorkFile fileRead){
        this.reader = reader;
        this.filename = filename;
        this.worker = worker;
        this.fileReader = fileRead;
        collectionWorker = new CollectionWorker(list);
        collectionWorker.init(filename,worker);
        commandsMap.putAll(commands);
    }

    public String dispatch(String line){
        if(commandsMap.get(line.split(" ")[0].toLowerCase()) != null) {
            Executable command = commandsMap.get(line.split(" ")[0]);
            if(line.split(" ")[0].equals("execute_script"))
                cntex++;
            return command.exec(line, this);
        }
        return "No command";
    }

    public CollectionWorker getCollectionWorker() {
        return collectionWorker;
    }

    public Workerable getWorker(){
        return worker;
    }
    public StoredTypeReader getReader(){
        return reader;
    }

    public String getFilename(){
        return filename;
    }

    boolean getEnabled(){
        return this.enabled;
    }

    public WorkFile getFileReader() {
        return fileReader;
    }

    public void stop(){
        this.enabled = false;
        collectionWorker.save(filename,worker);
    }
}
