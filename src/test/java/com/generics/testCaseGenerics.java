package com.generics;

import org.junit.Assert;
import org.junit.Test;

public class testCaseGenerics {
    @Test
    public void givenThreeInteger_ShouldReturnMaximum() {
        Integer a=100;
        Integer b=500;
        Integer c=700;
        MaximumValueClass obj = new MaximumValueClass();
        Integer result = (Integer) obj.findMaximum(a, b, c);
        Assert.assertEquals(c,result);
    }
    @Test
    public void givenThreeFloat_ShouldReturnMaximum() {
        Float a=100.75f;
        Float b=500.75f;
        Float c=700.57f;
        MaximumValueClass obj = new MaximumValueClass();
        Float result = obj.findMaximum(a, b, c);
        Assert.assertEquals(c,result);
    }
    @Test
    public void givenThreeStrings_ShouldReturnMaximum() {
        String a="Kavita";
        String b="Sneha";
        String c="Sangita";
        MaximumValueClass obj = new MaximumValueClass();
        String result = obj.findMaximum(a, b, c);
        Assert.assertEquals(b,result);
    }
}
