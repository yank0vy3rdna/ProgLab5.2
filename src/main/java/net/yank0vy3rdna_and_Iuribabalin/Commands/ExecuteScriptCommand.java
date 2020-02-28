package net.yank0vy3rdna_and_Iuribabalin.Commands;

import net.yank0vy3rdna_and_Iuribabalin.App.Dispatcher;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Команда, выполняющая скрипт
 */
public class ExecuteScriptCommand implements Executable{
    static List<String> files =  new ArrayList<String>();
    @Override
    public String exec(String command, Dispatcher dispatcher) throws IOException {

        String[] sorted = command.split(" ");

        StringBuilder toPrint = new StringBuilder();
        String line;

        try {
            line = dispatcher.getFileReader().readFile("resources/" + sorted[1]);
        }catch (IOException e){
            line = dispatcher.getFileReader().readFile("resources/" + sorted[1] + ".txt");
        }


        try {

            sorted = line.split(";");

            for (String e : sorted) {
                if(e.indexOf("execute_script") == 0) {
                    if(files.contains(e)){
                        toPrint.append("Рекурсия");
                    }else{
                        files.add(e);
                        toPrint.append(dispatcher.dispatch(e.trim()));
                    }
                }else {
                    toPrint.append("\n").append(dispatcher.dispatch(e.trim())).append("\n");
                }
            }

            toPrint.append("\nCompleted read");

            return toPrint.toString();

        }catch (ArrayIndexOutOfBoundsException e){
            return "No filename";
        }
    }
}
