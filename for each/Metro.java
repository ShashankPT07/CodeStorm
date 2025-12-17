class Metro {
    public int metroId;
    public String metroName;

    public Metro(int metroId, String metroName) {
        this.metroId = metroId;
        this.metroName = metroName;
    }

    public void displayInfo() {
        System.out.println("Metro ID: " + metroId + ", Metro Name: " + metroName);
    }
}



