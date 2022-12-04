import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        WorkClass workClass = new WorkClass();

        System.out.println("Введите возраст Васи:");
        int vasyaAge = new Scanner(System.in).nextInt();
        System.out.println("Введите возраст Кати:");
        int katyaAge = new Scanner(System.in).nextInt();
        System.out.println("Введите возраст Миши:");
        int mishaAge = new Scanner(System.in).nextInt();

        int min = -1;
        int middle = -1;
        int max = -1;

        if ((vasyaAge > 120 || vasyaAge < 0) ||
                (katyaAge > 120 || katyaAge < 0) ||
                (mishaAge > 120 || mishaAge < 0)) {
            System.out.println("Неправильное значение. Повторите попытку.");
        } else {
            //maxAge
            if (vasyaAge >= katyaAge && vasyaAge >= mishaAge) {
                max = vasyaAge;
            } else if (katyaAge >= vasyaAge && katyaAge >= mishaAge) {
                max = katyaAge;
            } else if (mishaAge >= katyaAge && mishaAge >= vasyaAge) {
                max = mishaAge;
            }

            //middleAge
            if ((vasyaAge >= katyaAge || vasyaAge >= mishaAge) &&
                    (vasyaAge <= katyaAge || vasyaAge <= mishaAge)) {
                middle = vasyaAge;
            } else if ((mishaAge >= katyaAge || mishaAge >= vasyaAge) &&
                    (mishaAge <= katyaAge || mishaAge <= vasyaAge)) {
                middle = mishaAge;
            } else if ((katyaAge >= mishaAge || katyaAge >= vasyaAge) &&
                    (katyaAge <= mishaAge || katyaAge <= vasyaAge)) {
                middle = katyaAge;
            }

            //minAge
            if (vasyaAge <= katyaAge && vasyaAge <= mishaAge) {
                min = vasyaAge;
            } else if (katyaAge <= vasyaAge && katyaAge <= mishaAge) {
                min = katyaAge;
            } else if (mishaAge <= katyaAge && mishaAge <= vasyaAge) {
                min = mishaAge;
            }

            //printing
            System.out.println("Наименьший возраст: " + min + workClass.getAgeEnd(min));
            System.out.println("Средний возраст: " + middle + workClass.getAgeEnd(middle));
            System.out.println("Наибольший возраст: " + max + workClass.getAgeEnd(max));

            System.out.println("Среднее значение среди всех: " + workClass.getSrAge(min, max, middle));
        }
    }
}
