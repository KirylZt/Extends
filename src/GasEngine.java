public class GasEngine extends Engine{
    public GasEngine(int power) {
        super(power);
    }
    public GasEngine(){};

    public void start(){
        System.out.println("Запуск бензинового двигателя мощностью " + getPower());
    }
}
