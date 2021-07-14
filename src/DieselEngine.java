public class DieselEngine extends Engine{
    public DieselEngine(int power) {
        super(power);
    }
    public DieselEngine(){};

    public void start(){
        System.out.println("Запуск дизельного двигателя мощностью " + getPower());
    }


}
