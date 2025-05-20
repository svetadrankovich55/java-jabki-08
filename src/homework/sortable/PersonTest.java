package homework.sortable;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {
    @Test
    void testComparePositivePerson() {
        Person older = new Person(30);
        Person younger = new Person(20);
        assertTrue(older.compare(younger) > 0);
    }

    @Test
    void testCompareSamePerson() {
        Person person1 = new Person(25);
        Person person2 = new Person(25);
        assertEquals(0, person1.compare(person2));
    }

    @Test
    void testCompareNegativePerson() {
        Person younger = new Person(20);
        Person older = new Person(30);
        assertTrue(younger.compare(older) < 0);
    }

    @Test
    void testCompareThrowsException() {
        Person person = new Person(25);
        FileSize fileSize = new FileSize(1024);
        assertThrows(IllegalArgumentException.class, () -> person.compare(fileSize));
    }
}
