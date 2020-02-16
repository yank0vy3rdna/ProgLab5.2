package net.yank0vy3rdna_and_Iuribabalin.Commands;

import net.yank0vy3rdna_and_Iuribabalin.App.Dispatcher;
import net.yank0vy3rdna_and_Iuribabalin.App.UI;

public class ExecuteScriptCommand implements Executable{
    @Override
    public String exec(String command, Dispatcher dispatcher) {
        UI ui = new UI();
        String[] sorted = command.split(" ");
        dispatcher.getFileReade().setUI(ui);
        try {
            String line = dispatcher.getFileReade().readFile(sorted[1]);
            if (line.equals("Filename is wrong"))
                return "Filename is wrong";
            else {
                sorted = line.split(";");
                for (String e : sorted) {
                    ui.print("\n" + e + ":");
                    ui.print(dispatcher.dispatch(e));
                }
                return "\nCompleted read";
            }
        }catch (ArrayIndexOutOfBoundsException e){
            return "No filename";
        }
    }
}
