package Implements;

import com.company.Converter;

public class FTemperature implements Converter {
    @Override
    public void getTemperature(int temperature) {
        System.out.println("Temperature in F: "+ (temperature+32));
    }
}
