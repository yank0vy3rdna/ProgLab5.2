package net.yank0vy3rdna_and_Iuribabalin.App;

import net.yank0vy3rdna_and_Iuribabalin.Dragon.Dragon;

import java.util.Comparator;

public class DragonNameComparator implements Comparator<Dragon> {
    @Override
    public int compare(Dragon d1, Dragon d2) {
        return d1.getName().compareTo(d2.getName());
    }
}
