package Objects;

public class Tree extends Thing{

    boolean petals;

    public Tree(String name, String... properties) {
        super(name, properties);
    }

    public void setPetals(boolean petals) {
        this.petals = petals;
        if (!petals){
            System.out.println("опали лепестки цветов на деревьях");
        }
    }
}
