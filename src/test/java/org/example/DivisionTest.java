package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;
import utils.DataProviders;
import utils.Retry;

public class DivisionTest extends CalculatorTest{

    private Calculator calculator = new Calculator();

    @Test(dataProvider = "meaningForDivisionTest", dataProviderClass = DataProviders.class, description = "Тут мы делим.",
            priority = 6, invocationCount = 7, threadPoolSize = 1, retryAnalyzer = Retry.class)
    public void divisionTest(int a, int b, int expected) {
        Assert.assertEquals(calculator.division(a, b), expected);
    }
}
