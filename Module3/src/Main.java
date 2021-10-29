import figur.Figure;
import figur.FigureFactory;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String args[]) {
        Figure[] figures = new Figure[10];
        FigureFactory factory = new FigureFactory();

        for (int i = 0; i <= figures.length - 1; i++) {
            figures[i] = factory.getRandomFigure();
        }

        Arrays.sort(figures, new Comparator<Figure>() {
            public int compare(Figure f1, Figure f2) {
                if (f1.getSquare() > f2.getSquare())
                    return 1;
                else if (f1.getSquare() < f2.getSquare())
                    return -1;
                else
                    return 0;
            }
        });

        for (int i = 0; i <= figures.length - 1; i++) {
            System.out.print("Name: " + figures[i].getName() + "; ");
            System.out.println("Square: " + figures[i].getSquare());
        }
    }
}
