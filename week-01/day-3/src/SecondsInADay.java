public class SecondsInADay {

    public static void main(String[] args) {

        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;

        int allSeconds = 60 * 60 * 24;
        int pastSeconds = ((14 * 60) + 34) * 60 + 42;
        int remainingSeconds = allSeconds - pastSeconds;

        System.out.println("The remainin time of the day in seconds are: " + remainingSeconds);
    }
}
