import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class AppointmentScheduler {
    public LocalDateTime schedule(String appointmentDateDescription) {

        DateTimeFormatter parser = DateTimeFormatter.ofPattern("M/dd/yyyy H:mm:ss");
        LocalDateTime datetimeparsed =  LocalDateTime.parse(appointmentDateDescription, parser);
        return datetimeparsed;
    }

    public boolean hasPassed(LocalDateTime appointmentDate) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime appoitment = appointmentDate;
        boolean info = appoitment.isBefore(now);
        return info;
    }

    public boolean isAfternoonAppointment(LocalDateTime appointmentDate) {
        
        if (appointmentDate.getHour() >= 12 && appointmentDate.getHour() < 18){
            return true;
        }
        return false;
    }

    public String getDescription(LocalDateTime appointmentDate) {
        DateTimeFormatter parser = DateTimeFormatter.ofPattern("EEEE, MMMM d, yyyy, 'at' h:mm a"  );

        String formatedDate = appointmentDate.format(parser);

        return "You have an appointment on " + formatedDate + ".";
    }

    public LocalDate getAnniversaryDate() {
        // => LocalDate.of(<current year>, 9, 15)
        LocalDate date = LocalDate.of(2007, 9, 15);
        LocalDate today = LocalDate.now();
        int year = today.getYear();

        LocalDate newdate = date.withYear(year);
        
        return newdate;
    }
}
