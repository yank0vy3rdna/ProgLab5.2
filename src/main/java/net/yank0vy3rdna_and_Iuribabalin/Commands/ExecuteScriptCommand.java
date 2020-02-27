package net.yank0vy3rdna_and_Iuribabalin.Commands;

import net.yank0vy3rdna_and_Iuribabalin.App.Dispatcher;

/**
 * Команда, выполняющая скрипт
 */
public class ExecuteScriptCommand implements Executable{
    @Override
    public String exec(String command, Dispatcher dispatcher) {
        String[] sorted = command.split(" ");
        StringBuilder toPrint = new StringBuilder();
        try {
            String line = dispatcher.getFileReader().readFile(sorted[1]);
            if (line.equals("Filename is wrong"))
                line = dispatcher.getFileReader().readFile(sorted[1] + ".txt");

            if (line.equals("Filename is wrong"))
                return "Filename is wrong";
            else {
                sorted = line.split(";");
                for (String e : sorted) {
                    if(e.indexOf("execute_script") == 0)
                        toPrint.append("\nЯ не одобряю вызов других файлов в скрипте, это может создать рекурсию\n");
                    else {
                        toPrint.append("\n").append(e).append(":");
                        toPrint.append(dispatcher.dispatch(e));
                    }
                }
                toPrint.append("\nCompleted read");
                return toPrint.toString();
            }
        }catch (ArrayIndexOutOfBoundsException e){
            return "No filename";
        }
    }
}
