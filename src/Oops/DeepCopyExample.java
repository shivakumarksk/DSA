package Oops;

import java.util.Arrays;

public class DeepCopyExample {
    public static void main(String[] args) {
        // Original object
        Person person = new Person("John", 30, new String[]{"Reading", "Writing"});

        // Deep copy
        Person deepCopy = new Person(person.getName(), person.getAge(), Arrays.copyOf(person.getHobbies(), person.getHobbies().length));

        // Modify the original object
        person.setName("Jane");
        person.getHobbies()[0] = "Coding";

        System.out.println("Original Object: " + person);
        System.out.println("Deep Copy: " + deepCopy);
        // Original object
        Person person1 = new Person("John", 30, new String[]{"Reading", "Writing"});

        // Shallow copy
        Person shallowCopy = new Person(person1.getName(), person1.getAge(), person1.getHobbies());

        // Modify the original object
        person1.setName("Jane");
        person1.getHobbies()[0] = "Coding";

        System.out.println("Original Object: " + person1);
        System.out.println("Shallow Copy: " + shallowCopy);
    }
}

class Person {
    private String name;
    private int age;
    private String[] hobbies;

    public Person(String name, int age, String[] hobbies) {
        this.name = name;
        this.age = age;
        this.hobbies = hobbies;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String[] getHobbies() {
        return hobbies;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", hobbies=" + Arrays.toString(hobbies) +
                '}';
    }
}
