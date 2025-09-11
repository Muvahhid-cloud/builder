// Product
public class Car {
    private final String model;
    private final String engine;
    private final int seats;

    // Private constructor → only Builder can create Car
    private Car(Builder builder) {
        this.model = builder.model;
        this.engine = builder.engine;
        this.seats = builder.seats;
    }

    @Override
    public String toString() {
        return "Car [" +
                "Model='" + model + '\'' +
                ", Engine='" + engine + '\'' +
                ", Seats=" + seats +
                ']';
    }

    // Builder Class
    public static class Builder {
        private String model;
        private String engine;
        private int seats;

        public Builder setModel(String model) {
            this.model = model;
            return this;
        }

        public Builder setEngine(String engine) {
            this.engine = engine;
            return this;
        }

        public Builder setSeats(int seats) {
            this.seats = seats;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }
}
