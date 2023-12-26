package Objects;

public class Water extends Thing{
    public Water(String name, String... properties) {
        super(name, properties);
    }

    private Object underwater;

    public void showUnderwater(){
        System.out.print("под водой просвечивает " + underwater);
    }

    public void setUnderwater(Object underwater){
        this.underwater = underwater;
    }

}
