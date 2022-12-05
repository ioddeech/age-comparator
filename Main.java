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

        int max = workClass.maxAgeCalcs(vasyaAge,katyaAge,mishaAge);
        int min = workClass.minAgeCalcs(vasyaAge,katyaAge,mishaAge);
        int middle = workClass.middleAgeCalcs(vasyaAge,katyaAge,mishaAge);
            workClass.print(max, min, middle);
    }
}

