package Lesson14;

import Lesson14.smarthome.controls.DimmerSwitch;
import Lesson14.smarthome.controls.Switch;
import Lesson14.smarthome.devices.*;


public class Main {
    public static void main(String[] args) {

        Stereo stereo = new Stereo();

        DimmerSwitch dimmerSwitch = new DimmerSwitch(stereo);
        dimmerSwitch.turnOn();
        dimmerSwitch.adjust(30);
        dimmerSwitch.turnOff();

        DimmableBulb bulb = new DimmableBulb();
        DimmerSwitch dimmerSwitch2 = new DimmerSwitch(bulb);
        dimmerSwitch2.turnOn();
        dimmerSwitch2.adjust(30);
        dimmerSwitch2.turnOff();

        Switch simpleSwitch = new Switch(stereo);
        simpleSwitch.turnOn();
        simpleSwitch.turnOff();
    }


}
