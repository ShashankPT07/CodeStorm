
class ElectronicDevice extends Device {

    public int id;
    public String name;
    public char category;
    public long serialNumber;
    public float size;
    public double price;
    public boolean isAvailable;

    public ElectronicDevice(int id, String name, char category, long serialNumber, float size, double price, boolean isAvailable) {
        super.id = id;
        this.id = id;
        super.name = name;
        this.name = name;
        super.category = category;
        this.category = category;
        super.serialNumber = serialNumber;
        this.serialNumber = serialNumber;
        super.size = size;
        this.size = size;
        super.price = price;
        this.price = price;
        super.isAvailable = isAvailable;
        this.isAvailable = isAvailable;

        System.out.println("Constructor Values:");
        System.out.println(id);
        System.out.println(name);
        System.out.println(category);
        System.out.println(serialNumber);
        System.out.println(size);
        System.out.println(price);
        System.out.println(isAvailable);
    }

    public void displayDeviceDetails() {
        System.out.println("Device Details from super:");
        System.out.println(super.id);
        System.out.println(super.name);
        System.out.println(super.category);
        System.out.println(super.serialNumber);
        System.out.println(super.size);
        System.out.println(super.price);
        System.out.println(super.isAvailable);

        System.out.println("Device Details from this:");
        System.out.println(this.id);
        System.out.println(this.name);
        System.out.println(this.category);
        System.out.println(this.serialNumber);
        System.out.println(this.size);
        System.out.println(this.price);
        System.out.println(this.isAvailable);
    }
}