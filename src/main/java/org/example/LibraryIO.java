package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LibraryIO {
    /**
     * Loads the catalog of books from a file path.
     *
     * @param filePath the path of the file to load from
     * @return list of books, or null/empty if file is invalid
     */
    public static List<Book> loadCatalog(String filePath) {
        List<Book> catalog = new ArrayList<>();
        if (filePath == null) return catalog;

        try (Scanner scanner = new Scanner(new File(filePath))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(",");
                int SN = Integer.parseInt(parts[0].trim());
                String title = parts[1].trim();
                String author = parts[2].trim();
                int year = Integer.parseInt(parts[3].trim());
                catalog.add(new Book(SN, title, author, year));

            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return catalog;
    }

    /**
     * Saves the given catalog to a file at the specified path.
     *
     * @param filePath the path to save the catalog file
     * @param catalog  the list of books to save
     */
    public static void saveCatalog(String filePath, List<Book> catalog) {
        if (filePath == null) return;
        try (FileWriter writer = new FileWriter(filePath)) {
            for (Book book : catalog) {
                String line = book.getSN() + "," + book.getTitle() + "," +
                        book.getAuthor() + "," + book.getYear() + "\n";
                writer.write(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Saves the issued book records to a file.
     *
     * @param filePath    the path to save the file
     * @param issuedBooks the list of issued book records
     */
    public static void saveIssued(String filePath, List<IssuedBook> issuedBooks) {
        if (filePath == null) return;
        try (FileWriter writer = new FileWriter(filePath)) {
            for (IssuedBook record : issuedBooks) {
                String line = record.getBook().getSN() + "," +
                        record.getStudent().getId() + "," +
                        record.getDateIssued() + "\n";
                writer.write(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}