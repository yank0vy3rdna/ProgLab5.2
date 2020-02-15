package net.yank0vy3rdna_and_Iuribabalin.App.ObjectInterfaces;

import net.yank0vy3rdna_and_Iuribabalin.App.UI;

public interface StoredTypeReader {
    StoredType create(String id);
    void setUI(UI ui);
}
