class Cartoon {
    public int rating;

    public void show() {
        this.characterName("Tom");
        System.out.println("This is the show method");
    }

    public void characterName(String name) {
        this.characterInfo("Jerry", 101);
        System.out.println("Character Name: " + name);
    }

    public void characterInfo(String name, int id) {
        this.firstEpisode(2000, "Cartoon Network", 'A');
        System.out.println("Character Info: Name = " + name + ", ID = " + id);
    }

    public void firstEpisode(int year, String channel, char rating) {
        this.popularityScore(9999, "Boomerang", 'S', 1000000L);
        System.out.println("First Episode: Year = " + year + ", Channel = " + channel + ", Rating = " + rating);
    }

    public void popularityScore(int score, String channel, char grade, long viewers) {
        this.cartoonStats(8888, "Disney", 'B', 2000000L, 9.5f);
        System.out.println("Popularity Score: Score = " + score + ", Channel = " + channel + ", Grade = " + grade + ", Viewers = " + viewers);
    }

    public void cartoonStats(int score, String channel, char grade, long viewers, float duration) {
        this.finalStats(7777, "Nickelodeon", 'A', 3000000L, 8.8f, 95.5);
        System.out.println("Cartoon Stats: Score = " + score + ", Channel = " + channel + ", Grade = " + grade + ", Viewers = " + viewers + ", Duration = " + duration + " mins");
    }

    public void finalStats(int score, String channel, char grade, long viewers, float duration, double rating) {
        System.out.println("Final Stats:");
        System.out.println("Score = " + score + ", Channel = " + channel + ", Grade = " + grade + ", Viewers = " + viewers + ", Duration = " + duration + " mins, Rating = " + rating + "/100");
    }

   
}
