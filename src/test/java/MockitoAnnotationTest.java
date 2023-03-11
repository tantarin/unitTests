
import org.example.Calculator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class MockitoAnnotationTest {

    @Mock
    Calculator calc;

    @Test
    public void testCalcAdd()
    {
        when(calc.add(10, 20)).thenReturn(30);

        // проверяем действие сложения
        assertEquals(calc.add(10, 20), 30., 0);
        // проверяем выполнение действия
        verify(calc).add(10, 20);

        // определение поведения с использованием doReturn
        doReturn(15).when(calc).add(10, 5);

        // проверяем действие сложения
        assertEquals(calc.add(10, 5), 15, 0);
        verify(calc).add(10, 5);
    }
}
