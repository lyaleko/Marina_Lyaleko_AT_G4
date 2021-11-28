package calculator;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import tasks.homework.calculatortask.EvenOddChecker;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class EvenOddCheckerTest {

    int num;
    boolean expected;

    public EvenOddCheckerTest(int num, boolean expected) {
        this.num = num;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static List<Object[]> inputData() {
        return Arrays.asList(new Object[][]{
                {9, false},
                {4, true},
                {0, true},
                {3, false},
                {-1, false},
        });
    }

    @Test
    public void checkEvenTest() {
        assertEquals("should be "+ (expected ? "even" : "odd"), expected, EvenOddChecker.check(num));
    }
}