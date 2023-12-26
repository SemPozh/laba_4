package SetterClasses;

import Enums.Weather;
import Exceptions.PetalsFallingException;

public class WeatherSetter {

    private static Weather weather;

    public static void setWeather(Weather weather) throws PetalsFallingException {
        switch (weather){
            case FOG:
                System.out.print("туман");
                WeatherSetter.weather = Weather.FOG;
                break;
            case RAIN:
                System.out.print("Кругом капало. Кап-кап-кап - печально падали капли, разбиваясь о темную воду.");
                WeatherSetter.weather = Weather.RAIN;
                break;
            case COLD:
                System.out.print("Было холодно");
                WeatherSetter.weather = Weather.COLD;
                throw new PetalsFallingException("Слишком холодно для лепестков");
        }
    }

    public static Weather getWeather(){
        return weather;
    }

}
