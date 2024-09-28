package com.project.ex_21092024.TestNGExamples;

import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.qameta.allure.Description;

public class TestNG001 {
    @Severity(SeverityLevel.NORMAL)
    @Description("Verify that true == true")
    @Test
    public void testCase001(){
        Assert.assertEquals(true,true);
    }
    @Severity(SeverityLevel.BLOCKER)
    @Description("Verify that true != false")
    @Test
    public void testCase002(){
        Assert.assertEquals(true,false);

    }
}
