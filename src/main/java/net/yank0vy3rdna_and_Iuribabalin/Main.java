package net.yank0vy3rdna_and_Iuribabalin;

import net.yank0vy3rdna_and_Iuribabalin.App.App;
import net.yank0vy3rdna_and_Iuribabalin.Commands.Executable;
import net.yank0vy3rdna_and_Iuribabalin.Commands.Exit;
import net.yank0vy3rdna_and_Iuribabalin.Commands.HelpCommand;

import java.util.HashMap;

public class Main
{
    public static void main( String[] args )
    {


        HashMap<String, Executable> commands = new HashMap<>();

        commands.put("help", new HelpCommand());
        commands.put("exit", new Exit());

        App app = new App(commands);

        app.start();
    }
}
