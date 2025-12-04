class Movie {
    public int budget;

    public void start() {
        this.director("Christopher Nolan");
        System.out.println("Movie starting...");
    }

    public void director(String name) {
        this.cast("Leonardo DiCaprio", 101);
        System.out.println("Director: " + name);
    }

    public void cast(String actor, int actorId) {
        this.releaseInfo(2010, "Warner Bros", 'U');
        System.out.println("Cast: " + actor + ", ID: " + actorId);
    }

    public void releaseInfo(int year, String studio, char rating) {
        this.boxOffice(95000, "Global", 'A', 830000000L);
        System.out.println("Release Info: Year = " + year + ", Studio = " + studio + ", Rating = " + rating);
    }

    public void boxOffice(int score, String market, char grade, long revenue) {
        this.movieStats(9876, "IMAX", 'A', 830000000L, 2.45f);
        System.out.println("Box Office: Score = " + score + ", Market = " + market + ", Grade = " + grade + ", Revenue = $" + revenue);
    }

    public void movieStats(int id, String format, char quality, long revenue, float duration) {
        this.finalReview(9876, "IMAX", 'A', 830000000L, 2.45f, 91.4);
        System.out.println("Movie Stats: Format = " + format + ", Duration = " + duration + " hrs");
    }

    public void finalReview(int id, String format, char quality, long revenue, float duration, double score) {
        System.out.println("Final Review: Score = " + score + "/100, Duration = " + duration + " hrs, Revenue = $" + revenue);
    }

    
}
