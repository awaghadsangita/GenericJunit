package com.generics;

import org.junit.Assert;
import org.junit.Test;

public class testCaseGenerics {
    @Test
    public void givenThreeInteger_ShouldReturnMaximum() {
        Integer a=700;
        Integer b=200;
        Integer c=500;
        Integer d=300;
        Integer e=600;

        MaximumValueClass<Integer> obj = new <Integer>MaximumValueClass();
        Integer result = obj.testMaximum(a,b,c,d,e);
        Assert.assertEquals(a,result);
    }
    @Test
    public void givenThreeFloat_ShouldReturnMaximum() {
        Float a=700.75f;
        Float b=200.45f;
        Float c=500.25f;
        Float d=300.25f;
        Float e=600.25f;

        MaximumValueClass<Float> obj = new<Float> MaximumValueClass();
        Float result =obj.testMaximum(a,b,c,d,e);
        Assert.assertEquals(a,result);
    }
    @Test
    public void givenThreeStrings_ShouldReturnMaximum() {
        String a="Kavita";
        String b="Sneha";
        String c="Sangita";
        String d="anita";
        String e="sunita";

        MaximumValueClass<String> obj = new<String> MaximumValueClass();
        String result = obj.testMaximum(a,b,c,d,e);
        Assert.assertEquals(e,result);
    }
}
