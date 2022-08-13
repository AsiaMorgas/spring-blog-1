package pl.javadev.domain;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import pl.javadev.ports.ArticleRepository;
import pl.javadev.ports.ArticleService;

import java.util.List;

@RequiredArgsConstructor
@Component
public class RepoService implements ArticleService {

   private final ArticleRepository articleService;

    @Override
    public Article save(Article article) {
        articleService.save(article);
        return article;
    }

    @Override
    public Article getByUrl(String url) {
        return null;
    }

    @Override
    public Article getById(String id) {
        return null;
    }

    @Override
    public List<Article> getByTag(String tag) {
        return null;
    }

    @Override
    public List<Article> getByCategory(String category) {
        return null;
    }

    @Override
    public void setDraft(boolean draft) {

    }
}
