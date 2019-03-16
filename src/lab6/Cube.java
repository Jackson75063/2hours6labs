package lab6;

public class Cube extends Solid {

    double A;

    public Cube(double a) {
        A = a;
    }

    @Override
    public double getVolume() {
        return Math.pow(A,3);
    }
}
