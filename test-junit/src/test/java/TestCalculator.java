import static org.junit.Assert.assertEquals;
import org.junit.Test;

import com.saslab.Calculator;


public class TestCalculator {
    
    @Test
    public void testSum() {
        float a = 10, b = 7;

        Calculator calculator = new Calculator();
        float result = calculator.sum(a, b);

        assertEquals(a+b, result, 1e-6);
    }

    @Test
    public void testMultiply() {
        float a = 3, b = 9;

        Calculator calculator = new Calculator();
        assertEquals(a*b, calculator.multiply(a, b), 1e-6);
    }
}
