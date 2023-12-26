package Enums;

public enum Gender {
    Male(" "), Female("а "), Neuther("о "), All("и ");
    private String name;

    Gender(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String getPronoun(){
        switch (this.name){
            case " ":
                return "Он";
            case "а ":
                return "Она";
            case "о ":
                return "Оно";
            case "и ":
                return "Они";
            default:
                return this.name;
        }
    }

}
