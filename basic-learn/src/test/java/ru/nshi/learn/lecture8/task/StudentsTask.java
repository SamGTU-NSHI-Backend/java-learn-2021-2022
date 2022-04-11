package ru.nshi.learn.lecture8.task;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import ru.nshi.learn.lecture8.Faculity;
import ru.nshi.learn.lecture8.Student;

import java.util.*;

/**
 * @author rassafel
 */
public class StudentsTask {
    static List<Arguments> students() {
        return Arrays.asList(
            Arguments.of(
                Arrays.asList(
                    new Student(1, "Ivan", 3, Faculity.AUTP),
                    new Student(2, "Igor", 1, Faculity.IAT),
                    new Student(3, "Egor", 2, Faculity.IAT),
                    new Student(4, "Andrey", 1, Faculity.MA),
                    new Student(5, "Sergey", 4, Faculity.IAT),
                    new Student(6, "Alexey", 2, Faculity.MA),
                    new Student(7, "Alexander", 1, Faculity.AUTP)
                )
            )
        );
    }

    @ParameterizedTest
    @MethodSource("students")
    void task1Version1(List<Student> students) {
        System.out.println(students);
        Assertions.assertNotNull(students);
        Assertions.assertNotEquals(0, students.size());

        Map<Faculity, Collection<Student>> faculityStudents = new EnumMap<>(Faculity.class);

        for (Faculity faculity : Faculity.values()) {
            List<Student> studentsFacility = new ArrayList<>();
            for (Student student : students) {
                if (Objects.nonNull(student) && faculity.equals(student.getFaculity())) {
                    studentsFacility.add(student);
                }
            }
            faculityStudents.put(faculity, studentsFacility);
            System.out.println(faculity + " = " + studentsFacility);
        }


        System.out.println("faculityStudents = " + faculityStudents);
        Assertions.assertEquals(2, faculityStudents.get(Faculity.AUTP).size());
        Assertions.assertEquals(3, faculityStudents.get(Faculity.IAT).size());
        Assertions.assertEquals(2, faculityStudents.get(Faculity.MA).size());
    }

    @ParameterizedTest
    @MethodSource("students")
    void task1Version2(List<Student> students) {
        System.out.println(students);
        Assertions.assertNotNull(students);
        Assertions.assertNotEquals(0, students.size());

        Map<Faculity, List<Student>> faculityStudents = new EnumMap<>(Faculity.class);

        for (Student student : students) {
            if (Objects.isNull(student) && Objects.isNull(student.getFaculity())) {
                continue;
            }
            Faculity faculity = student.getFaculity();

            if (!faculityStudents.containsKey(faculity)) {
                faculityStudents.put(faculity, new ArrayList<>());
            }
            faculityStudents.get(faculity).add(student);
        }

        for (Map.Entry<Faculity, List<Student>> entry : faculityStudents.entrySet()) {
            entry.getValue().sort(Student.COMPARATOR_BY_COURSE.reversed());
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }


        System.out.println("faculityStudents = " + faculityStudents);
        Assertions.assertEquals(2, faculityStudents.get(Faculity.AUTP).size());
        Assertions.assertEquals(3, faculityStudents.get(Faculity.IAT).size());
        Assertions.assertEquals(2, faculityStudents.get(Faculity.MA).size());
    }
}
