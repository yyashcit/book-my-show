package org.lld.bookmyshow.models;

import lombok.Getter;
import lombok.Setter;
import org.lld.bookmyshow.models.enums.SeatType;
@Setter
@Getter
public class ShowSeatType extends BaseEntity{

    Show show;
    SeatType seatType;
    int price;
}
