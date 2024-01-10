/*Date: 29 Nov-2022.
Author: Anil kumar
Utilities: printing current time and date in different format and of different
          time zone by using
           different time and date class and methods.*/


import javax.swing.text.html.HTMLDocument;
import java.sql.Date;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class DateandTimes {

    public static  void main(String []args){

        // Date and Times.
        // current date and time
        // Import java.time package.

        // printing current time by using Localtime class.
        LocalDate time = LocalDate.now();
        System.out.println(time);
        // Printing local date by using Localdate class.
        LocalDate date = LocalDate.now();
        System.out.println(date);
        //  printing local date and time by using LocalDateTime class.
        LocalDateTime datetime = LocalDateTime.now();
        System.out.println(datetime);

        // Formatted date and time.
        // Import java datetime formatter.
        // Getting local date and time by using DateTimeFormatter class without formatted.

        LocalDateTime dtm = LocalDateTime.now();
        System.out.println("Before formatted date and Time is: " + dtm);

        // Now we will use DateTime Formatter class to get the date time in different format.
        // Here we are using ofpattern method of the Datetimeformatter.
        DateTimeFormatter format = DateTimeFormatter.ofPattern("YY-MM-DD HH:MM:SS");
        String myformat = dtm.format(format);
        System.out.println("After formatted in YY-MM-DD HH:MM:SS is: " + myformat);

        // Print the value in "Thu, sep 30 1999" pattern.
        // Will be using datetimeformatter class again.

        DateTimeFormatter newpattern = DateTimeFormatter.ofPattern("E,MMM DD YYYY");
        String day= dtm.format(newpattern);
        System.out.println("New pattern: "+day);

        DateandTimes.DifferentZonetime();



        }

        public static void DifferentZonetime(){

            Instant time=Instant.now();
            ZoneId zoneId=ZoneId.of("Asia/Kolkata");
            ZonedDateTime zdt= ZonedDateTime.ofInstant(time,zoneId);
            System.out.println("Without formatted: "+zdt+"\n");
            DateTimeFormatter asia = DateTimeFormatter.ofPattern("E, MMM DD YY");
            String tdm=zdt.format(asia);
            System.out.println("After formatted: "+tdm);


    }
}

