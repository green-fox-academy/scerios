public class Bmi {

    public static void main(String[] args) {

        double massInKg, heightInM, pow, percentage;
        massInKg = 81.2;
        heightInM = 1.78;
        pow = Math.pow(heightInM, heightInM);
        percentage = massInKg / pow;

        float percent = (float) Math.round(percentage * 100) / 100;

        System.out.println(percent);
    }
}
