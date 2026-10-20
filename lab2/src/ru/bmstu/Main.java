package ru.bmstu;

import ru.bmstu.domain.Person;
import ru.bmstu.service.PersonDemo;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Иван", "Петров", 20, "+7-999-123-45-67");
        PersonDemo demo = new PersonDemo(person);
        demo.demo();
        demo.demoStudent();
    }
}
