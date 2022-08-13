package pl.javadev.jpa;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import pl.javadev.domain.Article;
import pl.javadev.ports.ArticleRepository;

import java.util.List;
import java.util.Optional;

@Transactional
@Component
@RequiredArgsConstructor
public class JpaArticleRepositoryAdapter implements ArticleRepository {

    private final JpaArticleRepository articleRepository;

    @Override
    public Article save(Article article) {
        ArticleEntity articleEntity = new ArticleEntity();
        articleEntity.setId(article.getId());
        articleEntity.setDate(article.getDate());
        articleEntity.setCategory(article.getCategory());
        articleEntity.setUrl(article.getUrl());
        articleEntity.setDraft(article.isDraft());
        articleRepository.save(articleEntity);
        return article;
    }

    @Override
    public Optional<Article> getByUrl(String url) {
        return Optional.empty();
    }

    @Override
    public Optional<Article> getById(String id) {
        return Optional.empty();
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
