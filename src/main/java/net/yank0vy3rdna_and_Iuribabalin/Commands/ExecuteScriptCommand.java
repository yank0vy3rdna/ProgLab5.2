import java.io.*;

package net.yank0vy3rdna_and_Iuribabalin.Commands;

import net.yank0vy3rdna_and_Iuribabalin.App.Dispatcher;

public class ExecuteScriptCommand implements Executable{
    @Override
    public String exec(String command, Dispatcher dispatcher) {
        String filename = command.split(" ")[1];
        try {
            BufferedReader filereader = new BufferedReader(new FileReader(new File(filename)));
            String line;
            while (filereader.ready()){
                line = filereader.readLine();
                switch (line.split(" ")[0].toLowerCase()){
                    case "add":
                    case "update":
                    case "add_if_max":
                    case "remove_greater":
                    case "remove_lower":
                        break;
                    default:
                        ui.getCommander().execute(line, ui);
                }
            }
            return "Выполнено";
        } catch (FileNotFoundException e) {
            return "Файл не найден";
        } catch (IOException e) {
            e.printStackTrace();
            return "IO Exception";
        }
    }
}
