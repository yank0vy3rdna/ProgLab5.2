package net.yank0vy3rdna_and_Iuribabalin.App.ObjectInterfaces;

import net.yank0vy3rdna_and_Iuribabalin.App.UI;

public interface StoredTypeReader {
    UI ui = null;
    StoredType create();
    void setUi(UI ui);
}
