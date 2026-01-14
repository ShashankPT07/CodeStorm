class Movie {
    public String title;
    public Director director;
    public Producer producer;
    public Script script;

    public Movie(String title, Director director, Producer producer, Script script) {
        this.title = title;
        this.director = director;
        this.producer = producer;
        this.script = script;
    }

    public void displayDetails() {
        System.out.println("Movie Title: " + title);
        System.out.println("Director: " + director.name + " (Directed " + director.moviesDirected + " movies)");
        System.out.println("Producer: " + producer.name + " (" + producer.company + ")");
        System.out.println("Genre: " + script.genre);
        System.out.println("Duration: " + script.durationMinutes + " minutes");
    }
}