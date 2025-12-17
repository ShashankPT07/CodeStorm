class Institute {
    public int instituteId;
    public String instituteName;

    public Institute(int instituteId, String instituteName) {
        this.instituteId = instituteId;
        this.instituteName = instituteName;
    }

    public void displayInfo() {
        System.out.println("Institute ID: " + instituteId + ", Institute Name: " + instituteName);
    }
}



