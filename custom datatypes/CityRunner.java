class CityRunner {
    public static void main(String[] args) {
        City city = new City();

        School school1 = new School(201, "G High");
        School school2 = new School(202, "Sunrise ");
        School school3 = new School(203, " Academy");
        School school4 = new School(204, " School");

        School[] schools = {school1, school2, school3, school4};

        city.displaySchools(schools);
    }
}