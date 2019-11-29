package com.generics;

import org.junit.Assert;
import org.junit.Test;

public class testCaseGenerics {
    @Test
    public void givenThreeInteger_ShouldReturnMaximum() {
        Integer[] a={700,200,500,300,600};

        MaximumValueClass<Integer> obj = new <Integer>MaximumValueClass();
        Integer result = obj.testMaximum(a);
        Assert.assertEquals(a[4],result);
    }
    @Test
    public void givenThreeFloat_ShouldReturnMaximum() {
        Float[] a={100.75f,500.75f,700.57f,50.25f,250.75f};
        MaximumValueClass<Float> obj = new<Float> MaximumValueClass();
        Float result =obj.testMaximum(a);
        Assert.assertEquals(a[4],result);
    }
    @Test
    public void givenThreeStrings_ShouldReturnMaximum() {
        String[] a={"Kavita","Sneha","Sangita","anita","sunita"};
        MaximumValueClass<String> obj = new<String> MaximumValueClass();
        String result = obj.testMaximum(a);
        Assert.assertEquals(a[4],result);
    }
}
