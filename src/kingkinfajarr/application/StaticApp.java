package kingkinfajarr.application;

import kingkinfajarr.data.Application;
import static kingkinfajarr.data.Constant.*;
import kingkinfajarr.data.Country;
import kingkinfajarr.util.MathUtil;

public class StaticApp {

    public static void main(String[] args) {
        System.out.println(APPLICATION);
        System.out.println(VERSION);

        System.out.println(
                MathUtil.sum(1,2,3,4,5,6)
        );

        Country.City city = new Country.City();
        city.setName("Karanganyar");

        System.out.println(city.getName());

        System.out.println(Application.PROCESSORS);
    }

}
