package org.lld.bookmyshow.models;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class User extends  BaseEntity{

    String name;
    String email;
    String pwd;

}
