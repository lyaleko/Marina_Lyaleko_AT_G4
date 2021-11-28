package calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import tasks.homework.calculatortask.Rectangle;
import java.util.Arrays;
import java.util.List;

@RunWith(Parameterized.class)
public class RectangleTest {

    Rectangle figure;
    double length, width;

    public RectangleTest(Rectangle figure, double length, double width) {

        this.length = length;
        this.width = width;
        this.figure = figure;
    }

    @Parameterized.Parameters
    public static List<Object[]> inputData(){
        List<Object[]> objects = Arrays.asList(new Object[][]{
                {new Rectangle(8, 5), 8, 5},
                {new Rectangle(2, 2), 2, 2},
                {new Rectangle(15, 1), 15, 1},
                {new Rectangle(33, 16), 33, 16},

        });
        return objects;
    }

    @Test
    public void figureGetLengthTest(){
        Assert.assertEquals("Rectangle is not correct", length, figure.getLength(), 0.0);
    }

    @Test
    public void figureGetWidthTest(){
        Assert.assertEquals("Rectangle is not correct", width, figure.getWidth(), 0.0);
    }

    @Test
    public void figureSetLengthTest() {
        var value = 25;
        figure.setLength(value);
        Assert.assertEquals("Rectangle is not correct", value, figure.getLength(), 0.0);
    }

    @Test
    public void figureSetWidthTest() {
        var value = 10;
        figure.setWidth(value);
        Assert.assertEquals("Rectangle is not correct", value, figure.getWidth(), 0.0);
    }

}