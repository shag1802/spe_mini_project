import org.example.Main;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
public class UnscientificTest {
    private Main uncalculator;
    @Before
    public void setUp() {
        uncalculator = new Main();
    }
    @Test
    public void test_add() {
        int val = 16;
        int val2 = 4;
        int expectedResult = 20;
        int result = uncalculator.add(val,val2);
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void test_sub() {
        int val = 16;
        int val2 = 6;
        int expectedResult = 10;
        int result = uncalculator.sub(val,val2);
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void test_squareroot(){
        double a = 25.0;
        double expectedResult = 5.0;
        double result = uncalculator.squareRoot(a);
        Assert.assertEquals(expectedResult, result, 0.0f);
    }

    @Test
    public void test_power() {
        double a = 2.0;
        double b = 5.0;
        double expectedResult = 32.0;
        double result = uncalculator.power(a,b);
        Assert.assertEquals(expectedResult, result, 0.0f);
    }
}