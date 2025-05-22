package homework.sortable;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SortableUtilsTest {

    @Test
    void testsSortFileSizeArray() {
        FileSize[] files = {
                new FileSize(2048),
                new FileSize(512),
                new FileSize(1024)
        };
        SortableUtils.sort(files);

        assertEquals(512, files[0].getSize());
        assertEquals(1024, files[1].getSize());
        assertEquals(2048, files[2].getSize());
    }

    @Test
    void testsSortPersonArray() {
        Person[] people = {
                new Person(30),
                new Person(20),
                new Person(25)
        };
        SortableUtils.sort(people);

        assertEquals(20, people[0].getAge());
        assertEquals(25, people[1].getAge());
        assertEquals(30, people[2].getAge());
    }
}