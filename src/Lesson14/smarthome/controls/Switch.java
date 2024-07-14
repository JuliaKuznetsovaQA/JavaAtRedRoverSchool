package Lesson14.smarthome.controls;

import Lesson14.smarthome.devices.Switchable;

public class Switch {

    private final Switchable switchable;

    public Switch(Switchable switchable) {
        this.switchable = switchable;
    }

    public void turnOn() {
        switchable.turnOn();
    }

    public void turnOff() {
        switchable.turnOff();
    }
}
