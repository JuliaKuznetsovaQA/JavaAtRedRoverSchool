package Lesson14.smarthome.controls;

import Lesson14.smarthome.devices.Adjustable;
import Lesson14.smarthome.devices.SwitchableAndAdjustable;

public class DimmerSwitch extends Switch {

    private Adjustable device;

    public DimmerSwitch(SwitchableAndAdjustable device) {
        super(device);
        this.device = device;
    }

    public void adjust(int percent) {
        device.adjust(percent);
    };
}
