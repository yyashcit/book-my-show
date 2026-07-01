package org.lld.bookmyshow.models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class Screen {

    int id;
    String name;
    List<Seat> seats;
    int capacity;


}
