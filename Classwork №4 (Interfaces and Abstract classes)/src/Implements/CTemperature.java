package Implements;

import com.company.Converter;

public class CTemperature implements Converter {
    @Override
    public void getTemperature(int temperature) {
        System.out.println("Temperature in C: "+temperature);
    }
}
