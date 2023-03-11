import org.example.Calculator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
    int x;
    int y;

    @Before
    public void setUp() {
        x = 5;
        y = 7;
    }

    @Test
    public void testAdd() {
        int result = 11;
        Assert.assertEquals("add process failed!", result, Calculator.add(x, y));
    }

    @Test
    public void testSub() {
        int result = -2;
        Assert.assertEquals(result, Calculator.sub(x, y));
    }
}
