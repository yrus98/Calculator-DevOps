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
    public void sqrtTruePositive(){
        assertEquals("TruePositive : Square Root of Integer", 4, calc.sqrt(16), DELTA);
        assertEquals("TruePositive : Square Root of Float", 2.5, calc.sqrt(6.25), DELTA);
    }

    @Test
    public void sqrtTrueNegative(){
        assertTrue("TrueNegative : Square Root of Negative number", Double.isNaN(calc.sqrt(-25.0)));
    }

    @Test
    public void sqrtFalsePositive(){
        assertNotEquals("FalsePositive : Square Root of Integer", 2, calc.sqrt(16), DELTA);
        assertNotEquals("FalsePositive : Square Root of Float", 5, calc.sqrt(6.25), DELTA);
    }

    @Test
    public  void factorialTruePositive(){
        assertEquals("TruePositive : Factorial of Integer", 720, calc.fact(6), DELTA);
        assertEquals("TruePositive : Factorial of Integer in Floating point representation", 720, calc.fact(6.0), DELTA);
    }

    @Test
    public  void factorialTrueNegative(){
        assertTrue("TrueNegative : Factorial of Floating Number", Double.isNaN(calc.fact(3.5)));
        assertTrue("TrueNegative : Factorial of Negative number", Double.isNaN(calc.fact(-5)));
    }

    @Test
    public  void factorialFalsePositive(){
        assertNotEquals("FalsePositive : Factorial of Integer", 720, calc.fact(4), DELTA);
        assertNotEquals("FalsePositive : Factorial of Integer in Floating point representation", 720, calc.fact(4.0), DELTA);
    }

    @Test()
    public  void logeTruePositive(){
        assertEquals("TruePositive : Natural Log of Integer", 1.609437, calc.loge(5), DELTA);
        assertEquals("TruePositive : Natural Log of Float", 1.252762, calc.loge(3.5), DELTA);
    }

    @Test()
    public  void logeTrueNegative(){
        assertTrue("TrueNegative : Natural Log of Zero", Double.isInfinite(calc.loge(0)));
        assertTrue("TrueNegative : Natural Log of Negative number", Double.isNaN(calc.loge(-5)));
    }

    @Test()
    public  void logeFalsePositive(){
        assertNotEquals("FalsePositive : Natural Log of Integer", 1.25, calc.loge(5), DELTA);
        assertNotEquals("FalsePositive : Natural Log of Float", 3.5, calc.loge(3.5), DELTA);
    }

    @Test
    public void powerTruePositive(){
        assertEquals("TruePositive : Power of integers", 125, calc.power(5, 3), DELTA);
        assertEquals("TruePositive : Power of floats", 3.952847, calc.power(2.5, 1.5), DELTA);
    }

    @Test
    public void powerFalsePositive(){
        assertNotEquals("FalsePositive : Power of integers", 243, calc.power(5, 3), DELTA);
        assertNotEquals("FalsePositive : Power of floats", 1.66, calc.power(2.5, 1.5), DELTA);
    }
}
