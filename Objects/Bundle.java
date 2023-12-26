package Objects;

import Interfaces.Fillable;

public class Bundle extends Thing implements Fillable {

    private int countThings;
    public Bundle(String name) {
        super(name);
    }

    public Bundle(String name, int countThings) {
        super(name);
        this.countThings = countThings;
    }

    public Bundle(String name,  String ... properties){
        super(name, properties);
    }
    @Override
    public void fill(Thing[] things) {
        String bundleName = this.getName();
        int countThings = this.countThings;
        System.out.print(" в каждом "+ bundleName.substring(0, bundleName.length()-2)+"ке" + " по " + countThings+", ");
        for (Thing t : things){
            System.out.print(t);
        }
    }
}
