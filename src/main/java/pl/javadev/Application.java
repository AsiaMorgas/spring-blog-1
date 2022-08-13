package pl.javadev;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pl.javadev.domain.Article;
import pl.javadev.ports.ArticleService;

import java.time.Instant;
import java.util.Date;

public class Application {
    public static void main(String[] args) {
        try (var container = new AnnotationConfigApplicationContext(BlogConfiguration.class)) {
            var articleService = container.getBean(ArticleService.class);
            // TODO
            var article = Article.builder().id("jsdfgh")
                    .date(new Date())
                    .category("Kategoria")
                    .url("jakis url")
                    .draft(true)
                    .build();
            articleService.save(article);
        }
    }
}
