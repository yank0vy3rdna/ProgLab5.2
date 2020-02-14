package net.yank0vy3rdna_and_Iuribabalin.Commands;

import net.yank0vy3rdna_and_Iuribabalin.App.Dispatcher;
import net.yank0vy3rdna_and_Iuribabalin.App.ObjectInterfaces.Storable;
import net.yank0vy3rdna_and_Iuribabalin.App.ObjectInterfaces.StoredTypeReader;
import net.yank0vy3rdna_and_Iuribabalin.App.UI;
import net.yank0vy3rdna_and_Iuribabalin.Dragon.DragonReader;

public class AddCommand implements Executable{
    private StoredTypeReader reader;
    private Storable storable;
    @Override
    @SuppressWarnings("unchecked")
    public String exec(String command, Dispatcher dispatcher) {
        //DragonReader reader = new DragonReader();
       // reader.setUI(new UI());
       // reader.create();
        reader.setUI(new UI());
        storable.insert(reader.create());
        return "Добавлено";
    }
}
