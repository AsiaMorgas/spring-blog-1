package pl.javadev.jpa;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tag")
@EqualsAndHashCode(of = "name")
@Getter
@Setter
@Embeddable
public class TagEntity {
    @Id
    String name;
}
