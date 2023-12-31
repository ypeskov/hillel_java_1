public class Converter {
    public static double mileToKilometer(double mile) {
        return mile * 1.609;
    }

    public static void main(String[] args) {
        double miles = 1000;
        System.out.println(mileToKilometer(miles));

        double miles2 = 1500;
        System.out.println(mileToKilometer(miles2));
    }
}
