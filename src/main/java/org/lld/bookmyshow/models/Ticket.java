package org.lld.bookmyshow.models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class Ticket extends  BaseEntity{

    int number;
    User user;
    Show show;
    int amount;
    List<ShowSeat> showSeatList;
    List<Payment> payments;
}
