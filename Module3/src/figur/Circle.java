package figur;

public class Circle extends Figure {

    @Override
    public double getSquare() {
        double square = 3.14 * (Math.pow((this.coordinates[0][0] - this.coordinates[1][0]), 2) +
                Math.pow((this.coordinates[0][1] - this.coordinates[1][1]), 2));
        return square;
    }
}
