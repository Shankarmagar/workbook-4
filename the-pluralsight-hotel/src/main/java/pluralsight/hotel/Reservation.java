package pluralsight.hotel;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.List;

public class Reservation {
    public Reservation() {
    }

    public Reservation(LocalDate start, LocalDate end, Guest guest, RoomType roomType) {
        this.start = start;
        this.end = end;
        this.requestedType = roomType;
        this.guest = guest;
    }

    LocalDate start;
    LocalDate end;
    Guest guest;
    RoomType requestedType;




    // The following fields are assigned when the guest checks in
    Room room = null;
    Folio folio = null;
    List<RoomKey> keys = null;

    public RoomType getRoomType()
    {
        return requestedType;
    }

    public void setRoomType(RoomType roomType)
    {
        this.requestedType = roomType;
    }

    public double getPrice(RoomType roomType)
    {
        double rateForPrice = 0.00;
        if(roomType == RoomType.King)
        {
            rateForPrice = 139.00;

        }
        if(roomType == RoomType.Double)
        {
            rateForPrice = 124.00;
        }

        return rateForPrice;

    }

    public int getNumberOfNights() {
        //Compare the start and End
            return (int) ChronoUnit.DAYS.between(start, end);
            //https://docs.oracle.com/javase/8/docs/api/java/time/temporal/ChronoUnit.html
    }

    public void setNumberOfNights(int numberOfNights) {
        start = LocalDate.now();
        end = start.plusDays(numberOfNights);
        //https://docs.oracle.com/javase/8/docs/api/java/time/LocalDate.html
    }

    public boolean isWeekend() {


        int numberOfWeekends = 0;
        LocalDate currentDate = start;

        //https://docs.oracle.com/javase/8/docs/api/java/time/LocalDate.html
        while (!currentDate.isAfter(end)) {
            if (currentDate.getDayOfWeek().toString().equals("Saturday") || currentDate.getDayOfWeek().toString().equals("Sunday")) {
                numberOfWeekends++;
            }
            currentDate = currentDate.plusDays(1);
        }
        if(numberOfWeekends>0)
        {
            return true;
        }
        return false;

    }

    public void setWeekend(boolean weekend) {
    }

    public int getGetReservationTotal() {
        return 0;
    }
}
