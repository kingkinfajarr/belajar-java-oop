package kingkinfajarr.application;

import kingkinfajarr.data.City;
import kingkinfajarr.data.Location;

public class LocationApp {
    public static void main(String[] args) {
        // var location = new Location(); //ERROR
        var city = new City();
        city.name = "Karanganyar";

        System.out.println(city.name);
    }
}
