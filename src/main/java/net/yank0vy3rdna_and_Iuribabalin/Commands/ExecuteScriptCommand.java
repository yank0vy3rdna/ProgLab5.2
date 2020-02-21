package net.yank0vy3rdna_and_Iuribabalin.Commands;

import net.yank0vy3rdna_and_Iuribabalin.App.Dispatcher;
import net.yank0vy3rdna_and_Iuribabalin.App.UI;

import java.util.Arrays;


public class ExecuteScriptCommand implements Executable{
    @Override
    public String exec(String command, Dispatcher dispatcher) {
        UI ui = new UI();
        String[] sorted = command.split(" ");
        dispatcher.getFileReade().setUI(ui);
        try {
            String line = dispatcher.getFileReade().readFile(sorted[1]);
            if (line.equals("Filename is wrong"))
                line = dispatcher.getFileReade().readFile(sorted[1] + ".txt");

            if (line.equals("Filename is wrong"))
                return "Filename is wrong";
            else {
                sorted = line.split(";");
                for (String e : sorted) {
                    if(e.indexOf("execute_script") == 0)
                        ui.print("\nЯ не одобряю вызов других файлов в скрипте, это может создать рекурсию\n");
                    else {
                        ui.print("\n" + e + ":");
                        ui.print(dispatcher.dispatch(e));
                    }
                }
                return "\nCompleted read";
            }
        }catch (ArrayIndexOutOfBoundsException e){
            return "No filename";
        }
    }
}
