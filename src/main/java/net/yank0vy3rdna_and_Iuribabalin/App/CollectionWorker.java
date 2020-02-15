package net.yank0vy3rdna_and_Iuribabalin.App;

import net.yank0vy3rdna_and_Iuribabalin.App.ObjectInterfaces.Storable;
import net.yank0vy3rdna_and_Iuribabalin.App.ObjectInterfaces.StoredType;
import net.yank0vy3rdna_and_Iuribabalin.JSON.Workerable;

import java.util.Date;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectionWorker implements Storable {
    private Set<StoredType> collection;
    private Date creationDate;
    public CollectionWorker(Set<StoredType> list){
        collection = list;
        creationDate = new Date();
    }
    @Override
    public Set<StoredType> getSet() {
        return collection;
    }

    @Override
    public Date getCreationDate() {
        return creationDate;
    }

    @Override
    public boolean remove(StoredType key) {
        return collection.remove(key);
    }

    @Override
    public void removeGreater(StoredType object) {
        collection = collection.stream().filter(x -> x.compareTo(object)<=0).collect(Collectors.toSet());
    }

    @Override
    public int getSize() {
        return collection.size();
    }

    @Override
    public String getCollectionType() {
        return collection.getClass().getSimpleName();
    }

    @Override
    public void clear() {
        collection.clear();
    }

    @Override
    public boolean ifMax(StoredType object) {
        for (StoredType obj : collection){
            if(obj.compareTo(object)>=0)
                return false;
        }
        return true;
    }

    public void save(String fileName, Workerable worker){
        worker.save(this, fileName);
    }
    @SuppressWarnings("unchecked")
    public void init(String fileName, Workerable worker) {
        CollectionWorker data = (CollectionWorker) worker.load(fileName, this.getClass());
        if (data == null){
            data = new CollectionWorker(collection);
        }
        collection = data.getSet();
        creationDate = data.getCreationDate();
    }

    @Override
    public void removeLower(StoredType object) {
        collection = collection.stream().filter(x -> x.compareTo(object)>=0).collect(Collectors.toSet());
    }

    @Override
    public void insert(StoredType object) {
        collection.add(object);
    }
}
