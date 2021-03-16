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
}
