package ru.bmstu.service;

import ru.bmstu.domain.Person;
import ru.bmstu.domain.Student;

public interface Dismissable {

    default void dismiss(Person p) {
        String info = p.getFirstName() + " " + p.getSecondName();
        if (p instanceof Student) {
            info += ", группа " + ((Student) p).getGroup();
        }
        System.out.println("Отчислен: " + info);
    }
}
