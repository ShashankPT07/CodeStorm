
class DeviceRunner {

    public static void main(String[] args) {
        ElectronicDevice device = new ElectronicDevice(101, "Smart TV", 'E', 9876543210L, 55.5f, 79999.99, true);
        device.displayDeviceDetails();
    }
}