package Enums;

public enum Land {
    EARTH("земля"), MOSS("мох"), WATER("вода");
    private String name;

    Land(String name){
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
