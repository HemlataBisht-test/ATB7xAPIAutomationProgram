package com.project.ex_21092024.TestNGExamples.Test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test007 {
    @Test
    public void serverStartedOk() {
        System.out.println("I will run first");
        Assert.assertTrue(false);
    }

    @Test(dependsOnMethods = "serverStartedOk")
    public void method1() {
        System.out.println("method1");
    }
}
