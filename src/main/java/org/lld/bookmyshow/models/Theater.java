package org.lld.bookmyshow.models;


import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Setter
@Getter
public class Theater {


    int id;
    String name;
    List<Screen> screenList;
    int cityId;
    @ManyToOne
    @JoinColumn(name = "city_id")
    private City city;

}
