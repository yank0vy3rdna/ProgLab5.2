package net.yank0vy3rdna_and_Iuribabalin.Commands;

import net.yank0vy3rdna_and_Iuribabalin.App.Dispatcher;

/***
 * Интерфейс, который имплементируют все классы команд
 */
public interface Executable{
    String syntax = "";
    String exec(String command, Dispatcher dispatcher);
}
