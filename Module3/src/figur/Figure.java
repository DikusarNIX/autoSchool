package figur;

public abstract class Figure {
    private String name;
    protected int[][] coordinates;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setCoordinates(int[][] coordinates) {
        this.coordinates = coordinates;
    }

    public int[][] getCoordinates() {
        return coordinates;
    }

    public abstract double getSquare();
}
