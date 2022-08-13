package pl.javadev.jpa;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.Set;


@Entity(name = "Article")
@Getter
@Setter
@EqualsAndHashCode(of = "id")
public class ArticleEntity {
    @Id
    String id;
    String url;
    String category;
    Date date;
    //    @Column(name = "tags")
    @ElementCollection
    @CollectionTable(name = "tag")
    @Column(name = "tags")
    List<TagEntity> tags;
    Boolean draft;
}
