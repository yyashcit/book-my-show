package org.lld.bookmyshow.models;

import lombok.Getter;
import lombok.Setter;
import org.lld.bookmyshow.models.enums.SeatStatus;

@Setter
@Getter
public class ShowSeat extends  BaseEntity{
Show show;
Seat seat;
SeatStatus status;

}
