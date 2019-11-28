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
        Integer result = obj.findMaximum(a, b, c);
        Assert.assertEquals(c,result);
    }
}
