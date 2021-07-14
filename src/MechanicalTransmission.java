public class MechanicalTransmission extends Transmission{
    public MechanicalTransmission(){};

    public void activate(){
        setBroadcast('1');
        System.out.println("Передача: " + getBroadcast());
    }

}
