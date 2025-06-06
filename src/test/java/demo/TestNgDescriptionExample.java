package demo;

import org.testng.annotations.Test;

public class TestNgDescriptionExample {


    @Test(description = "This is just a description")
    public void test(){
        System.out.println("Demo Test");
    }
}
