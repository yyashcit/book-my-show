package org.lld.bookmyshow.models;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Show extends  BaseEntity{

    Movie movie;
    double startTime;
    double endTime;
    Screen screen;
}
