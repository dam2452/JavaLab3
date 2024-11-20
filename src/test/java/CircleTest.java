
import model.Circle;
import model.Color;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void testValidCircle() {
        Color color = new Color(0, 0, 255);
        Circle circle = new Circle(5, color);

        assertEquals(5, circle.getRadius());
        assertEquals(color, circle.getColor());
        assertEquals(78.53981633974483, circle.getArea(), 0.0001);
        assertEquals(31.41592653589793, circle.getPerimeter(), 0.0001);
    }

    @Test
    void testInvalidRadius() {
        Color color = new Color(255, 255, 255);
        assertThrows(IllegalArgumentException.class, () -> new Circle(0, color));
    }
}
