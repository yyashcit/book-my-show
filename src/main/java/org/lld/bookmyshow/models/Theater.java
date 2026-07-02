package org.lld.bookmyshow.models;


import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@Entity
public class Theater extends BaseEntity {


    String name;

    @OneToMany(mappedBy = "screen")
    List<Screen> screenList;

    @ManyToOne
    @JoinColumn(name = "city_id")
    private City city;

}
