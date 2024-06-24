package Lesson7;

public class Main {
    public static void main(String[] args) {

        Apartment apt1 = new Apartment();
        apt1.bedrooms = 2;
        apt1.address = new Address();
        apt1.address.city = "San Francisco";
        apt1.address.state = "CA";
        apt1.price = 3500;

        Apartment apt2 = new Apartment();
        apt2.bedrooms = 4;
        apt2.address = new Address();
        apt2.address.city = "Atlanta";
        apt2.address.state = "GA";
        apt2.price = 2500;

        Apartment apt3 = new Apartment();
        apt3.bedrooms = 5;
        apt3.address = new Address();
        apt3.address.city = "Fresno";
        apt3.address.state = "CA";
        apt3.price = 600;

        Apartment apt4 = new Apartment();
        apt4.bedrooms = 2;
        apt4.address = new Address();
        apt4.address.city = "San Francisco";
        apt4.address.state = "CA";
        apt4.price = 3800;

        Apartment apt5 = new Apartment();
        apt5.bedrooms = 3;
        apt5.address = new Address();
        apt5.address.city = "Atlanta";
        apt5.address.state = "GA";
        apt5.price = 2000;

        Apartment[] apts = {apt1, apt2, apt3, apt4, apt5};

        System.out.println("all apts in SF: \n");

        for (int i = 0; i < apts.length; i++) {
            Apartment currentAppt = apts[i];
            if (currentAppt.address.city.equals("San Francisco")) {
                System.out.println(apts[i].getInfoCard());
            }
        }

        System.out.println("all apts <= 2500");

        for (int i = 0; i < apts.length; i++) {
            if (apts[i].price <= 2500) {
                System.out.println(apts[i].getInfoCard());            }
        }

        System.out.println("=======================");
        System.out.println("apts in CA");
        for (int i = 0; i < apts.length; i++) {
            if (apts[i].address.state.equals("CA")) {
                System.out.println(apts[i].getInfoCard());
           }
        }
    }
}
