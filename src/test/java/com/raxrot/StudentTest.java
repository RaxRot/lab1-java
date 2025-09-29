package com.raxrot;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class StudentTest {
    @Test
    void testStudentGettersAndSetters() {
        Student s = new Student();
        s.setName("Alice");
        s.setAge(20);

        assertEquals("Alice", s.getName());
        assertEquals(20, s.getAge());
    }

    @Test
    void testAllArgsConstructor() {
        Student s = new Student("Bob", 25);

        assertEquals("Bob", s.getName());
        assertEquals(25, s.getAge());
    }

    @Test
    void testToStringContainsName() {
        Student s = new Student("Charlie", 30);

        assertTrue(s.toString().contains("Charlie"));
    }
}