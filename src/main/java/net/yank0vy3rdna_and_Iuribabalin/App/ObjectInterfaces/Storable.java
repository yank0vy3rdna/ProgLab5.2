package net.yank0vy3rdna_and_Iuribabalin.App.ObjectInterfaces;

import net.yank0vy3rdna_and_Iuribabalin.JSON.Workerable;

import java.util.Date;
import java.util.Set;

public interface Storable {
    Set getSet();
    Date getCreationDate();
    boolean remove(StoredType key);
    void removeGreater(StoredType object);
    int getSize();
    String getCollectionType();
    void clear();
    void save(String fileName, Workerable worker);
    boolean ifMax(StoredType object);
    void init(String fileName, Workerable worker);
    void removeLower(StoredType object);
    void insert(StoredType hum);
    int coutAge(int number);
    void sortCollection();
}
