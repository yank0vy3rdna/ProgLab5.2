package net.yank0vy3rdna_and_Iuribabalin.Commands;

import net.yank0vy3rdna_and_Iuribabalin.App.Dispatcher;

import java.io.IOException;

/**
 * Команда, выполняющая скрипт
 */
public class ExecuteScriptCommand implements Executable{
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
                if(e.indexOf("execute_script") == 0)
                    toPrint.append("\nЯ не одобряю вызов других файлов в скрипте, это может создать рекурсию\n");
                else {
                    toPrint.append(dispatcher.dispatch(e.trim()));
                }
            }

            toPrint.append("\nCompleted read");

            return toPrint.toString();

        }catch (ArrayIndexOutOfBoundsException e){
            return "No filename";
        }
    }
}
