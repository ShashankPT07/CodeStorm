class Shiva extends God {

    public int numberOfArms;
    public String godName;
    public char gender;
    public long age;
    public float height;
    public double powerLevel;
    public boolean isImmortal;

    public Shiva(int numberOfArms, String godName, char gender, long age, float height, double powerLevel, boolean isImmortal) {
        super.numberOfArms = numberOfArms;
        this.numberOfArms = numberOfArms;

        super.godName = godName;
        this.godName = godName;

        super.gender = gender;
        this.gender = gender;

        super.age = age;
        this.age = age;

        super.height = height;
        this.height = height;

        super.powerLevel = powerLevel;
        this.powerLevel = powerLevel;

        super.isImmortal = isImmortal;
        this.isImmortal = isImmortal;

        
        System.out.println(numberOfArms);
        System.out.println(godName);
        System.out.println(gender);
        System.out.println(age);
        System.out.println(height);
        System.out.println(powerLevel);
        System.out.println(isImmortal);
    }

    public void displayGodDetails() {
    
        System.out.println(super.numberOfArms);
        System.out.println(super.godName);
        System.out.println(super.gender);
        System.out.println(super.age);
        System.out.println(super.height);
        System.out.println(super.powerLevel);
        System.out.println(super.isImmortal);

   
        System.out.println(this.numberOfArms);
        System.out.println(this.godName);
        System.out.println(this.gender);
        System.out.println(this.age);
        System.out.println(this.height);
        System.out.println(this.powerLevel);
        System.out.println(this.isImmortal);
    }
}