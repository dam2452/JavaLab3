import model.Color;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ColorTest {

    @Test
    public void testValidColor() {
        Color color = new Color(255, 100, 50, 128);
        assertEquals(255, color.red());
        assertEquals(100, color.green());
        assertEquals(50, color.blue());
        assertEquals(128, color.alpha());
    }

    @Test
    public void testDefaultAlpha() {
        Color color = new Color(255, 100, 50);
        assertEquals(255, color.alpha());
    }

    @Test
    public void testMinValues() {
        Color color = new Color(0, 0, 0, 0);
        assertEquals(0, color.red());
        assertEquals(0, color.green());
        assertEquals(0, color.blue());
        assertEquals(0, color.alpha());
    }

    @Test
    public void testMaxValues() {
        Color color = new Color(255, 255, 255, 255);
        assertEquals(255, color.red());
        assertEquals(255, color.green());
        assertEquals(255, color.blue());
        assertEquals(255, color.alpha());
    }

    @Test
    public void testInvalidRed() {
        assertThrows(IllegalArgumentException.class, () -> new Color(-1, 100, 50, 128));
        assertThrows(IllegalArgumentException.class, () -> new Color(256, 100, 50, 128));
    }

    @Test
    public void testInvalidGreen() {
        assertThrows(IllegalArgumentException.class, () -> new Color(100, -1, 50, 128));
        assertThrows(IllegalArgumentException.class, () -> new Color(100, 256, 50, 128));
    }

    @Test
    public void testInvalidBlue() {
        assertThrows(IllegalArgumentException.class, () -> new Color(100, 50, -1, 128));
        assertThrows(IllegalArgumentException.class, () -> new Color(100, 50, 256, 128));
    }

    @Test
    public void testInvalidAlpha() {
        assertThrows(IllegalArgumentException.class, () -> new Color(100, 50, 50, -1));
        assertThrows(IllegalArgumentException.class, () -> new Color(100, 50, 50, 256));
    }
}
