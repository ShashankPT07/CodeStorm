package com.xworkz.Book.bridge;

import com.xworkz.Book.internal.*;

public interface Name {
    BookInfo BookTitle(BookInfo bookInfo);
    BookName Name(BookName bookName);
    BookTotal Total(BookTotal bookTotal);
    BookNumber Number(BookNumber bookNumber);
    BookValue Value(BookValue bookValue);
}
