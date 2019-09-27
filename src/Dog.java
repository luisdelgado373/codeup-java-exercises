public class Dog extends Animal {
        private String breed;
        private String name;
        public Dog(int age, String species, boolean isAlive, String breed, String name) {
            super(age, species, isAlive);
            this.breed = breed;
            this.name = name;
        }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void getDog() {
            System.out.printf("age: %d\nspecies: %s\nisAlive: %b\nbreed: %s\nname: %s", getAge(), getSpecies(), isAlive(), getBreed(), getName());
        }

}
