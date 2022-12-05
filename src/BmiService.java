public class BmiService {
    public double calculate (double m, double h) {
        double bodyMax;
        bodyMax= m / (h * h);

        return bodyMax;
    }
}
