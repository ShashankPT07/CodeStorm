class Earth extends Planet {

    public int numberOfMoons;
    public String planetName;
    public char planetType;
    public long distanceFromSun;
    public float gravity;
    public double diameter;
    public boolean hasLife;

    public Earth(int numberOfMoons, String planetName, char planetType, long distanceFromSun, float gravity, double diameter, boolean hasLife) {
        super.numberOfMoons = numberOfMoons;
        this.numberOfMoons = numberOfMoons;

        super.planetName = planetName;
        this.planetName = planetName;

        super.planetType = planetType;
        this.planetType = planetType;

        super.distanceFromSun = distanceFromSun;
        this.distanceFromSun = distanceFromSun;

        super.gravity = gravity;
        this.gravity = gravity;

        super.diameter = diameter;
        this.diameter = diameter;

        super.hasLife = hasLife;
        this.hasLife = hasLife;


        System.out.println(numberOfMoons);
        System.out.println(planetName);
        System.out.println(planetType);
        System.out.println(distanceFromSun);
        System.out.println(gravity);
        System.out.println(diameter);
        System.out.println(hasLife);
    }

    public void displayPlanetDetails() {
        
        System.out.println(super.numberOfMoons);
        System.out.println(super.planetName);
        System.out.println(super.planetType);
        System.out.println(super.distanceFromSun);
        System.out.println(super.gravity);
        System.out.println(super.diameter);
        System.out.println(super.hasLife);

     
        System.out.println(this.numberOfMoons);
        System.out.println(this.planetName);
        System.out.println(this.planetType);
        System.out.println(this.distanceFromSun);
        System.out.println(this.gravity);
        System.out.println(this.diameter);
        System.out.println(this.hasLife);
    }
}