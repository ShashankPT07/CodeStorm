class Employee extends Person {

    public String name;
    public int age;
    public char gender;
    public long phone;
    public boolean isMarried;

    public Employee(String name, int age, char gender, long phone, boolean isMarried) {
        super.name = name;
        this.name = name;

        super.age = age;
        this.age = age;

        super.gender = gender;
        this.gender = gender;

        super.phone = phone;
        this.phone = phone;

        super.isMarried = isMarried;
        this.isMarried = isMarried;

        System.out.println(name);
        System.out.println(age);
        System.out.println(gender);
        System.out.println(phone);
        System.out.println(isMarried);
    }

    public void displayPersonDetails() {
        System.out.println(super.name);
        System.out.println(super.age);
        System.out.println(super.gender);
        System.out.println(super.phone);
        System.out.println(super.isMarried);

        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.gender);
        System.out.println(this.phone);
        System.out.println(this.isMarried);
    }
}
