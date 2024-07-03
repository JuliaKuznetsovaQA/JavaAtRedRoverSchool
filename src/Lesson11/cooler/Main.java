package Lesson11.cooler;

public class Main {
    public static void main(String[] args) {

        FujitsuCooler myCooler = new FujitsuCooler(25);
        myCooler.adjustTemp(23);
        myCooler.adjustTemp(24);
        myCooler.adjustTemp(25);
        myCooler.adjustTemp(26);
        myCooler.adjustTemp(25);
        myCooler.adjustTemp(24);

        System.out.println("========================");

        WindowCooler myWindow = new WindowCooler(25);
        myWindow.adjustTemp(23);
        myWindow.adjustTemp(24);
        myWindow.adjustTemp(25);
        myWindow.adjustTemp(26);
        myWindow.adjustTemp(25);
        myWindow.adjustTemp(24);

    }
}
