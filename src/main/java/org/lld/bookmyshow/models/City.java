package org.lld.bookmyshow.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter

public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String cityName;
    String state;
    int pincode;
    @OneToMany(mappedBy = "city", cascade = CascadeType.ALL, orphanRemoval = true)
    List<Theater> theaters;
}
