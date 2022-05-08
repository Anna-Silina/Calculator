package org.example;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import utils.TestListener;

@Listeners(TestListener.class)
public class CalculatorTest {

    private static int meaningOfTest = 1;


    @BeforeMethod
    public void start() {
        System.out.println("______________________________TEST" + " " + meaningOfTest + " " + "START______________________________");
    }

    @AfterMethod
    public void finish() {
        System.out.println("______________________________TEST" + " " + meaningOfTest++ + " " + "FINISH_____________________________");
    }


}