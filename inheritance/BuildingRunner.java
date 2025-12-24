class BuildingRunner {
    public static void main(String[] args) {
		Building building = new Building();
        building.open();
        building.close();
        building.lock();
        building.unlock();
        building.paint();
        building.clean();
        building.renovate();
        building.lightOn();
        building.lightOff();
        building.openWindows();
    }
}
