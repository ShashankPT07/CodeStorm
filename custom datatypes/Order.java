class Order {
    public int orderId;
    public String orderName;

    public Order(int orderId, String orderName) {
        this.orderId = orderId;
        this.orderName = orderName;
    }

    public void displayInfo() {
        System.out.println("Order ID: " + orderId + ", Order Name: " + orderName);
    }
}



