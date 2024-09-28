package com.project.ex_21092024.TestNGExamples.Test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test010 {
    @Test
    public void test1(){
        Assert.assertTrue(true);
    }
    @Test
    public void test2(){
        Assert.assertTrue(false);

    }
    @Test(alwaysRun = true)
    public void test3(){
        Assert.assertTrue(true);

    }
    @Test(enabled = false)
    public void test4(){
        Assert.assertTrue(false
        );

    }
}
