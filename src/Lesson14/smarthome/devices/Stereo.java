package Lesson14.smarthome.devices;

public class Stereo implements SwitchableAndAdjustable {
    @Override
    public void adjust(int percent) {
        System.out.println("Volume at " + percent);
    }

    @Override
    public void turnOn() {
        System.out.println("Stereo on");
    }

    @Override
    public void turnOff() {
        System.out.println("Stereo off");
    }
}
