class Army {
    public int armyId;
    public String armyName;

    public Army(int armyId, String armyName) {
        this.armyId = armyId;
        this.armyName = armyName;
    }

    public void displayInfo() {
        System.out.println("Army ID: " + armyId + ", Army Name: " + armyName);
    }
}



