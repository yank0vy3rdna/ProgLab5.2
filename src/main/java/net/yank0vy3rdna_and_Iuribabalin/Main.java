package net.yank0vy3rdna_and_Iuribabalin;

import com.google.gson.JsonDeserializer;
import net.yank0vy3rdna_and_Iuribabalin.App.App;
import net.yank0vy3rdna_and_Iuribabalin.App.ObjectInterfaces.*;
import net.yank0vy3rdna_and_Iuribabalin.Commands.*;
import net.yank0vy3rdna_and_Iuribabalin.Dragon.*;
import net.yank0vy3rdna_and_Iuribabalin.FileWork.*;
import net.yank0vy3rdna_and_Iuribabalin.JSON.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main
{
    public static void main( String[] args ) throws IOException {
        //Json file name finding
        try {
            String filename;
            if (args.length != 0) {
                filename = "resources/" + args[0];
            } else {
                filename = "resources/data.json";
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
            commands.put("info", new InfoCommand());
            commands.put("save", new SaveCommand());
            commands.put("update", new UpdateCommand());
            commands.put("remove_by_id", new RemoveCommand());
            commands.put("execute_script", new ExecuteScriptCommand());
            commands.put("count_less_than_age", new CountLessThanAgeCommand());
            commands.put("remove_lower", new RemoveLoverCommand());
            commands.put("remove_greater", new RemoveGreaterCommand());
            commands.put("add_if_max", new AddIfMaxCommand());
            commands.put("filter_contains_name", new FilterContainsNameCommand());

            // Init reader

            StoredTypeReader reader = new DragonReader();

            // Specify set type

            Set<StoredType> set = new LinkedHashSet<>();

            WorkFile fileRead = new FileReader();

            App app = new App(commands, set, reader, filename, worker, fileRead);

            app.start();
        }catch (java.util.NoSuchElementException ex){
            System.out.println("Досвидания, можно было выйти и через exit, там уточка");
        }
    }
}
