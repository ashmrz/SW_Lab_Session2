import org.junit.Test;
import static org.junit.Assert.*;

public class Tests {
    @Test
    public void unitTestForRectangle() throws Exception {
        Rectangle rectangle1 = new Rectangle(5, 7);
        assertEquals(rectangle1.computeArea(), 35, 0.000001);

        Rectangle rectangle2 = new Rectangle(2.5, 4);
        assertEquals(rectangle2.computeArea(), 10, 0.000001);
    }

    @Test(expected = Exception.class)
    public void unitTestForRectangleSpecialCase() throws Exception {
        Rectangle rectangle2 = new Rectangle(-10, 1);
    }

    @Test
    public void setterAndGetterTestsForRectangle() throws Exception {
        Rectangle rectangle1 = new Rectangle(5, 7);
        rectangle1.setHeight(8);
        assertEquals(rectangle1.computeArea(), 40, 0.000001);
        rectangle1.setWidth(0.5);
        assertEquals(rectangle1.computeArea(), 4, 0.000001);

        assertEquals(rectangle1.getWidth(), 0.5, 0.000001);
        assertEquals(rectangle1.getHeight(), 8, 0.000001);
    }

    @Test(expected = Exception.class)
    public void setterAndGetterTestsForRectangleSetHeightNegative() throws Exception {
        Rectangle rectangle1 = new Rectangle(5, 7);
        rectangle1.setHeight(-1);
    }

    @Test(expected = Exception.class)
    public void setterAndGetterTestsForRectangleSetWidthNegative() throws Exception {
        Rectangle rectangle1 = new Rectangle(5, 7);
        rectangle1.setWidth(-3);
    }

    @Test
    public void unitTestForSquare() throws Exception {
        Square square1 = new Square(5);
        assertEquals(square1.computeArea(), 25, 0.000001);

        square1.setWidth(3.1);
        assertEquals(square1.computeArea(), 9.61, 0.000001);

        assertEquals(square1.getWidth(), 3.1, 0.000001);
    }

    @Test(expected = Exception.class)
    public void unitTestForSquareSpecialCase() throws Exception {
        Square square1 = new Square(5);
        square1.setWidth(-1.2);
    }
}
