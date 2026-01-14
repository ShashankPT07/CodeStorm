class MovieRunner {
    public static void main(String[] args) {
        Director director = new Director("Christopher Nolan", 11);
        Producer producer = new Producer("Emma Thomas", "Syncopy");
        Script script = new Script("Sci-Fi", 148);
        Movie movie = new Movie("Interstellar", director, producer, script);

        movie.displayDetails();
    }
}