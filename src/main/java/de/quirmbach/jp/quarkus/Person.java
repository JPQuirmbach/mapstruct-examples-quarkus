package de.quirmbach.jp.quarkus;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Person {
    private String firstname;
    private String lastname;
}
