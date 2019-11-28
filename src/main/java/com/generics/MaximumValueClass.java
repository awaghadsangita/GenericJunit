package com.generics;

public class MaximumValueClass<E extends Comparable<E>> {
    E firstParameter;
    E secondParameter;
    E thirdParameter;

    public MaximumValueClass(E firstParameter, E secondParameter, E thirdParameter) {
        this.firstParameter = firstParameter;
        this.secondParameter = secondParameter;
        this.thirdParameter = thirdParameter;
    }
    public E testMaximum(){
        return findMaximum(firstParameter,secondParameter,thirdParameter);
    }
    public E findMaximum(E a, E b, E c) {
        E max=a;
        if(b.compareTo(max)>0)
            max=b;
        if(c.compareTo(max)>0)
            max=c;

        return max;
    }
}
