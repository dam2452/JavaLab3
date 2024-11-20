import model.Color;
import model.Triangle;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TriangleTest {

    @Test
    public void testArea() {
        Triangle triangle = new Triangle(3, 4, 5, new Color(0, 255, 0));
        assertEquals(6, triangle.getArea());
    }

    @Test
    public void testPerimeter() {
        Triangle triangle = new Triangle(3, 4, 5, new Color(0, 255, 0));
        assertEquals(12, triangle.getPerimeter());
    }

    @Test
    public void testColor() {
        Color color = new Color(0, 255, 0);
        Triangle triangle = new Triangle(3, 4, 5, color);
        assertEquals(color, triangle.getColor());
    }
}
