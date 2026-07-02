package org.lld.bookmyshow.models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;
import org.lld.bookmyshow.models.enums.ScreenStatus;

import java.util.List;

@Setter
@Getter
@Entity
public class Screen extends  BaseEntity{

    String name;

    @OneToMany
    List<Seat> seats;
    ScreenStatus status;
    //List<Feature>


}
