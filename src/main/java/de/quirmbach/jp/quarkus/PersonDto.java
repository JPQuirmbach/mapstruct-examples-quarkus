package de.quirmbach.jp.quarkus;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class PersonDto {

    private String firstname;
    private String surname;
}