package tasks.homework.arraylist;

import project.mix.Person;
import java.util.Arrays;
import java.util.List;

/*Создать пустой список людей (класса Person) people
    Заполнить 4 людьми с возрастом (32, 24, 55, 63) и именами (Коля, Оля, Вася, Маша) соответственно
    Проитерировать список через for-each и отпечатать возраст в консоль через пробел
    Проитерировать список через for-each и отпечатать имена в консоль через пробел
    Проитерировать список по индексу и отпечатать людей (.toString()) в консоль с новой строки*/

public class PersonList {

    public static void main(String[] args) {

        List<Person> people = Arrays.asList(new Person(32, "Коля"), new Person(24, "Оля"), new Person(55, "Вася"), new Person(63, "Маша"));

        for (Person person : people) {
            System.out.print(person.getAge() + " ");

        }

        System.out.println();

        for (Person person : people) {

            System.out.print(person.getName() + " ");
        }
        System.out.println();

        for (int i = 0; i < people.size(); i++) {
            System.out.println(people.get(i).toString());

        }
    }
}
