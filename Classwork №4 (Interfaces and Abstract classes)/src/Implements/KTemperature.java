package Implements;

import com.company.Converter;

public class KTemperature implements Converter {
    @Override
    public void getTemperature(int temperature) {
        System.out.println("Temperature in K: "+ (temperature+273));
    }
}
