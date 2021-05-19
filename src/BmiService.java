public class BmiService {
    public double calculate(double wight, double height) {
        double bodyMassIndex = wight / (height * height);
        return bodyMassIndex;
    }
}
