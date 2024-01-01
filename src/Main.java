public class Main {
    public static void main(String[] args) {
        convertingMilesToKilometer(3);

    }

    static void convertingMilesToKilometer(double miles) {
        double km = miles / 0.62137;
        System.out.format("%.3f", km);
    }
}
