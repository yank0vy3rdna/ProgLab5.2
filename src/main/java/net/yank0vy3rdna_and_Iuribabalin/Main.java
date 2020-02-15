package net.yank0vy3rdna_and_Iuribabalin;

import net.yank0vy3rdna_and_Iuribabalin.App.App;
import net.yank0vy3rdna_and_Iuribabalin.Commands.*;
import net.yank0vy3rdna_and_Iuribabalin.Dragon.DragonReader;

import java.util.HashMap;
import java.util.LinkedHashSet;

public class Main
{
    public static void main( String[] args )
    {

        HashMap<String, Executable> commands = new HashMap<>();

        commands.put("help", new HelpCommand());
        commands.put("exit", new ExitCommand());
        commands.put("add", new AddCommand());
        commands.put("show", new ShowCommand());

        App app = new App(commands, new LinkedHashSet<>(), new DragonReader());

        app.start();
    }
}
