public class BmiService {
    public int calculate(int height, int weight) {
        double heightM = (double) height / 100;
        int bmi = (int) (weight / (heightM * heightM));
        return bmi;
    }
}
