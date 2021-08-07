package com.alpha.work;

import java.util.Comparator;

public class ShapesComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        String shape1 = ((Shape) o1).getColor();
        String shape2 = ((Shape) o2).getColor();

        return shape1.compareTo(shape2);
    }
}
