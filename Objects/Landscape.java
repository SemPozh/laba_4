package Objects;

import Enums.Land;
import Enums.Weather;
import Exceptions.PetalsFallingException;
import SetterClasses.WeatherSetter;

import java.util.ArrayList;

public class Landscape {
    private ArrayList<Thing> elements = new ArrayList<>();
    private Weather weather;
    private Land floor;

    public Landscape(){
        this.weather = Weather.CLEAR;
        this.floor = Land.EARTH;
    }

    public void setFloor(Land floor){
        this.floor = floor;
    }

    public void changeFloor(Land floor){
        System.out.print(floor.getName() + " постепенно поднимался к поверхности " + this.floor.getName().substring(0, this.floor.getName().length()-1)+"ы");
        this.floor = floor;
    }


    public void addElementToLandscape(Thing element){
        this.elements.add(element);
    }

    public void showLandscape() throws PetalsFallingException {
        String result = "";
        for (Thing el : this.elements){
            result += el.getName() + ", ";
        }
        System.out.print(result);
        WeatherSetter.setWeather(weather);
//        result = result.substring(0, result.length()-2);
    }

    public void setWeather(Weather weather){
        this.weather = weather;
    }

    public boolean checkIfElementInLandscape(Thing element){
        return this.elements.contains(element);
    };
}