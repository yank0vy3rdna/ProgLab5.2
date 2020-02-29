package net.yank0vy3rdna_and_Iuribabalin.Commands;

import net.yank0vy3rdna_and_Iuribabalin.App.Dispatcher;
import net.yank0vy3rdna_and_Iuribabalin.App.UI;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * Команда, выполняющая скрипт
 */
public class ExecuteScriptCommand implements Executable{
    static List<String> files = new ArrayList<>();
    @Override
    public String exec(String command, Dispatcher dispatcher) throws IOException {

        String[] sorted = command.split(" ");

        StringBuilder toPrint = new StringBuilder();
        Scanner scanner;
        try {
             scanner = dispatcher.getFileReader().getScanner("resources/" + sorted[1]);
        } catch (IOException | ArrayIndexOutOfBoundsException e){
            try {
                scanner = dispatcher.getFileReader().getScanner("resources/" + sorted[1] + ".txt");
            }catch (IOException | ArrayIndexOutOfBoundsException ex){
                return "No filename";
            }
        }
        UI ui = new UI();
        ui.setScanner(scanner);
        ui.setPrints(false);
        dispatcher.getReader().setUI(ui);
        try {
            try {
                while (dispatcher.getEnabled()) {
                    String line = ui.getNextCommand();
                    if (line.indexOf("execute_script") == 0) {
                        if (files.contains(line.trim().split(" ")[1])) {
                            toPrint.append("Рекурсия");
                        } else {
                            files.add(line.trim().split(" ")[1]);
                            ui.print(dispatcher.dispatch(line.trim()));
                        }
                    }else{
                        ui.print(dispatcher.dispatch(line.trim()));
                    }
                }
            }catch (NoSuchElementException ex){
                toPrint.append("\nCompleted read");
                ui.setScanner(new Scanner(System.in));
                ui.setPrints(true);
                dispatcher.getReader().setUI(ui);
            }
            return toPrint.toString();

        }catch (ArrayIndexOutOfBoundsException ex){
            return "No filename";
        }
    }
}
