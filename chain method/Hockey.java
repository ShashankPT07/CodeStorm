class Hockey {
    public int price;

    public void amount() {
        this.playerName("manu");
        System.out.println("this is argument cons");
    }

    public void playerName(String name) {
        this.playerID("maga", 1245);
        System.out.println("this is double argument cons " + name);
    }

    public void playerID(String name, int playerID) {
        this.debutPlayers(5465, "lions", 'A');
        System.out.println("this is double argument cons  " + name + "," + playerID);
    }

    public void debutPlayers(int player, String name, char rate) {
        this.highestPrice(54655, "lions", 'B', 92225220L);
        System.out.println("this is multiple argument cons  " + player + "," + name + "," + rate);
    }

    public void highestPrice(int player, String name, char rate, long price) {
        this.playerHeight(54655, "lions", 'B', 92225220L, 23.14f);
        System.out.println("this is multiple argument cons  " + player + "," + name + "," + rate + "," + price);
    }

    public void playerHeight(int player, String name, char rate, long price, float height) {
        this.average(54655, "lions", 'B', 92225220L, 23.14f, 99.99);
        System.out.println("this is multiple argument cons  " + player + "," + name + "," + rate + "," + price + "," + height);
    }

    public void average(int player, String name, char rate, long price, float height, double strikeRate) {
        System.out.println("this is multiple argument cons  " + player + "," + name + "," + rate + "," + price + "," + height + "," + strikeRate);
    }
}
