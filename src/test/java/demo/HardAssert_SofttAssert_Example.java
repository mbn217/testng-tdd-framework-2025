package demo;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardAssert_SofttAssert_Example {


    @Test
    public void hardAssertExample(){
        /**
         * Hard Asser Example (This is possible using the Assert class)
         * If the Assertion fails , then the rest of the code wont get executed
         */

        //Verification 1
        Assert.assertTrue(4==3);//false --> this assertion should fail
        //Verification 2
        Assert.assertTrue(6>5);//true --> this assertion should pass

    }

    @Test
    public void softAssertExample(){
        /**
         * Soft Assert example (Using SoftAssert class)
         */

        SoftAssert softAssert = new SoftAssert();
        //Verification 1
        softAssert.assertTrue(4==3);// false --> should fail
        //Verification 2
        softAssert.assertTrue(6>5); //true --> should pass

        softAssert.assertEquals("PrimeTech","Prime","Verifying primetech equality");

        softAssert.assertAll();//This is very important ! you need this line to aggregate all the assertion together




    }


}
