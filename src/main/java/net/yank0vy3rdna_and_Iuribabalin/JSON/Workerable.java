package net.yank0vy3rdna_and_Iuribabalin.JSON;

import net.yank0vy3rdna_and_Iuribabalin.App.ObjectInterfaces.Storable;

public interface Workerable {
    Object readValue(String json, Class<?> cls);
    String writeValue(Object object);
    Object load(String filename, Class cls);
    void save(Storable object, String filename);
}