class InstituteRunner {
    public static void main(String[] args) {
        InstituteManager manager = new InstituteManager();

        Institute inst1 = new Institute(1001, " Engineering College");
        Institute inst2 = new Institute(1002, " Medical Institute");

        Institute[] institutes = {inst1, inst2};

        manager.displayInstitutes(institutes);
    }
}