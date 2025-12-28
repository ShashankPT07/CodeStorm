class India extends Country {

    public int populationInCrores;
    public String countryName;
    public char countryCode;
    public long gdp;
    public float literacyRate;
    public double area;
    public boolean isDeveloped;

    public India(int populationInCrores, String countryName, char countryCode, long gdp, float literacyRate, double area, boolean isDeveloped) {
        super.populationInCrores = populationInCrores;
        this.populationInCrores = populationInCrores;

        super.countryName = countryName;
        this.countryName = countryName;

        super.countryCode = countryCode;
        this.countryCode = countryCode;

        super.gdp = gdp;
        this.gdp = gdp;

        super.literacyRate = literacyRate;
        this.literacyRate = literacyRate;

        super.area = area;
        this.area = area;

        super.isDeveloped = isDeveloped;
        this.isDeveloped = isDeveloped;

        
        System.out.println(populationInCrores);
        System.out.println(countryName);
        System.out.println(countryCode);
        System.out.println(gdp);
        System.out.println(literacyRate);
        System.out.println(area);
        System.out.println(isDeveloped);
    }

    public void displayCountryDetails() {

        System.out.println(super.populationInCrores);
        System.out.println(super.countryName);
        System.out.println(super.countryCode);
        System.out.println(super.gdp);
        System.out.println(super.literacyRate);
        System.out.println(super.area);
        System.out.println(super.isDeveloped);


        System.out.println(this.populationInCrores);
        System.out.println(this.countryName);
        System.out.println(this.countryCode);
        System.out.println(this.gdp);
        System.out.println(this.literacyRate);
        System.out.println(this.area);
        System.out.println(this.isDeveloped);
    }
}