package Objects;

import Enums.Action;
import Enums.FamilyMember;
import Enums.Gender;

import java.util.Objects;

// Класс со всеми объектами, которые смогут двигаться
public abstract class Entity {

    private String name;
    private Gender sex;
    private String ending;

    public Entity(String name, Gender sex, String ... properties){
        this.sex = sex;
        this.ending = sex.getName();
        this.name = "";
        for (String property : properties) {
            this.name += property + " ";
        }
        this.name += name;
    }

    public String getName(){
        return this.name;
    }

    public String getEnding(){
        return this.ending;
    }

    public void setName(String name){
        this.name = name;
    }

    public abstract void doSomething(Action act);

    public abstract void doSomething(Action act, Object thing);

    public Gender getGender(){
        return this.sex;
    }

    public void setSex(Gender sex){
        this.sex = sex;
        this.ending = this.sex.getName();
    }


    @Override
    public String toString() {
        return "Entity{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        Entity entity = (Entity) o;
        return Objects.equals(ending, entity.ending) && Objects.equals(name.toLowerCase(), entity.name.toLowerCase());
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public void removeAllProperties(){
        String[] words = this.name.split(" ");
        this.name = words[words.length -1];
    }
}