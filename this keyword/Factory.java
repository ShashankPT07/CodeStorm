class Factory {
    public int factoryId;
    public String factoryName;
    public long registrationNumber;
    public float areaInAcres;
    public double annualRevenue;
    public char factoryGrade;
    public boolean isOperational;

    public Factory(int factoryId, String factoryName, long registrationNumber, float areaInAcres,
                   double annualRevenue, char factoryGrade, boolean isOperational) {

        System.out.println("first try=" + this.factoryId);
        System.out.println("first try=" + this.factoryName);
        System.out.println("first try=" + this.registrationNumber);
        System.out.println("first try=" + this.areaInAcres);
        System.out.println("first try=" + this.annualRevenue);
        System.out.println("first try=" + this.factoryGrade);
        System.out.println("first try=" + this.isOperational);

        this.factoryId = factoryId;
        this.factoryName = factoryName;
        this.registrationNumber = registrationNumber;
        this.areaInAcres = areaInAcres;
        this.annualRevenue = annualRevenue;
        this.factoryGrade = factoryGrade;
        this.isOperational = isOperational;

        System.out.println("second try=" + this.factoryId);
        System.out.println("second try=" + this.factoryName);
        System.out.println("second try=" + this.registrationNumber);
        System.out.println("second try=" + this.areaInAcres);
        System.out.println("second try=" + this.annualRevenue);
        System.out.println("second try=" + this.factoryGrade);
        System.out.println("second try=" + this.isOperational);
    }
}
