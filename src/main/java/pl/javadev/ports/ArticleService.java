package pl.javadev.ports;

import pl.javadev.domain.Article;

import java.util.List;

public interface ArticleService {
    Article save(Article article);
    Article getByUrl(String url);
    Article getById(String id);
    List<Article> getByTag(String tag);
    List<Article> getByCategory(String category);
    void setDraft(boolean draft);
}
