package org.example;

import java.util.Comparator;

public class IssuedBookComparator implements Comparator<IssuedBook> {
    @Override
    public int compare(IssuedBook o1, IssuedBook o2) {
        return o1.getDateIssued().compareTo(o2.getDateIssued());
    }
}
