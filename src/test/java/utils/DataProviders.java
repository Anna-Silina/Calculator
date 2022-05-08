package utils;

import org.testng.annotations.DataProvider;

public class DataProviders {
    @DataProvider
    public static Object[][] meaningForAdditionTest() {
        return new Object[][] {
                {2, 4, 4},
                {3, 4, 7},

        };
    }

    @DataProvider
    public static Object[][] meaningForSubtractionTest() {
        return new Object[][] {
                {4, 4, 0},
                {0, 4, 4},

        };
    }

    @DataProvider
    public static Object[][] meaningForMultiplicationTest() {
        return new Object[][] {
                {4, 1, 2},
                {6, 6, 7},

        };
    }

    @DataProvider
    public static Object[][] meaningForDivisionTest() {
        return new Object[][] {
                {4, 4, 1},
                {5, 0, 1},


        };
    }

}
