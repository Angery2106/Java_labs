package ru.bmstu.service;

import ru.bmstu.domain.Person;
import ru.bmstu.domain.Student;

public class PersonDemo {
    private Person person;

    public PersonDemo(Person person) {
        this.person = person;
    }

    public void demo() {
        System.out.println(" PersonPrinter ");
        PersonPrinter.printFI(person);
        PersonPrinter.printInfo(person);
    }

    public void demoStudent() {
        System.out.println(" Student и Dismissable ");
        Student student = new Student("Анна", "Смирнова", 19, "+7-900-000-00-00", "ИУК6-21Б", 2);
        PersonPrinter.printFI(student);
        PersonPrinter.printInfo(student);

        student.setGroup("ИУК6-31Б");
        student.setCourse(3);

        Dismissable defaultDismisser = new Dismissable() { };
        defaultDismisser.dismiss(student);

        Dismissable studentDismisser = new StudentDismisser();
        studentDismisser.dismiss(student);
    }
}
