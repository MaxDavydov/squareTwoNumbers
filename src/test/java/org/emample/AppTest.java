package org.emample;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AppTest {
    public  int squareTwoNumbers(int first) {
        return first;

    }
    @DataProvider(name = "squareDataProvider")
    Object[][] squareDataProvider() {
        return new Object[][] {
                {2,4},
                {1,1},
                {-1,1},
                {0,0},
        };
    }
    @Test(dataProvider = "squareDataProvider")
    public void testSum(int arg1, int expectedSquare) {
        System.out.println(expectedSquare);
    }
}
