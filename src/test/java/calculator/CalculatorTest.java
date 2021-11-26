package calculator;

import tasks.homework.calculatortask.Calculator;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.List;

@RunWith(Parameterized.class)
public class CalculatorTest {

    Calculator calc;
    int x, y;

    public CalculatorTest(int x, int y) {
        this.x = x;
        this.y = y;
        this.calc = new Calculator();
    }

    @Parameterized.Parameters
    public static List<Integer[]> inputData() {
        return Arrays.asList(new Integer[][]{
                {9, 3}
        });
    }

    @Test
    public void addNumbersTest(){
        Assert.assertEquals("Addition is incorrect: ",12, this.calc.add(x,y));
    }
    @Test
    public void subtractNumbersTest(){
        Assert.assertEquals("Subtraction is incorrect: ",6, this.calc.subtract(x,y));
    }

    @Test
    public void multiplyNumbersTest(){
        Assert.assertEquals("Multiply is incorrect: ",27, this.calc.multiply(x,y));
    }

    @Test
    public void divideNumbersTest(){
        Assert.assertEquals("Divide is incorrect: ",3, this.calc.divide(x,y));
    }
}