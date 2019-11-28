package com.generics;

import org.junit.Assert;
import org.junit.Test;

public class testCaseGenerics {
    @Test
    public void givenThreeInteger_ShouldReturnMaximum() {
        Integer a=100;
        Integer b=500;
        Integer c=700;
        MaximumValueClass<Integer> obj = new <Integer>MaximumValueClass(a,b,c);
        Integer result = obj.printMax();
        Assert.assertEquals(c,result);
    }
    @Test
    public void givenThreeFloat_ShouldReturnMaximum() {
        Float a=100.75f;
        Float b=500.75f;
        Float c=700.57f;
        MaximumValueClass<Float> obj = new<Float> MaximumValueClass(a,b,c);
        Float result =obj.printMax();
        Assert.assertEquals(c,result);
    }
    @Test
    public void givenThreeStrings_ShouldReturnMaximum() {
        String a="Kavita";
        String b="Sneha";
        String c="Sangita";
        MaximumValueClass<String> obj = new<String> MaximumValueClass(a,b,c);
        String result = obj.printMax();
        Assert.assertEquals(b,result);
    }
}
