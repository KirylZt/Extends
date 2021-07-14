public class Car {
    private String marka;
    private int price;
    private Engine engine;
    private Transmission transmission;


    public Car(String marka, int price, Engine engine, Transmission transmission) {
        this.marka = marka;
        this.price = price;
        this.engine = engine;
        this.transmission = transmission;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public Car(){};

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void start(){
        System.out.println("Проверка систем");
        engine.start();
        transmission.activate();
        System.out.println(marka + " завёлся.");
    }
}
