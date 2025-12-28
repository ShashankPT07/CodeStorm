
class PlanetRunner {

    public static void main(String[] args) {
        Earth earth = new Earth(1, "Earth", 'T', 149600000L, 9.8f, 12742.0, true);
        earth.displayPlanetDetails();
    }
}