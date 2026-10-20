package ru.bmstu.service;

import ru.bmstu.domain.Person;
import ru.bmstu.domain.Student;

public class StudentDismisser implements Dismissable {

    @Override
    public void dismiss(Person p) {
        System.out.println("Отчисление с полной информацией:");
        PersonPrinter.printInfo(p);
        if (p instanceof Student) {
            Student s = (Student) p;
            System.out.println("Группа: " + s.getGroup());
            System.out.println("Курс: " + s.getCourse());
        }
    }
}
