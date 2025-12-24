class GameRunner {
    public static void main(String[] args) {
	Game game = new Game();
        game.start();
        game.play();
        game.pause();
        game.resume();
        game.save();
        game.load();
        game.win();
        game.lose();
        game.exit();
        game.restart();
    }
}