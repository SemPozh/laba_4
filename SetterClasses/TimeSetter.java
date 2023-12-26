package SetterClasses;

import Enums.Time;

public class TimeSetter {
    public static void setTime(Time time){
        switch (time){
            case suddenly:
                System.out.print("Вдруг ");
                break;
            case sinceSpring:
                System.out.print("с весны");
                break;
            case forAMoment:
                System.out.print("На мгновение ");
                break;
            case next:
                System.out.print("Затем, ");
                break;
            case perNight:
                System.out.print("За ночь ");
                break;
            case forALongTime:
                System.out.print("долго ");
            case FINALLY:
                System.out.print("Наконец ");
                break;
            case straightAway:
                System.out.print("сразу");
                break;
            case allDay:
                System.out.print("Весь день ");
                break;
            case evening:
                System.out.print("Наступил уже вечер ");

        }
    }
}
