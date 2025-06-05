package demo;

import org.testng.annotations.*;

public class AnnotationDemo {

    @Test
    public void test1(){
        System.out.println("@ Test annotation for test1");
    }
    @Test
    public void test2(){
        System.out.println("@ Test annotation for test2");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("@ Before Method annotation");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("@ After Method annotation");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("@ Before Class annotation");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("@ After Class annotation");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("@ Before Test annotation");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("@ After Test annotation");
    }

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("@ Before Suite annotation");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("@ After Suite annotation");
    }




}
