package net.yank0vy3rdna_and_Iuribabalin;

import com.google.gson.JsonDeserializer;
import net.yank0vy3rdna_and_Iuribabalin.App.App;
import net.yank0vy3rdna_and_Iuribabalin.App.ObjectInterfaces.StoredType;
import net.yank0vy3rdna_and_Iuribabalin.App.ObjectInterfaces.StoredTypeReader;
import net.yank0vy3rdna_and_Iuribabalin.Commands.*;
import net.yank0vy3rdna_and_Iuribabalin.Dragon.DragonDeserializer;
import net.yank0vy3rdna_and_Iuribabalin.Dragon.DragonReader;
import net.yank0vy3rdna_and_Iuribabalin.JSON.JSONWorker;
import net.yank0vy3rdna_and_Iuribabalin.JSON.Workerable;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main
{
    public static void main( String[] args )
    {
        //Json file name finding

        String filename;
        if(args.length!=0){
            filename = args[0];
        }else {
            filename = "data.json";
        }

        // Init concrete deserializer

        JsonDeserializer<StoredType> deserializer = DragonDeserializer.getDeserializer();

        // Init JSONWorker

        Workerable worker = new JSONWorker(deserializer);

        //Init commands

        HashMap<String, Executable> commands = new HashMap<>();

        commands.put("help", new HelpCommand());
        commands.put("exit", new ExitCommand());
        commands.put("add", new AddCommand());
        commands.put("show", new ShowCommand());
        commands.put("sum_of_age", new SumOfAgesCommand());
        commands.put("clear", new ClearCommand());

        // Init reader

        StoredTypeReader reader = new DragonReader();

        // Specify set type

        Set<StoredType> set = new LinkedHashSet<>();

        App app = new App(commands, set, reader ,filename, worker);

        app.start();
    }
}
