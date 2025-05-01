package org.example;

import java.util.List;

public class LibraryIO {
    /**
     * Loads the catalog of books from a file path.
     * @param filePath the path of the file to load from
     * @return list of books, or null/empty if file is invalid
     */
    public static List<Book> loadCatalog(String filePath) {
        return null;
    }
    /**
     * Saves the given catalog to a file at the specified path.
     * @param filePath the path to save the catalog file
     * @param catalog the list of books to save
     */
    public static void saveCatalog(String filePath, List<Book> catalog) {
        // To be implemented
    }
    /**
     * Saves the issued book records to a file.
     * @param filePath the path to save the file
     * @param issuedBooks the list of issued book records
     */
    public static void saveIssued(String filePath, List<?> issuedBooks) {
        // To be implemented
    }
}