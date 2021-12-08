package figur;

public class Rectangle extends Figure {
    @Override
    public double getSquare() {
        double square = Math.abs(this.coordinates[0][0] - this.coordinates[1][0]) * Math.abs(this.coordinates[0][1] - this.coordinates[1][1]);
        return square;
    }
}