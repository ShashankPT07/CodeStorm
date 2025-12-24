class LibraryRunner {
    public static void main(String[] args) {

        Library lib = new Library();

        lib.open();
        lib.close();
        lib.lendBook();
        lib.returnBook();
        lib.addBook();
        lib.removeBook();
        lib.organizeShelves();
        lib.conductReadingSession();
        lib.chargeFine();
        lib.registerMember();
    }
}