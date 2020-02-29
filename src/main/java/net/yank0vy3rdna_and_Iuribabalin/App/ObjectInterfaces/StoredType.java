package net.yank0vy3rdna_and_Iuribabalin.App.ObjectInterfaces;

import net.yank0vy3rdna_and_Iuribabalin.Dragon.Coordinates;
import net.yank0vy3rdna_and_Iuribabalin.Dragon.DragonCharacter;
import net.yank0vy3rdna_and_Iuribabalin.Dragon.DragonType;
import net.yank0vy3rdna_and_Iuribabalin.Dragon.Person;
import net.yank0vy3rdna_and_Iuribabalin.JSON.Workerable;

public interface StoredType extends Comparable<StoredType> {
    boolean equals(StoredType obj);
    int compareTo(StoredType obj);

    String toString(Workerable worker);

    Long getAge();

    String getName();

    long getId();

    void setId(long id);

    public DragonType getType();

    public Coordinates getCoordinates();

    public long getWeight();

    public DragonCharacter getCharacter();

    public Person getKiller();
}