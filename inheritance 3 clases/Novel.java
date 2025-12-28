class Novel extends Book {
    public static void setPageCount() {
        pageCount = 320;
        System.out.println("Novel Page Count: " + pageCount);
    }

    public void displayTitle() {
        title = "To Kill ";
        System.out.println("Novel Title: " + title);
    }
}
