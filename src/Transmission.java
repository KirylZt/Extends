public class Transmission {
    char broadcast;

    public Transmission(char broadcast) {
        this.broadcast = broadcast;
    }

    public Transmission(){};

    public char getBroadcast() {
        return broadcast;
    }

    public void setBroadcast(char broadcast) {
        this.broadcast = broadcast;
    }

    public void activate(){
        System.out.println("XXX");
    }
}
