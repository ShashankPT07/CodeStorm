class StoreRunner {
    public static void main(String[] args) {
        OnlineStore store = new OnlineStore();

        Order order1 = new Order(501, "Laptop");
        Order order2 = new Order(502, "Smartphone");
        Order order3 = new Order(503, "Headphones");
        Order order4 = new Order(504, "Smartwatch");

        Order[] orders = {order1, order2, order3, order4};

        store.displayOrders(orders);
    }
}