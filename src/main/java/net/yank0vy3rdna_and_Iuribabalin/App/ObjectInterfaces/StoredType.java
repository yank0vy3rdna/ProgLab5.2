package net.yank0vy3rdna_and_Iuribabalin.App.ObjectInterfaces;

public interface StoredType extends Comparable<StoredType> {

    int compareTo(StoredType obj);

    String toString(Workerable worker);

    Long getAge();
}