public class CodingHours {public static void main(String[] args) {
    // An average Green Fox attendee codes 6 hours daily
    // The semester is 17 weeks long
    //
    // Print how many hours is spent with coding in a semester by an attendee,
    // if the attendee only codes on workdays.
    //
    // Print the percentage of the coding hours in the semester if the average
    // work hours weekly is 52

    int avg = 6;
    int semesterHrs = (17 * 5 * 24);
    int semesterDays = (17 * 5);
    double avgWeekly = 52.;
    double percentage = ((avgWeekly / 168) * 100);

    System.out.println(avg * semesterDays);

    System.out.println(percentage) ;
}
}
