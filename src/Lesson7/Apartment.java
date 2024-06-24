package Lesson7;

public class Apartment {

    int bedrooms;
    Address address;
    int price;
    int area;

    String getInfoCard() {
        String result = "\n--------------------" +
        "\nPrice: " + price +
        "\nBedrooms: " + bedrooms +
        "\nCity: " + address.city +
        "\nState: " + address.state +
        "\n------------------";

        return result;
    }

}
