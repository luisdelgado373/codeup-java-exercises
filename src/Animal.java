public class Animal {
    protected int age;
    protected String species;
    protected boolean isAlive;

    public Animal(int age, String species, boolean isAlive) {
        this.age = age;
        this.species = species;
        this.isAlive = isAlive;
    }

    public String getSpecies() {
        return species;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public int getAge() {
        return age;
    }
}