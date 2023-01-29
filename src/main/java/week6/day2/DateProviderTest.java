package week6.day2;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DateProviderTest {

    @Test(dataProvider = "2dInput")
    public void print2DArray(String name, int age) {
        System.out.println("Age of the person '" + name + "' is: " + age);
    }

    @DataProvider(name = "2dInput")
    public Object[][] sendData() {
        Object[][] data = new Object[3][2];

        data[0][0] = "Balamurugan";
        data[0][1] = 32;

        data[1][0] = "Thenmozhi";
        data[1][1] = 26;

        data[2][0] = "Sahana";
        data[2][1] = 4;

        return data;
    }

}
