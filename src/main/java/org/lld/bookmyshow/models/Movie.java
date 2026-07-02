package org.lld.bookmyshow.models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.lld.bookmyshow.models.enums.MovieType;

import java.util.List;

@Data
@Setter
@Getter
@ToString
public class Movie extends BaseEntity {

    int id;
    String name;
    List<String> cast;
    MovieType movieType;
    double duration;

}
