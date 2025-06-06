package demo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNgDependentOnExample {


    @Test
    public void login(){
        Assert.assertTrue(false);
    }

    @Test(dependsOnMethods = "login")
    public void createItem(){
        System.out.println("Item created");
    }



}
