package org.peter.duckett.api.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Person {
    @Id
    Long id;
    String firstName;
    String lastName;
}
