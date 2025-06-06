package demo;

import org.testng.annotations.Test;

public class TestNgGroupsExample {

    @Test(groups = "smokeTest")
    public void verifyLogin(){
        System.out.println("Verify login");
    }

    @Test(groups = "smokeTest")
    public void verifyDashboard(){
        System.out.println("Verify Dashboard");
    }

    @Test(groups = "regression")
    public void verifyProductLabel(){
        System.out.println("Verify ProductLabel");
    }


}
