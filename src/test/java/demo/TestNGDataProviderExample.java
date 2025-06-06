package demo;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGDataProviderExample {

    //Example 1 - Option 1
//    @DataProvider(name = "data-provider-example")
//    public String[] dataProvider(){
//        String[] names = {"PrimeTech123","Doge","Bitcoin","Tesla"};
//        return  names;
//    }
//
//    @Test(dataProvider = "data-provider-example")//You can use the name specified at the attribute level for the dataprovider
//    public void myFirstTest(String names){
//        System.out.println("username is : " + names);
//
//    }

    //option 2
    @DataProvider()
    public String[] dataProvider(){
        String[] names = {"PrimeTech123","Doge","Bitcoin","Tesla"};
        return  names;
    }

    @Test(dataProvider = "dataProvider")//You can use the method name of the dataprovider
    public void myFirstTest(String names){
        System.out.println("username is : " + names);

    }


    //----------------------------  Example 2 --------------
    @DataProvider( name = "data-provider-username-password")
    public Object[][] dataProviderForUserNameAndPassword(){
        Object[][] data = { { "primetech" ,"123pass" ,23}   ,  { "bob" , "bob123" , 44}  , { "elon" , "elon123" , 54}  };
        return  data;
    }

    @Test(dataProvider = "data-provider-username-password")
    public void loginUsingUsernameAndPassword(String username , String password, int age){
        System.out.println("Username is : "+ username);
        System.out.println("password is : "+ password);
        System.out.println("age is : "+ age);
        System.out.println("----------------------");
    }

    //----------------------------  Example 3 --------------
    @DataProvider(name ="data-provider-calculator")
    public Object[][] dataProviderCalculator(){
        Object[][] numbers = {  {3,3} ,{23 , 45} , { 12 ,2}   };
        return numbers;
    }

    @Test(dataProvider = "data-provider-calculator")
    public void calculator (int num1 , int num2){
        int additionTotal = num1 + num2;
        System.out.println("The total of adding " + num1 + " and " + num2 + " is equal to --> " + additionTotal);
    }
















}
