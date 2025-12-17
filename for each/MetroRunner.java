class MetroRunner {
    public static void main(String[] args) {
        MetroSystem system = new MetroSystem();

        Metro metro1 = new Metro(301, "Blue Line");
        Metro metro2 = new Metro(302, "Red Line");

        Metro[] metros = {metro1, metro2};

        system.displayMetros(metros);
    }
}