package org.lld.bookmyshow.models;

import lombok.Getter;
import lombok.Setter;
import org.lld.bookmyshow.models.enums.SeatType;
@Setter
@Getter
public class Seat {

    int id;
    String seatName;
    int seatNumber;
    SeatType seatType;
}
