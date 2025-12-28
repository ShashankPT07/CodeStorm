
class Dog extends Animal {

    public int age;
    public String name;
    public char gender;
    public long idNumber;
    public float height;
    public double weight;
    public boolean isWild;

    public Dog(int age, String name, char gender, long idNumber, float height, double weight, boolean isWild) {
        super.age = age;
        this.age = age;

        super.name = name;
        this.name = name;

        super.gender = gender;
        this.gender = gender;

        super.idNumber = idNumber;
        this.idNumber = idNumber;

        super.height = height;
        this.height = height;

        super.weight = weight;
        this.weight = weight;

        super.isWild = isWild;
        this.isWild = isWild;

 
        System.out.println(age);
        System.out.println(name);
        System.out.println(gender);
        System.out.println(idNumber);
        System.out.println(height);
        System.out.println(weight);
        System.out.println(isWild);
    }

    public void displayAnimalDetails() {
   
        System.out.println(super.age);
        System.out.println(super.name);
        System.out.println(super.gender);
        System.out.println(super.idNumber);
        System.out.println(super.height);
        System.out.println(super.weight);
        System.out.println(super.isWild);

    
        System.out.println(this.age);
        System.out.println(this.name);
        System.out.println(this.gender);
        System.out.println(this.idNumber);
        System.out.println(this.height);
        System.out.println(this.weight);
        System.out.println(this.isWild);
    }
}