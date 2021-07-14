public class Main {
    public static void main(String[] args) {
        Car car = new Car("Audi",27500, new DieselEngine(300), new AutoTransmission());
        car.start();
    }
}
