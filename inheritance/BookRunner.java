class BookRunner {
    public static void main(String[] args) {
	Book book = new Book();
        book.open();
        book.close();
        book.read();
        book.writeNotes();
        book.bookmark();
        book.tearPage();
        book.flipPage();
        book.lend();
        book.returnBook();
        book.highlight();
    }
}