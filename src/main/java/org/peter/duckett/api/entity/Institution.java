package org.peter.duckett.api.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Data;
import org.springframework.data.jpa.domain.AbstractAuditable;

@Entity
@Data
public class Institution extends AbstractAuditable<Person, Long> {

    String name;

    String icon;

    @OneToOne(cascade = CascadeType.ALL)
    Address address;

}
