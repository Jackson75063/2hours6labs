package lab6;

public class RectSolid extends Solid{
    double C;
    double D;
    double H;

    public RectSolid(double c, double d, double h) {
        C = c;
        D = d;
        H = h;
    }


    @Override
    public double getVolume() {
        return C*D*H;
    }
}
