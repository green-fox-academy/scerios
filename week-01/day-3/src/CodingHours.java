import java.text.DecimalFormat;

public class CodingHours {

    public static void main(String[] args) {

        int codingHours = 6;
        int semesterWeeks = 17;
        int workDays = 5;
        int maxHours = semesterWeeks * workDays * codingHours;
        int averageWorkHours = 52;
        int weekHours = 168;
        double totalHours = semesterWeeks * weekHours;
        double totalWorkHours = averageWorkHours * semesterWeeks;
        double percentage = totalWorkHours / totalHours * 100;
        float percent = (float) Math.round(percentage * 100) / 100;

        System.out.println("An attendee spends " + maxHours + " hours with coding during the semester.");
        System.out.println("An attendee spends " + percent + "% of his/her time with coding during the semester.");

    }
}
