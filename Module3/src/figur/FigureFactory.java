package figur;

import java.util.Random;

public class FigureFactory {

    public Figure getRandomFigure() {
        Random rnd = new Random();
        int figure = rnd.nextInt(3);
        switch (figure) {
            case (0):
                return getTriangle();
            case (1):
                return getCircle();
            case (2):
                return getRectangle();
            default:
                return getTriangle();
        }
    }

    private Figure getTriangle() {
        String name = "Triangle";
        int[][] coordinates = new int[3][2];
        randomizeCoordinates(coordinates);
        Triangle triangle = new Triangle();
        triangle.setName(name);
        triangle.setCoordinates(coordinates);
        return triangle;
    }

    private Figure getCircle() {
        String name = "Circle";
        int[][] coordinates = new int[2][2];
        randomizeCoordinates(coordinates);
        Circle circle = new Circle();
        circle.setName(name);
        circle.setCoordinates(coordinates);
        return circle;
    }

    private Figure getRectangle() {
        String name = "Rectangle";
        int[][] coordinates = new int[2][2];
        randomizeCoordinates(coordinates);
        Rectangle rectangle = new Rectangle();
        rectangle.setName(name);
        rectangle.setCoordinates(coordinates);
        return rectangle;
    }

    private void randomizeCoordinates(int[][] coordinates) {
        Random rnd = new Random();
        for (int i = 0; i < coordinates.length; i++) {
            for (int j = 0; j < coordinates[i].length; j++) {
                coordinates[i][j] = rnd.nextInt(50 + 1);
            }
        }
    }
}
