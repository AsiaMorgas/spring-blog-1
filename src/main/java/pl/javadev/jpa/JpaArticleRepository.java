package pl.javadev.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface JpaArticleRepository extends JpaRepository<ArticleEntity,String> {

        List<ArticleEntity> getArticleEntitiesByCategoryOrderByDate(String category);

  /* var query = entityManager.createQuery("select t from Training t join t.tags ta where ta.name in :tags group by t having count (t) = :count order by t.code", Training.class)
       .setParameter("tags", tags)
    .setParameter("count", tags.size());*/

        @Query("select a from Article a join a.tags ta where ta.name = :value order by a.date")
        List<ArticleEntity> getArticleEntitiesByTag(@Param("value") String value);

        ArticleEntity getArticleEntityByUrl(String url);

}


