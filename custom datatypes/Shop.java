class Shop {
    public int shopId;
    public String shopName;

    public Shop(int shopId, String shopName) {
        this.shopId = shopId;
        this.shopName = shopName;
    }

    public void displayInfo() {
        System.out.println("Shop ID: " + shopId + ", Shop Name: " + shopName);
    }
}



