public class BmiService {
    public int calculate(double heightInMetres, int weightinKg) {
        double heightS = heightInMetres * heightInMetres;
        double index = weightinKg / heightS;
        int result = (int) index;
        return result;
    }
}