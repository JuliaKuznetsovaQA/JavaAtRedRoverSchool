package Lesson7;

public class Main {
    public static void main(String[] args) {

        Apartment apt1 = new Apartment();
        apt1.bedrooms = 2;
        apt1.city = "San Francisco";
        apt1.price = 3500;

        Apartment apt2 = new Apartment();
        apt2.bedrooms = 4;
        apt2.city = "Atlanta";
        apt2.price = 2500;

        Apartment apt3 = new Apartment();
        apt3.bedrooms = 5;
        apt3.city = "Fresno";
        apt3.price = 600;

        Apartment apt4 = new Apartment();
        apt4.bedrooms = 2;
        apt4.city = "San Francisco";
        apt4.price = 3800;

        Apartment apt5 = new Apartment();
        apt5.bedrooms = 3;
        apt5.city = "Atlanta";
        apt5.price = 2000;

        Apartment[] apts = {apt1, apt2, apt3, apt4, apt5};

        for (int i = 0; i < apts.length; i++) {
            Apartment currentAppt = apts[i];
            if (currentAppt.city.equals("San Francisco")) {
                System.out.println("Bedrooms: " + currentAppt.bedrooms);
                System.out.println("Price: " + currentAppt.price);
                System.out.println("------------------");
            }
        }
    }
}
