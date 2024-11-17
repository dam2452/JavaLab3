package model;

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
    public void testInvalidColor() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Color(-1, 256, 300, -10);
        });
    }

    @Test
    public void testDefaultAlpha() {
        Color color = new Color(255, 100, 50);
        assertEquals(255, color.alpha());
    }
}
