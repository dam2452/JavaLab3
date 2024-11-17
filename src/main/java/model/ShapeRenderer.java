package model;

import java.util.List;

public class ShapeRenderer {

    public void renderShapes(List<Shape> shapes) {
        for (Shape shape : shapes) {
            System.out.println();
            System.out.println("Rendering shape: " + shape.getClass().getSimpleName());
            System.out.println("Color: " + shape.getColorDescription());

            if (shape instanceof Rectangle rectangle) {
                renderRectangle(rectangle);
            } else if (shape instanceof Triangle triangle) {
                renderTriangle(triangle);
            } else {
                System.out.println("Unknown shape. Cannot render.");
            }
        }
    }

    private void renderRectangle(Rectangle rectangle) {
        int width = (int) rectangle.width;
        int height = (int) rectangle.height;
        String colorCode = getColorCode(rectangle.color);

        for (int i = 0; i < height; i++) {
            System.out.print(colorCode);
            for (int j = 0; j < width; j++) {
                System.out.print("*");
            }
            System.out.println("\033[0m");
        }
    }

    private void renderTriangle(Triangle triangle) {
        int height = (int) triangle.sideA;
        String colorCode = getColorCode(triangle.color);

        for (int i = 1; i <= height; i++) {
            System.out.print(colorCode);
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("\033[0m");
        }
    }

    private String getColorCode(Color color) {
        int red = color.red();
        int green = color.green();
        int blue = color.blue();
        return String.format("\033[38;2;%d;%d;%dm", red, green, blue);
    }
}
