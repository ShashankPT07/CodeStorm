class Dog extends Animal {
    public static void setLifespan() {
        lifespan = 13;
        System.out.println("Dog Lifespan: " + lifespan + " years");
    }

    public void displaySpecies() {
        speciesName = "Golden Retriever";
        System.out.println("Dog Breed: " + speciesName);
    }
}
