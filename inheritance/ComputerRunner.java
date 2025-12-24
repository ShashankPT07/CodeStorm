class ComputerRunner {
    public static void main(String[] args) {
	Computer computer = new Computer();
        computer.boot();
        computer.shutdown();
        computer.restart();
        computer.sleep();
        computer.openApp();
        computer.closeApp();
        computer.saveFile();
        computer.deleteFile();
        computer.connectInternet();
        computer.disconnectInternet();
    }
}
