import org.example.Book;
import org.example.LibraryIO;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class LoadCatalogTest {
    @Test
    public void loadCatalogTest1_validFile() {
        List<Book> result = LibraryIO.loadCatalog("valid.txt");
        boolean expected = result != null;
        Assertions.assertEquals(true, expected);
    }

    @Test
    public void loadCatalogTest2_nonExistentFile() {
        List<Book> result = LibraryIO.loadCatalog("nofile.txt");
        boolean expected = result == null || result.isEmpty();
        Assertions.assertEquals(true, expected);
    }

    @Test
    public void loadCatalogTest3_nullFilePath() {
        List<Book> result = LibraryIO.loadCatalog(null);
        boolean expected = result == null || result.isEmpty();
        Assertions.assertEquals(true, expected);
    }

    @Test
    public void loadCatalogTest4_emptyFile() {
        List<Book> result = LibraryIO.loadCatalog("emptytxt");
        boolean expected = result == null || result.isEmpty();
        Assertions.assertEquals(true, expected);
    }
}
