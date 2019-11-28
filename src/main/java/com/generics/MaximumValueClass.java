package com.generics;

public class MaximumValueClass<E extends Comparable<E>> {
    public E findMaximum(E a, E b, E c) {
        E max=a;
        if(b.compareTo(max)>0)
            max=b;
        if(c.compareTo(max)>0)
            max=c;

        return max;
    }
}
