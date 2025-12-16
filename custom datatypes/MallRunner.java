class MallRunner {
    public static void main(String[] args) {
        Mall mall = new Mall();

        Shop shop1 = new Shop(401, "Zara");
        Shop shop2 = new Shop(402, "H&M");
        Shop shop3 = new Shop(403, "Nike");
        Shop shop4 = new Shop(404, "Apple Store");

        Shop[] shops = {shop1, shop2, shop3, shop4};

        mall.displayShops(shops);
    }
}
