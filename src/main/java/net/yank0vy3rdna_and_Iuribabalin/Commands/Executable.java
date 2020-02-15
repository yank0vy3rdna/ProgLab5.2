package net.yank0vy3rdna_and_Iuribabalin.Commands;

import net.yank0vy3rdna_and_Iuribabalin.App.Dispatcher;
import net.yank0vy3rdna_and_Iuribabalin.App.ObjectInterfaces.StoredTypeReader;

public interface Executable{
    String syntax = "";
    String exec(String command, Dispatcher dispatcher, StoredTypeReader reader);
}
