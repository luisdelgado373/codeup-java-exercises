import java.util.Arrays;

public class ArraysExercises {
    public static Person[] addPerson(Person[] people, Person person) {
        Person[] newPeople = Arrays.copyOf(people, people.length+1);
        newPeople[newPeople.length-1] = person;
        return newPeople;
    }
    public static void main(String[] args) {
        Person[] people = new Person[3];
        Person person1 = new Person("Luis");
        Person person2 = new Person("Louis");
        Person person3 = new Person("Sal");
        Person person4 = new Person("Bob");
        Person person5 = new Person("Tom");

        people[0] = person1;
        people[1] = person2;
        people[2] = person3;

        System.out.println(people[0].getName());
        System.out.println(people[1].getName());
        System.out.println(people[2].getName());

        people = addPerson(people, person4);
        people = addPerson(people, person5);

        for (Person person : people){
            System.out.println(person.getName());
        }
    }
}
