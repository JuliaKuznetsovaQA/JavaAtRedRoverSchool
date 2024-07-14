package Lesson14.smarthome.devices;

public class DimmableBulb extends LightBulb implements SwitchableAndAdjustable {
    public void adjustBrightness(int percent) {
        System.out.println("Light brightness is set at " + percent);
    }

    @Override
    public void adjust(int percent) {
        adjustBrightness(percent);
    }
}
