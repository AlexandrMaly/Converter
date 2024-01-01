public class Main {
    public static void main(String[] args) {
        convertingMilesToKilometer(3);
        convertingKilometersToMiles(3);
    }

    static void convertingMilesToKilometer(double miles) {
        double km = miles / 0.62137;
        System.out.format("%.3f", km);
        System.out.println();
    }

    static void convertingKilometersToMiles (double kilometer){
        double mi = kilometer*0.62137;
        System.out.format("%.3f", mi);
        System.out.println();
    }
}
