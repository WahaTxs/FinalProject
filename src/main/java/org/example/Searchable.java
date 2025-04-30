package org.example;

import java.util.List;

public interface Searchable {
    List<Book> search(String keyword);
}
