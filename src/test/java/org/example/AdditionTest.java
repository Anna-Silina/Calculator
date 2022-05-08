package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;
import utils.DataProviders;

public class AdditionTest extends CalculatorTest{

    private Calculator calculator = new Calculator();

    @Test(dataProvider = " meaningForAdditionTest", dataProviderClass = DataProviders.class, description = "Тут мы складываем.",
            priority = 3, invocationCount = 6, threadPoolSize = 2)
    public void additionTest(int a, int b, int expected) {
        Assert.assertEquals(calculator.addition(a,b), expected);
    }

    @Test(priority = 3)
    public void additionTest() {
        Assert.assertEquals(calculator.addition(8, 2), 10);
    }

}
