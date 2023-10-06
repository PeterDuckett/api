package org.peter.duckett.api.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Data;
import org.springframework.data.jpa.domain.AbstractAuditable;

import java.util.Set;

@Entity
@Data
public class Post extends AbstractAuditable<Person, Long> {

    @OneToMany
    Set<Comment> comment;

}
