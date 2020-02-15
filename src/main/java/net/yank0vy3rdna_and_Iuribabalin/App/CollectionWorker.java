package net.yank0vy3rdna_and_Iuribabalin.App;

import net.yank0vy3rdna_and_Iuribabalin.App.ObjectInterfaces.Storable;
import net.yank0vy3rdna_and_Iuribabalin.App.ObjectInterfaces.StoredType;

import java.util.Set;

public class CollectionWorker implements Storable {
    private Set<StoredType> collection;
    public CollectionWorker(Set<StoredType> list){
        collection = list;
    }
    Set<StoredType> getCollection(){
        return collection;
    }

    @Override
    public void insert(StoredType object) {
        collection.add(object);
    }
}
