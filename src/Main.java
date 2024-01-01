public class Main {
    public static void main(String[] args) {
        System.out.format("%.3f", convertingMilesToKilometer(3));

    }
    static double convertingMilesToKilometer (double miles){
        double km = miles/0.62137;
        return km;
    }
}
