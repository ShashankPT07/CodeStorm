class City {
    public void displaySchools(School[] schools) {
        for (int num = 0; num < schools.length; num++) {
            School school = schools[num];
            school.displayInfo();
        }
    }
}