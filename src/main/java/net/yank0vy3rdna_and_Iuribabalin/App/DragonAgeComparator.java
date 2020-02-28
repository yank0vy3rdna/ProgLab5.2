package net.yank0vy3rdna_and_Iuribabalin.App;

import net.yank0vy3rdna_and_Iuribabalin.Dragon.Dragon;

import java.util.Comparator;

public class DragonAgeComparator implements Comparator<Dragon> {
    @Override
    public int compare(Dragon d1, Dragon d2) {
        if(d1.getAge() > d2.getAge())
            return 1;
        else if(d1.getAge() < d2.getAge())
            return -1;
        else
            return 0;
    }
}
