package org.peter.duckett.api.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.OneToOne;
import lombok.Data;
import org.springframework.data.jpa.domain.AbstractAuditable;

@Entity
@Data
public class Comment extends AbstractAuditable<Person, Long> {
    @Lob
    String comment;
}
