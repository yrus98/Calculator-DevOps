import calculator.Calculator;
import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {
    private static final double DELTA = 1e-5;
    Calculator calc = new Calculator();

    @BeforeClass
    public static void BeforeCalculatorTest(){ System.out.println("Before Calculator Tests..");    }

    @Test
    public void sqrtTest(){
        assertEquals("Square Root of Integer", 4, calc.sqrt(16), DELTA);
        assertEquals("Square Root of Float", 2.5, calc.sqrt(6.25), DELTA);
        assertTrue("Square Root of Negative number", Double.isNaN(calc.sqrt(-25.0)));
    }

    @Test
    public  void factTest(){
        assertEquals("Factorial of Integer", 720, calc.fact(6), DELTA);
        assertEquals("Factorial of Integer in Floating point representation", 720, calc.fact(6.0), DELTA);
        assertTrue("Factorial of Floating Number", Double.isNaN(calc.fact(3.5)));
        assertTrue("Factorial of Negative number", Double.isNaN(calc.fact(-5)));
    }

    @Test()
    public  void logeTest(){
        assertEquals("Natural Log of Integer", 1.609437, calc.loge(5), DELTA);
        assertEquals("Natural Log of Float", 1.252762, calc.loge(3.5), DELTA);
        assertTrue("Natural Log of Zero", Double.isInfinite(calc.loge(0)));
        assertTrue("Natural Log of Negative number", Double.isNaN(calc.loge(-5)));
    }

    @Test
    public void powerTest(){
        assertEquals("Power of integers", 125, calc.power(5, 3), DELTA);
        assertEquals("Power of floats", 3.952847, calc.power(2.5, 1.5), DELTA);

    }
}
