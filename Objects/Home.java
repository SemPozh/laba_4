package Objects;

import Interfaces.Disappearable;

public class Home extends Thing implements Disappearable {
    public Home(String name, String... properties) {
        super(name, properties);
    }

    @Override
    public void disappear() {
        System.out.print(this.getName() + " исчез");
    }
}
