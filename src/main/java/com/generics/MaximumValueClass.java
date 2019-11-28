package com.generics;

public class MaximumValueClass<E extends Comparable<E>> {
    E a;
    E b;
    E c;

    public MaximumValueClass(E a, E b, E c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public void printMax(E max)
    {
        System.out.println("Maximum Number :"+max);
    }

    public E testMaximum() {
        E max=this.a;
        if(this.b.compareTo(max)>0)
            max=this.b;
        if(this.c.compareTo(max)>0)
            max=this.c;
        this.printMax(max);
        return max;
    }
}
