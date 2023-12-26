package Objects;

import Enums.FamilyMember;

public class Sandwich extends Thing{

    private MumiTroll cookedBy;

    public Sandwich(String name, MumiTroll cookedBy){
        super(name);
        this.cookedBy = cookedBy;
    }

    public Sandwich(String name, String ... properties){
        super(name, properties);
    }

    public MumiTroll getCookedBy(){
        return this.cookedBy;
    }

    public static void showSandwiches(Sandwich[] sandwiches){
        for (int i=0; i<sandwiches.length;i++){
            String ending = i==sandwiches.length-1? ".":",";
            System.out.print(" либо " + '"' + sandwiches[i] + '"' + ending);
        }
    }

}
