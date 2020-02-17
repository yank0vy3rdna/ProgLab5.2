package net.yank0vy3rdna_and_Iuribabalin.Commands;

import net.yank0vy3rdna_and_Iuribabalin.App.CollectionWorker;
import net.yank0vy3rdna_and_Iuribabalin.App.Dispatcher;
import net.yank0vy3rdna_and_Iuribabalin.App.ObjectInterfaces.StoredTypeReader;
import net.yank0vy3rdna_and_Iuribabalin.JSON.Workerable;

public class ExitCommand implements Executable {
    @Override
    public String exec(String command, Dispatcher dispatcher) {
        dispatcher.stop();
        return "Работа в консоли закончена\n" +
                "              `..``.` ``                      \n" +
                "            `.```  `...````                   \n" +
                "          `..` `...```.``..`                  \n" +
                " ..   `. `  `:oyyy/  `...````                 \n" +
                "`sso//syo:.. .+yyy/-.  `.`````                \n" +
                " :yyysoooo+. `.--`  .```... ``                \n" +
                "  .:osssyys/-`  ..``.-`  `..``                \n" +
                "  :/yyysoosys-``.--   .``....                 \n" +
                " :ysoosssosys:--  ..`...-` `.`            ``` \n" +
                "  `.o/osso//` .-....-`  .--.           .``...`\n" +
                "       `-``-....-.  `-.```.` `..`  ````...` `.\n" +
                "       .......   ...``.`  .-..``.```..` `..`..\n" +
                "    .....-`  `.```.`  `-.```.` `...` `.``...` \n" +
                " ``....   .````.   ...` ``  ...` `.````..  ```\n" +
                "`..   `````.`   ..```.` `..`  `.``..`   .`.``.\n" +
                "` ..`````   ..```.`  .-.` `.```..   `````..  `\n" +
                ".....   `.`````  `--`  .```.-.  `.````.   ...`\n" +
                "..  ..`````   ...` `.``.--`  ..``.-`  `...`.. \n" +
                "``.....`  `..` `.` `.-`  ..``.-.  `-....-.    \n" +
                " `-.` `...``.` `...   .``..-   .--..--  .`    \n" +
                "   `.-.`..``...` `..`.-:.  `:-..--   `        \n" +
                "        `...``......-` `-.....`               ";
    }
}
