package Objects;

import Interfaces.Fillable;

public class Basket extends Thing implements Fillable {

    public Basket(String name){
        super(name);
    }

    @Override
    public void fill(Thing[] things) {
        System.out.print(" была наполнена");
        for (Thing t : things){
            String text = t.toString();
            text = text.substring(0, text.length()-1) + "ами";
            System.out.print(text);
        }
    }
}
