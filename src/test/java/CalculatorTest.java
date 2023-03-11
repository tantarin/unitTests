import org.example.Calculator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
    Calculator calculator;
    int x;
    int y;

    @Before
    public void setUp() {
        calculator = new Calculator();
        x = 5;
        y = 7;
    }

    @Test
    public void testAdd() {
        int result = 11;
        Assert.assertEquals("add process failed!", result, calculator.add(x, y));
    }

    @Test
    public void testSub() {
        int result = -2;
        Assert.assertEquals(result, calculator.sub(x, y));
    }
}
