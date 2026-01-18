class Book {
    public String bookTitle;
    public Author author;

    public Book(Author author) {
        this.bookTitle = author.name + "'s Book";
        this.author = author;
    }

    public void displayBook() {
        author.authorDetails();
    }
}
