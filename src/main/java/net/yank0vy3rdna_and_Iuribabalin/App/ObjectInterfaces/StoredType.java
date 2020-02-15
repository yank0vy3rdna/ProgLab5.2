package net.yank0vy3rdna_and_Iuribabalin.App.ObjectInterfaces;

import net.yank0vy3rdna_and_Iuribabalin.JSON.Workerable;

public interface StoredType extends Comparable<StoredType> {

    int compareTo(StoredType obj);

    String toString(Workerable worker);
}