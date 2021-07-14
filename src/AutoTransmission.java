public class AutoTransmission extends Transmission{
    public AutoTransmission(char broadcast) {
        super(broadcast);
    }
    public AutoTransmission(){};

    public void activate(){
        setBroadcast('D');
        System.out.println("Передача: " + getBroadcast());
    }

}
