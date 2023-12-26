package Objects;

import Enums.*;
import Exceptions.IncorrectPlaceException;
import SetterClasses.PlaceSetter;
import SetterClasses.TimeSetter;

public class MumiTroll extends Entity {

    private FamilyMember familyMember;

    public MumiTroll(String name, Gender sex){
        super(name, sex);
    }

    public MumiTroll(String name, Gender sex, FamilyMember familyMember){
        super(name, sex);
        this.familyMember = familyMember;
    }

    public void setWantToEat(boolean wantToEat){
        if (wantToEat){
            System.out.print(", но есть ему хотелось");
        } else{
            System.out.print(", но есть ему не хотелось");
        }
    }

    public FamilyMember getFamilyMember(){
        return this.familyMember;
    }


    @Override
    public void doSomething(Action act) {
        switch (act){
            case fold:
                System.out.print(this.getName() + " сложил" + this.getEnding());
                break;
            case see:
                System.out.print(this.getName() + " увидел" + this.getEnding());
                break;
            case makeWrites:
                if ((this.getClass() == MumiTroll.class) & ((MumiTroll) this).getFamilyMember()== FamilyMember.mother){
                    System.out.print("их сделал" + this.getEnding() +  "мама");
                }
                break;
            case write:
                System.out.print(this.getName() + " написал" + this.getEnding());
                break;
            case takeСare:
                System.out.print(this.getName() + " берег" + this.getEnding());
                break;
            case becameSpeechless:
                System.out.print(this.getName() + " утратил" + this.getEnding() + "дар речи");
                break;
            case bendOver:
                System.out.print("наклонившись, ");
            case snuggle:
                System.out.print("Прижавшись друг к другу, ");
                break;
            case sitStill:
                System.out.print("сидели не двигаясь, ");
                break;
            case cry:
                System.out.print(this.getName() + " тихо плакал" + this.getEnding());
                break;
        }

        if (PlaceSetter.getPlace().equals(Place.inBundle)){
            throw new IncorrectPlaceException("Муми-троль не может делать ничего в свертке");
        }
    }


    @Override
    public void doSomething(Action act, Object thing) {
        switch (act){
            case fold:
                System.out.print(this.getName() + " сложил"+ this.getEnding() + thing);
                break;
            case see:
                System.out.print(this.getName() + " увидел"+ this.getEnding() + thing);
                break;
            case write:
                System.out.print(this.getName() + " написал" + this.getEnding() + ": " + '"' + thing + '"');
                break;
            case startShake:
                System.out.print("начал" + this.getEnding() +  "трясти " + ((Entity)thing).getName() + "я");
                break;
            case bury:
                System.out.print(", уткнувшись в " + thing);
                break;
            case standUp:
                System.out.print(this.getName() + " встал" + this.getEnding() + "c " + thing);
                break;
            case takeOff:
                System.out.print("машинально снял c ветки " + thing);
                break;
        }
    }

    public void realizeSomething(Object about, String thoughts){

        class Thought{
            final Object about;
            final String thoughts;

            public Thought(Object about, String thoughts){
                this.about = about;
                this.thoughts = thoughts;
            }

            public void toThink(){
                if (about instanceof Entity){
                    System.out.print(" понял, о нем. что: " + about.toString() + thoughts);
                } else if (about instanceof Thing){
                    System.out.print(" понял, что это " + about.toString() + thoughts);
                } else {
                    System.out.print(" я ничего не понял");
                }
            }
        }

        System.out.print(this.getName() + " ");
        TimeSetter.setTime(Time.straightAway);
//        System.out.print(" понял" + this.getEnding() + ", что это " + about.toString() + thoughts);
        Thought thought = new Thought(about, thoughts);
        thought.toThink();
    }

    public void moveFromXtoY(Thing x, Thing y){
        System.out.print(this.getName() + " перебирались с" + x.getName() + " на " + y.getName());
    }
}