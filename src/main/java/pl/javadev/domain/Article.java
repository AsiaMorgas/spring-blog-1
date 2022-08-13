package pl.javadev.domain;

import lombok.Builder;
import lombok.Value;

import java.util.Date;
import java.util.List;

//Stworzyć silnik do Bloga
//        Funkcjonalności:
//        - Dodawanie nowego artykułu
//        - Pobieranie artykułów w danej kategorii, posortowanych po dacie publikacji
//        - Pobieranie artykułów po tagach, posortowanych po dacie publikacji
//        - Pobieranie konkretnego artykułu (po url/slug)
//        - Przełączanie artykułu między trybem draft, public

@Builder
@Value
public class Article {
    String id;
    String url;
    String category;
    Date date;
    List<String> tags;
    boolean draft;
}
