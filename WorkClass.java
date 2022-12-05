public class WorkClass {
    public int min;
    public int max;
    public int middle;

    public double getSrAge(int min, int max, int middle) {
        return (middle+max+min)/3;
    }

    public String getAgeEnd(int value){
        String strValue = Integer.toString(value);
        char chValue = strValue.toCharArray()[strValue.length() - 1];
        String finalValue = Character.toString(chValue);
        int valueEnd = Integer.parseInt(finalValue);
        if ((valueEnd >= 5 || valueEnd == 0) || (value >= 10 && value <= 20)) {
            return " лет";
        } else if (valueEnd == 1) {
            return " год";
        }
            return " года";
    }

    public int maxAgeCalcs(int vasyaAge, int katyaAge, int mishaAge){
        if (vasyaAge >= katyaAge && vasyaAge >= mishaAge) {
            max = vasyaAge;
        } else if (katyaAge >= vasyaAge && katyaAge >= mishaAge) {
            max = katyaAge;
        } else if (mishaAge >= katyaAge && mishaAge >= vasyaAge) {
            max = mishaAge;
        }
        return max;
    }

    public int middleAgeCalcs(int vasyaAge, int katyaAge, int mishaAge){
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
        return middle;
    }

    public int minAgeCalcs(int vasyaAge, int katyaAge, int mishaAge){
        if (vasyaAge <= katyaAge && vasyaAge <= mishaAge) {
            min = vasyaAge;
        } else if (katyaAge <= vasyaAge && katyaAge <= mishaAge) {
            min = katyaAge;
        } else if (mishaAge <= katyaAge && mishaAge <= vasyaAge) {
            min = mishaAge;
        }
        return min;
    }

    public void print(int max, int min, int middle){
        System.out.println("Наименьший возраст: " + min + getAgeEnd(min));
        System.out.println("Средний возраст: " + middle + getAgeEnd(middle));
        System.out.println("Наибольший возраст: " + max + getAgeEnd(max));
        System.out.println("Среднее значение среди всех возрастов: " + getSrAge(min, max, middle));
    }
}

