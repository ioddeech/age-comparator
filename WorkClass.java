public class WorkClass {
    public double srAge = 0;
    String let = " лет.";
    String god = " год.";
    String goda = " года.";

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
}
