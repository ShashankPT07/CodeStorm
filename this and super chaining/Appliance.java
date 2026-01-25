class Appliance {

    public String model;
    public String brand;
    public double power;
    public float weight;
    public boolean isAutomatic;

    public Appliance() {
        System.out.println("This is an Appliance");
    }
}

class WashingMachine extends Appliance {

    public String model;
    public String brand;
    public double power;
    public float weight;
    public boolean isAutomatic;

    public WashingMachine(String model, String brand, double power, float weight, boolean isAutomatic) {
        super.model = model;
        this.model = model;

        super.brand = brand;
        this.brand = brand;

        super.power = power;
        this.power = power;

        super.weight = weight;
        this.weight = weight;

        super.isAutomatic = isAutomatic;
        this.isAutomatic = isAutomatic;

        System.out.println(model);
        System.out.println(brand);
        System.out.println(power);
        System.out.println(weight);
        System.out.println(isAutomatic);
    }

    public void displayApplianceDetails() {
        System.out.println(super.model);
        System.out.println(super.brand);
        System.out.println(super.power);
        System.out.println(super.weight);
        System.out.println(super.isAutomatic);

        System.out.println(this.model);
        System.out.println(this.brand);
        System.out.println(this.power);
        System.out.println(this.weight);
        System.out.println(this.isAutomatic);
    }
}

class WashingMachineRunner {
    public static void main(String[] args) {
        WashingMachine wm = new WashingMachine("WM123", "Samsung", 1500.0, 60.5f, true);
        wm.displayApplianceDetails();
    }
}
