package figur;

public class Triangle extends Figure {
    @Override
    public double getSquare() {
        double square = 0.5 * Math.abs((this.coordinates[1][0] - this.coordinates[0][0]) * (this.coordinates[2][1] - this.coordinates[0][1])
                - (this.coordinates[2][0] - this.coordinates[0][1]) * (this.coordinates[1][1] - this.coordinates[0][1]));
        return square;
    }
}
