package com.xworkz.Book.bridge;

import com.xworkz.Book.internal.*;

public class NumberBookImpl implements NumberBook {
    @Override
    public BookInfo BookTitle(BookInfo bookInfo) {
        System.out.println("this is sub class " + BookInfo.title + " " + BookInfo.price);
        return bookInfo;
    }

    @Override
    public BookName Name(BookName bookName) {
        System.out.println("this is 2nd sub class " + BookName.id + " " + BookName.title);
        return bookName;
    }

    @Override
    public BookTotal Total(BookTotal bookTotal) {
        System.out.println("this is 3rd sub class " + BookTotal.price + " " + BookTotal.title);
        return bookTotal;
    }

    @Override
    public BookNumber Number(BookNumber bookNumber) {
        System.out.println("this is 4th sub class " + BookNumber.title + " " + BookNumber.price);
        return bookNumber;
    }

    @Override
    public BookValue Value(BookValue bookValue) {
        System.out.println("this is 5th sub class " + BookValue.price + " " + BookValue.title);
        return bookValue;
    }
}
