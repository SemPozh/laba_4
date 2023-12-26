import Enums.*;
import Exceptions.PetalsFallingException;
import Interfaces.Fareable;
import SetterClasses.PlaceSetter;
import SetterClasses.TimeSetter;
import Objects.*;
import SetterClasses.WeatherSetter;

public class Life {
    public static void method(){
        System.out.print("Kill me");
    }
    public static void main(String[] args) throws PetalsFallingException {
//         creating objects
        Bundle wrapper = new Bundle("бумагу", "шелковистую");
        Bundle bundle = new Bundle("сверток", 2);
        MumiTroll mumiTroll = new MumiTroll("Муми-тролль", Gender.Male, FamilyMember.son);
        MumiTroll mother = new MumiTroll("мама", Gender.Female, FamilyMember.mother);
        MumiTroll father = new MumiTroll("папа", Gender.Male, FamilyMember.father);
        Sandwich sandwiches = new Sandwich("бутербродики", "аккуратными", "маленькими");
        Sandwich content = new Sandwich("содержимым", "с самым разным");

        Sandwich cheeseSandwich = new Sandwich("Сыр", mother);
        Sandwich butterSandwich = new Sandwich("Только с маслом", mother);
        Sandwich expSausageSandwich = new Sandwich("Дороая колбаса", mother);
        Sandwich goodMorningSandwich = new Sandwich("С добрым утром!", mother);
        Sandwich[] allSandwiches = {cheeseSandwich, butterSandwich, expSausageSandwich, goodMorningSandwich};
        Fareable crabJar = new Fareable() {
            @Override
            public void fare() {
                System.out.print("оказалась банка крабов");
            }
        };

        Sandwich[] basketFill = {sandwiches};
        Sandwich[] bundleFill = {content};

        Tree trees = new Tree("Деревья");
        Water water = new Water("вода");
        Home home = new Home("Дом");
        MumiTroll snork = new MumiTroll("фрекен Снорк", Gender.Female, FamilyMember.girlfriend);
        Bed pillow = new Bed("перину");
        Bed bed = new Bed("постели");
        Moss moss = new Moss("мох", "зеленый");

        Landscape landscape = new Landscape();
        landscape.setWeather(Weather.FOG);
        landscape.addElementToLandscape(trees);
        landscape.addElementToLandscape(water);
        landscape.showLandscape();
        System.out.print(". ");
        if (!landscape.checkIfElementInLandscape(home)){
            System.out.println("А " + home + "а нет.");
        }
        home.disappear();
        Entity someone = new Entity("", Gender.Neuther) {
            @Override
            public void doSomething(Action act) {
                if (act==Action.leaveOnDestiny){
                    System.out.print("бросили на произвол судьбы");
                }
            }

            @Override
            public void doSomething(Action act, Object thing) {

            }
        };
        System.out.print(", а их с " + mumiTroll.getName().substring(0, mumiTroll.getName().length()-1) + "ем ");
        someone.doSomething(Action.leaveOnDestiny);
        System.out.println(".");
        TimeSetter.setTime(Time.forAMoment);
        snork.doSomething(Action.becameSpeechless);
        System.out.println(".");
        TimeSetter.setTime(Time.next);
        snork.doSomething(Action.bendOver);
        snork.doSomething(Action.startShake, mumiTroll);
        System.out.println(".");
        WeatherSetter.setWeather(Weather.RAIN);
//        TimeSetter.setTime(Time.perNight);
//        trees.setPetals(false);
        try {
            WeatherSetter.setWeather(Weather.COLD);
        } catch (PetalsFallingException e){
            System.out.print(" За ночь опали лепестки цветов на деревьях. ");
        }



        System.out.println(".");
        mumiTroll.doSomething(Action.snuggle);
        System.out.print("они ");
        TimeSetter.setTime(Time.forALongTime);
        mumiTroll.doSomething(Action.sitStill);
        snork.doSomething(Action.cry);
        snork.doSomething(Action.bury, pillow);
        System.out.println(".");
        TimeSetter.setTime(Time.FINALLY);
        mumiTroll.doSomething(Action.standUp, bed);
        System.out.print(" и ");
        Basket basket = new Basket("карзинку с едой");
        mumiTroll.doSomething(Action.takeOff, basket);
        System.out.println(".");
        basket.setName("Она");






        // showing the result
        System.out.print(basket);
        basket.fill(basketFill);
        sandwiches.wrapThing(wrapper);
        bundle.fill(bundleFill);
        System.out.println(". ");
        sandwiches.removeAllProperties();
        mumiTroll.doSomething(Action.fold, sandwiches);

        PlaceSetter.setPlace(Enums.Place.SideBySide);
        mumiTroll.setWantToEat(false);
        System.out.println(". ");

        TimeSetter.setTime(Time.suddenly);
        mumiTroll.setName(mumiTroll.getGender().getPronoun());
        mumiTroll.doSomething(Action.see);
        bundle.writeOnThing(" надписи");
        PlaceSetter.setPlace(Place.onBundles);
        System.out.print(": ");
        mother.doSomething(Action.makeWrites);
        System.out.println(".");

        PlaceSetter.setPlace(Place.onEachOfThem);
        Sandwich.showSandwiches(allSandwiches);
        System.out.println();
        PlaceSetter.setPlace(Place.onLast);
        mother.doSomething(Action.write);
        System.out.print(": ");
        bundle.writeOnThing("Это от папы");
        System.out.println(".");

        PlaceSetter.setPlace(Place.inBundle);
        crabJar.fare();
        System.out.print(", которую ");
        father.doSomething(Action.takeСare);
        TimeSetter.setTime(Time.sinceSpring);
        System.out.println('.');



        mumiTroll.setName("Муми-тролль");

        Tree tree1 = new Tree("дерева");
        Tree tree2 = new Tree("дерево");

        mumiTroll.realizeSomething(new Thing("приключение") {
        }, " не такое уж опасное");
        System.out.println(".");
        TimeSetter.setTime(Time.allDay);
        System.out.print(mumiTroll.getName());
        System.out.print(" и ");
        snork.moveFromXtoY(tree1, tree2);
        System.out.println(".");

        TimeSetter.setTime(Time.evening);

        System.out.print(", когда ");
        snork.setName("они ");
        TimeSetter.setTime(Time.FINALLY);
        snork.setSex(Gender.All);
        snork.doSomething(Action.see);
        System.out.print(",как ");
        water.setUnderwater(moss);
        water.showUnderwater();
        System.out.print("; ");
        moss.setName("он");

        landscape.setFloor(Land.WATER);
        landscape.changeFloor(Land.MOSS);
        System.out.print(" и вот уже ");
        moss.cover(Land.EARTH);


    }
}
