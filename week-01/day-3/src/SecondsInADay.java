public class SecondsInADay {
    public static void main(String[] args) {
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;

        // Write a program that prints the remaining seconds (as an integer) from a
        // day if the current time is represented by the variables

        int remainingHoursInSeconds   = ((23 - currentHours) * 3600);
        int remainingMinutesInSeconds = ((59 - currentMinutes) * 60);
        int remainingSeconds = (60 - currentSeconds);

        System.out.println(("Remaining seconds of day is: ") + (remainingHoursInSeconds + remainingMinutesInSeconds + remainingSeconds));


    }
}
