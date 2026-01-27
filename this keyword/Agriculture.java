class Agriculture {
    public int farmId;
    public String cropType;
    public long annualProduction;
    public float landSize;
    public double marketValue;
    public char soilGrade;
    public boolean isIrrigated;

    public Agriculture(int farmId, String cropType, long annualProduction, float landSize,double marketValue, char soilGrade, boolean isIrrigated) {

      
        System.out.println("first try=" + this.farmId);
        System.out.println("first try=" + this.cropType);
        System.out.println("first try=" + this.annualProduction);
        System.out.println("first try=" + this.landSize);
        System.out.println("first try=" + this.marketValue);
        System.out.println("first try=" + this.soilGrade);
        System.out.println("first try=" + this.isIrrigated);

        
        this.farmId = farmId;
        this.cropType = cropType;
        this.annualProduction = annualProduction;
        this.landSize = landSize;
        this.marketValue = marketValue;
        this.soilGrade = soilGrade;
        this.isIrrigated = isIrrigated;

   
        System.out.println("second try=" + this.farmId);
        System.out.println("second try=" + this.cropType);
        System.out.println("second try=" + this.annualProduction);
        System.out.println("second try=" + this.landSize);
        System.out.println("second try=" + this.marketValue);
        System.out.println("second try=" + this.soilGrade);
        System.out.println("second try=" + this.isIrrigated);
    }
}
