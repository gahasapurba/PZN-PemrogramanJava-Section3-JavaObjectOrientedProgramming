package programmer.zaman.now.application;

import static programmer.zaman.now.data.Application.PROCESSSORS;
import static programmer.zaman.now.data.Constant.*;
import programmer.zaman.now.data.Country;
import programmer.zaman.now.util.MathUtil;

public class StaticApp {

    public static void main(String[] args) {

        System.out.println(APPLICATIONS);
        System.out.println(VERSION);

        System.out.println(
                MathUtil.sum(1,1,1,1,1)
        );

        Country.City city = new Country.City();
        city.setName("Subang");

        System.out.println(city.getName());

        System.out.println(PROCESSSORS);

    }

}