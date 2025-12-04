class Book {
    public int pageCount;

    public void read() {
        this.author("Rowling");
        System.out.println("Starting to read the book...");
    }

    public void author(String name) {
        this.bookInfo("Harry ", 7);
        System.out.println("Author: " + name);
    }

    public void bookInfo(String title, int volume) {
        this.publisher(1997, "aadc", 'F');
        System.out.println("Book Info: Title = " + title + ", Volume = " + volume);
    }

    public void publisher(int year, String name, char category) {
        this.sales(50000, "Worldwide", 'B', 120000000L);
        System.out.println("Published Year: " + year + ", Publisher: " + name);
    }

    public void sales(int rank, String region, char grade, long copies) {
        this.bookStats(1024, "Fantasy", 'A', 150000000L, 6.4f);
        System.out.println("Sales Rank: " + rank + ", Copies Sold = " + copies);
    }

    public void bookStats(int id, String genre, char rating, long sales, float avgReadTime) {
        this.finalSummary(2025, "Magic", 'A', 180000000L, 7.2f, 9.8);
        System.out.println("Genre: " + genre + ", Avg Read Time = " + avgReadTime + " hrs");
    }

    public void finalSummary(int year, String theme, char level, long totalSales, float hours, double rating) {
        System.out.println("Final Summary: Year = " + year + ", Theme = " + theme + ", Rating = " + rating + "/10");
    }

    
}
