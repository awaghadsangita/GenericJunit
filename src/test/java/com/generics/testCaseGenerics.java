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
    public void givenThreeFDouble_ShouldReturnMaximum() {
        Double a=100.75;
        Double b=500.75;
        Double c=700.57;
        MaximumValueClass obj = new MaximumValueClass();
        Double result = obj.findMaximum(a, b, c);
        Assert.assertEquals(c,result);
    }
}
