class Cafe {
    public int cafeId;
    public String cafeName;
    public long contactNumber;
    public float rating;
    public double dailyRevenue;
    public char category;
    public boolean isOpen;

    public Cafe(int cafeId, String cafeName, long contactNumber, float rating,
                double dailyRevenue, char category, boolean isOpen) {

 
        System.out.println("first try=" + this.cafeId);
        System.out.println("first try=" + this.cafeName);
        System.out.println("first try=" + this.contactNumber);
        System.out.println("first try=" + this.rating);
        System.out.println("first try=" + this.dailyRevenue);
        System.out.println("first try=" + this.category);
        System.out.println("first try=" + this.isOpen);

    
        this.cafeId = cafeId;
        this.cafeName = cafeName;
        this.contactNumber = contactNumber;
        this.rating = rating;
        this.dailyRevenue = dailyRevenue;
        this.category = category;
        this.isOpen = isOpen;

        System.out.println("second try=" + this.cafeId);
        System.out.println("second try=" + this.cafeName);
        System.out.println("second try=" + this.contactNumber);
        System.out.println("second try=" + this.rating);
        System.out.println("second try=" + this.dailyRevenue);
        System.out.println("second try=" + this.category);
        System.out.println("second try=" + this.isOpen);
    }
}
