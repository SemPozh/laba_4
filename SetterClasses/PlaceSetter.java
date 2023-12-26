package SetterClasses;

import Enums.Place;

public class PlaceSetter {

    private static Place place = Place.here;

    public static void setPlace(Place place){
        switch (place){
            case SideBySide:
                System.out.print(" рядом один к одному");
                place = Place.SideBySide;
                break;
            case onBundles:
                System.out.print(" на свертках");
                place = Place.onBundles;
                break;
            case onEachOfThem:
                System.out.print("На каждом из них");
                place = Place.onEachOfThem;
                break;
            case onLast:
                System.out.print("На последнем ");
                place = Place.onLast;
                break;
            case inBundle:
                System.out.print("В свертке ");
                place = Place.inBundle;
                break;
        }
    }

    public static Place getPlace(){
        return place;
    }
}
