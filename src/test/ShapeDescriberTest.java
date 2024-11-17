package model;

import org.junit.jupiter.api.Test;

public class ShapeDescriberTest {

    @Test
    public void testDescribe() {
        ShapeDescriber describer = new ShapeDescriber();
        Rectangle rectangle = new Rectangle(5, 10, new Color(255, 0, 0));
        describer.describe(rectangle);
        // Sprawdzenie logów można wykonać za pomocą dodatkowych bibliotek, np. LogCaptor
    }
}
