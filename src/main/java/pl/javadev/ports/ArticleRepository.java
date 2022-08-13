package pl.javadev.ports;

import pl.javadev.domain.Article;

import java.util.List;
import java.util.Optional;

public interface ArticleRepository {
    Article save(Article article);
    Optional<Article> getByUrl(String url);
    Optional<Article> getById(String id);
    List<Article> getByTag(String tag);
    List<Article> getByCategory(String category);
    void setDraft(boolean draft);
}
