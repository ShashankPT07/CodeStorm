class ArmyRunner {
    public static void main(String[] args) {
        ArmyBase base = new ArmyBase();

        Army army1 = new Army(101, "NSG");
        Army army2 = new Army(102, " Corps");

        Army[] armies = {army1, army2};

        base.displayArmies(armies);
    }
}