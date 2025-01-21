package pzn.application;

import pzn.data.Constant;
import pzn.data.Country;
import pzn.util.MathUtil;

public class StaticApp {
    public static void main(String[] Args) {
        System.out.println(Constant.APPLICATION);
        System.out.println(Constant.VERSION);

        System.out.println(
            MathUtil.sum(1,1,1,1,1)
        );

        Country.City city = new Country.City();
        city.setName("Subang");

        System.out.println(city.getName());

        System.out.println(pzn.data.Application.PROCESSORS);
    }
}
