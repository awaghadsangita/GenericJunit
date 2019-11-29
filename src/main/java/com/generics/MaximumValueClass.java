package com.generics;

public class MaximumValueClass<E extends Comparable<E>> {
    public void printMax(E max) {
        System.out.println("Maximum Number :" + max);
    }

    public E testMaximum(E... items) {
        for (int i = 0; i < items.length - 1; i++) {
            for (int j = 0; j < items.length - i - 1; j++) {
                if (items[j].compareTo(items[j + 1]) > 0) {
                    E temp = items[j];
                    items[j] = items[j + 1];
                    items[j + 1] = temp;
                }
            }
        }
        return items[items.length - 1];
    }
}
