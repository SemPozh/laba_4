package Objects;

import Enums.Land;
import Interfaces.Coverable;

public class Moss extends Thing implements Coverable {

    public Moss(String name, String... properties) {
        super(name, properties);
    }

    @Override
    public void cover(Land land) {
        System.out.print("покрывал твёрдую " + land.getName().substring(0, land.getName().length()-1) + "ю");
    }
}
