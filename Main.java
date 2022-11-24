import javax.sound.midi.Soundbank;

public class Main {
    public static void main(String[] args) {

        int vasyaAge = 29;
        int katyaAge = 13;
        int mishaAge = 29;

        int min = -1;
        int middle = -1;
        int max = -1;

        if ((vasyaAge > 120 || vasyaAge < 0) ||
                (katyaAge > 120 || katyaAge < 0) ||
                (mishaAge > 120 || mishaAge < 0)) {
            System.out.println("Некорректное значение. Повторите попытку.");
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
            System.out.println("Minimal age: " + min);
            System.out.println("Middle age: " + middle);
            System.out.println("Maximal age: " + max);
        }
    }
}
