package com.xworkz.Book.bridge;

import com.xworkz.Book.internal.*;

public interface Total {
    BookInfo BookTitle(BookInfo bookInfo);
    BookName Name(BookName bookName);
    BookTotal Total(BookTotal bookTotal);
    BookNumber Number(BookNumber bookNumber);
    BookValue Value(BookValue bookValue);
}
