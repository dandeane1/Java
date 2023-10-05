
import java.util.Arrays;

public class ArraysExercises {
    public static  void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        //References memory location but does not print the elements.
        //System.out.println(numbers);
        System.out.println(Arrays.toString(numbers));
        Person[] persons = new Person[3];
        persons[0] = new Person("Jay");
        persons[1] = new Person("John");
        persons[2] = new Person("Joe");
        //Create new person object.
        Person newPerson = new Person("Jane");
        persons = addPerson(persons, newPerson);


       for (Person person : persons) {
            System.out.println(person.getName());
        }
    }
    public static Person[] addPerson(Person[] persons, Person newPerson) {
        Person[] updatedPersons = Arrays.copyOf(persons, persons.length + 1);
        updatedPersons[persons.length] = newPerson;
        return updatedPersons;
    }
}