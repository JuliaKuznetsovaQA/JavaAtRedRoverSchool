package Lesson11.cooler;

public class FujitsuCooler extends Cooler {


    private boolean isAcOn = false;

    public FujitsuCooler(int targetTemp) {
        super(targetTemp);
    }

    private Fujitsu123 myFujitsu123;

    @Override
    protected void stopCooling() {
        //Send Bluetooth OFF signal
        myFujitsu123.turnOff();
        this.isAcOn = false;
    }

    @Override
    protected void startCooling() {
        //Send Bluetooth ON signal
        myFujitsu123.turnOn();
        this.isAcOn = true;
    }

    @Override
    protected boolean isCurrentlyCooling() {
        return isAcOn;
    }


    static class Fujitsu123 {
        void turnOn() {
            System.out.println("Fujitsu123 ON");
        }

        void turnOff() {
            System.out.println("Fujitsu123 OFF");
        }
    }
}
