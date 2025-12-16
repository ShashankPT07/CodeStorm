class Mall {
    public void displayShops(Shop[] shops) {
        for (int ina = 0; ina< shops.length; ina++) {
            Shop shop = shops[ina];
            shop.displayInfo();
        }
    }
}