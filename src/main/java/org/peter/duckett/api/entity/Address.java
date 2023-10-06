package org.peter.duckett.api.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import org.springframework.data.jpa.domain.AbstractAuditable;

@Entity
@Data
public class Address extends AbstractAuditable<Person, Long> {
    String street;
    String city;
    String county;
    String postCode;
}
