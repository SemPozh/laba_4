package Objects;


import java.util.Objects;

// Класс для неживых объектов, которые не смогут дейстовать
public abstract class Thing{
    private String name;
    public Thing(String name, String ... properties){
        this.name = " ";
        for (String property : properties) {
            this.name += property + " ";
        }
        this.name += name;

    }

    public String getName(){
        return this.name;
    }

    @Override
    public String toString() {
        return this.name;
    }

    @Override
    public boolean equals(Object o) {
        Thing thing = (Thing) o;
        return Objects.equals(name.toLowerCase(), thing.name.toLowerCase());
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public void wrapThing(Thing wrapper) {
        System.out.print(", завернутыми в " + wrapper + ",");
    }

    public void removeAllProperties(){
        String[] words = this.name.split(" ");
        this.name = words[words.length -1];
    }

    public void setName(String name){
        this.name = name;
    }


    public void writeOnThing(String text){
        System.out.print(text);
    }

}
