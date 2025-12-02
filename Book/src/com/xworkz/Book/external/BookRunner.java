package com.xworkz.Book.external;

import com.xworkz.Book.bridge.*;
import com.xworkz.Book.internal.*;

public class BookRunner {
    public static void main(String[] args) {
        Book book = new BookImpl();
        BookInfo bookInfo = new BookInfo("Java Programming", 600);
        book.BookTitle(bookInfo);
        BookName bookName = new BookName(123456, "Effective Java");
        book.Name(bookName);
        BookTotal bookTotal = new BookTotal(800, "Clean Code");
        book.Total(bookTotal);
        BookNumber bookNumber = new BookNumber("Design Patterns", 900);
        book.Number(bookNumber);
        BookValue bookValue = new BookValue(750, "Refactoring");
        book.Value(bookValue);
        System.out.println("---------------------------------");

        Name name = new NameImpl();
        name.BookTitle(bookInfo);
        name.Name(bookName);
        name.Total(bookTotal);
        name.Number(bookNumber);
        name.Value(bookValue);
        System.out.println("---------------------------------");

        NumberBook numberBook = new NumberBookImpl();
        numberBook.BookTitle(bookInfo);
        numberBook.Name(bookName);
        numberBook.Total(bookTotal);
        numberBook.Number(bookNumber);
        numberBook.Value(bookValue);
        System.out.println("---------------------------------");

        Value value = new ValueImpl();
        value.BookTitle(bookInfo);
        value.Name(bookName);
        value.Total(bookTotal);
        value.Number(bookNumber);
        value.Value(bookValue);
        System.out.println("---------------------------------");

        Total total = new TotalImpl();
        total.BookTitle(bookInfo);
        total.Name(bookName);
        total.Total(bookTotal);
        total.Number(bookNumber);
        total.Value(bookValue);
        System.out.println("---------------------------------");
    }
}
