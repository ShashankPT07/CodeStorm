class Roads {
    public int roadNumber;
    public String location;
    public long totalLengthInKm;
    public float averageWidth;
    public double maintenanceBudget;
    public char category; 
    public boolean underConstruction;

    public Roads(int roadNumber, String location, long totalLengthInKm, float averageWidth,
                 double maintenanceBudget, char category, boolean underConstruction) {

   
        System.out.println("first try=" + this.roadNumber);
        System.out.println("first try=" + this.location);
        System.out.println("first try=" + this.totalLengthInKm);
        System.out.println("first try=" + this.averageWidth);
        System.out.println("first try=" + this.maintenanceBudget);
        System.out.println("first try=" + this.category);
        System.out.println("first try=" + this.underConstruction);

        this.roadNumber = roadNumber;
        this.location = location;
        this.totalLengthInKm = totalLengthInKm;
        this.averageWidth = averageWidth;
        this.maintenanceBudget = maintenanceBudget;
        this.category = category;
        this.underConstruction = underConstruction;

       
        System.out.println("second try=" + this.roadNumber);
        System.out.println("second try=" + this.location);
        System.out.println("second try=" + this.totalLengthInKm);
        System.out.println("second try=" + this.averageWidth);
        System.out.println("second try=" + this.maintenanceBudget);
        System.out.println("second try=" + this.category);
        System.out.println("second try=" + this.underConstruction);
    }
}
