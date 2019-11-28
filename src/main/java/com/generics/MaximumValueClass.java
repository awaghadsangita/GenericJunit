package com.generics;

public class MaximumValueClass {
    public Integer findMaximum(Integer a, Integer b, Integer c) {
        Integer max=a;
        if(b.compareTo(max)>0)
            max=b;
        if(c.compareTo(max)>0)
            max=c;

        return max;
    }

    public Double findMaximum(Double a, Double b, Double c) {
        Double max=a;
        if(b.compareTo(max)>0)
            max=b;
        if(c.compareTo(max)>0)
            max=c;

        return max;
    }

    public String findMaximum(String a, String b, String c) {
        String max=a;
        if(b.compareTo(max)>0)
            max=b;
        if(c.compareTo(max)>0)
            max=c;

        return max;
    }
}
