package com.raxrot;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;
class StudentTest {
    private Student fer;
    private Student ryan;

    @BeforeAll
     static void onceExecutedBeforeAll() {
        System.out.println("Test Student Class");
    }

    @BeforeEach
     void setup() {
        fer = new Student(1L, "fer");
        fer.addGrade(100);
        fer.addGrade(80);
    }

    @DisplayName("Check data in Student object")
    @Test
     void testCreateStudent() {
        assertNull(ryan);
        assertNotNull(fer);
    }

    @Disabled("Dissable Test")
    @Test
     void testStudentFields() {
        assertEquals(1L, fer.getId());
        assertEquals("fer", fer.getName());
        assertEquals(2, fer.getGrades().size());
    }

    @Test
     void testAddGrade() {
        assertEquals(100, fer.getGrades().get(0));
        assertEquals(80, fer.getGrades().get(1));
    }

    @Test
     void testAverageGrade() {
        assertEquals(90, fer.getGradeAverage(), 0.01);
    }
}