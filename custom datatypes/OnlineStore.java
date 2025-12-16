class OnlineStore {
    public void displayOrders(Order[] orders) {
        for (int im = 0; im < orders.length; im++) {
            Order order = orders[im];
            order.displayInfo();
        }
    }
}
