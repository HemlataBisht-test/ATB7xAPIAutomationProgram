package com.project.ex_21092024.TestNGExamples.Test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test006 {
    @Test(groups = {"sanity", "qa", "preprod"})
public void sanityRun(){
    System.out.println("Sanity");
    System.out.println("QA");
    Assert.assertTrue(true);
}

    @Test(groups = {"qa","preprod", "reg"})
    public void RegRun(){
        System.out.println("Reg");
        Assert.assertTrue(false);
    }

    @Test(groups = {"dev","stage"})
    public void SmokeRun(){
        System.out.println("Smoke");
        Assert.assertTrue(false);
    }

    @Test(groups = {"sanity", "qa", "preprod"})
    public void sanityRun1(){
        System.out.println("Sanity");
        System.out.println("QA");
        Assert.assertTrue(true);
    }

    @Test(groups = {"qa","preprod", "reg"})
    public void RegRun2(){
        System.out.println("Reg");
        Assert.assertTrue(false);
    }

    @Test(groups = {"dev","stage"})
    public void SmokeRun3(){
        System.out.println("Smoke");
        Assert.assertTrue(false);
    }
}
