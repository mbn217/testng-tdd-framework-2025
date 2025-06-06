package demo;

import org.testng.annotations.Test;

public class TestNgPrioritiesExample {




    @Test
    public void test2(){
        System.out.println("test 2");
    }

    @Test
    public void test3(){
        System.out.println("test 3");
    }

    @Test
    public void test1(){
        System.out.println("test 1");
    }


    @Test(priority = 3)
    public void amazon(){
        System.out.println("amazon");
    }
    @Test(priority = 2)
    public void ebay(){
        System.out.println("ebay");
    }



}
