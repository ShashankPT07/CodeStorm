class Car extends Vehicle {

    public String brand;
    public int year;
 
    public double price;
    public boolean isElectric;

    public Car(String brand, int year,  double price, boolean isElectric) {
        super.brand = brand;
        this.brand = brand;

        super.year = year;
        this.year = year;

    

        super.price = price;
        this.price = price;

        super.isElectric = isElectric;
        this.isElectric = isElectric;

        System.out.println(brand);
        System.out.println(year);
        
        System.out.println(price);
        System.out.println(isElectric);
    }

    public void displayVehicleDetails() {
        System.out.println(super.brand);
        System.out.println(super.year);
   
        System.out.println(super.price);
        System.out.println(super.isElectric);

        System.out.println(this.brand);
        System.out.println(this.year);
        
        System.out.println(this.price);
        System.out.println(this.isElectric);
    }
}
