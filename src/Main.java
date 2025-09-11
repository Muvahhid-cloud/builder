public class Main {
    public static void main(String[] args) {
        Car sportsCar = new Car.Builder()
                .setModel("Sports Car")
                .setEngine("V8")
                .setSeats(2)
                .build();

        Car familyCar = new Car.Builder()
                .setModel("Family Car")
                .setEngine("Hybrid")
                .setSeats(5)
                .build();

        System.out.println(sportsCar);
        System.out.println(familyCar);
    }
}
